package com.example.module_javaspringboot_example.security.local.handler;

import com.example.module_javaspringboot_example.entities.UserEntity;
import com.example.module_javaspringboot_example.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    @Autowired
    IUserRepository iUserRepository;
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        List<SimpleGrantedAuthority> roleEntities = (List<SimpleGrantedAuthority>) authentication.getAuthorities();

        String username = request.getParameter("email");
        UserEntity userEntity = iUserRepository.findByEmail(username);

        HttpSession session = request.getSession();
        if (session.getAttribute("userLogin") == null){
            session.setAttribute("userLogin",userEntity);
        }

        request.setAttribute("userLogin", userEntity);
        for (SimpleGrantedAuthority simple : roleEntities) {
            if (simple.getAuthority().equals("ROLE_ADMIN")) {
                response.sendRedirect("/admin/list-product");
            }else if (simple.getAuthority().equals("ROLE_USER")){
                response.sendRedirect("/home");
            }
        }
    }
}
