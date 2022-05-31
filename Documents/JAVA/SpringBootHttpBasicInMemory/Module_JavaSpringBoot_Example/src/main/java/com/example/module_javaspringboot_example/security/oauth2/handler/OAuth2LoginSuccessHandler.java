package com.example.module_javaspringboot_example.security.oauth2.handler;

import com.example.module_javaspringboot_example.config.AuthProvider;
import com.example.module_javaspringboot_example.entities.RoleEntity;
import com.example.module_javaspringboot_example.entities.UserEntity;
import com.example.module_javaspringboot_example.repository.IRoleRepository;
import com.example.module_javaspringboot_example.repository.IUserRepository;
import com.example.module_javaspringboot_example.security.oauth2.impl.CustomOAuth2UserImpl;
import com.example.module_javaspringboot_example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class OAuth2LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    @Autowired
    IUserRepository iUserRepository;
    @Autowired
    IRoleRepository iRoleRepository;
    @Autowired
    UserServiceImpl userService;
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        CustomOAuth2UserImpl customOAuth2User = (CustomOAuth2UserImpl) authentication.getPrincipal();

        String email = customOAuth2User.getEmail();
        String username = customOAuth2User.getName();
        String clientName = customOAuth2User.getClientName();
        String idClient = customOAuth2User.getID();
        String accessToken = customOAuth2User.getAccessToken();
        String tokenType = customOAuth2User.getTokenType();


        UserEntity userEntity = iUserRepository.findByEmail(email);

        AuthProvider authProvider = null;
        if (clientName.equals("Facebook")){
            authProvider = AuthProvider.FACEBOOK;
        }else if (clientName.equals("Google")){
            authProvider = AuthProvider.GOOGLE;
        }else {
            authProvider = AuthProvider.LOCAL;
        }
        HttpSession session = request.getSession();
        if (session.getAttribute("userLogin") == null){
            session.setAttribute("userLogin",userEntity);
        }

        RoleEntity roleEntity = iRoleRepository.getById(2L);
        List<RoleEntity> listRole = new ArrayList<>();
        listRole.add(roleEntity);

        if (userEntity == null){
            UserEntity newUser = new UserEntity();
            newUser.setId(null);
            newUser.setUsername(username);
            newUser.setEmail(email);
            newUser.setEnabled(true);
            newUser.setAuthProvider(authProvider);
            newUser.setRoleEntityList(listRole);
            userService.saveOrUpdateUser(newUser);
        }else {
            userEntity.setAuthProvider(authProvider);
            userEntity.setUsername(username);
            userEntity.setEmail(email);
            userService.saveOrUpdateUser(userEntity);
        }

        request.getRequestDispatcher("/home").forward(request,response);
    }
}
