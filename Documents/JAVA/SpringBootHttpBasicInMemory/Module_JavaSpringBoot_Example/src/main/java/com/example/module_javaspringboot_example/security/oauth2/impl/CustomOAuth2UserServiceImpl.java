package com.example.module_javaspringboot_example.security.oauth2.impl;

import com.example.module_javaspringboot_example.security.oauth2.handler.UserRequest;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
public class CustomOAuth2UserServiceImpl extends DefaultOAuth2UserService {
    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2User user = super.loadUser(userRequest);
        UserRequest request = new UserRequest();
        request.setClientName(userRequest.getClientRegistration().getClientName());
        request.setAccessToken(userRequest.getAccessToken().getTokenValue());
        request.setTokenType(String.valueOf(userRequest.getAccessToken().getTokenType()));

        return new CustomOAuth2UserImpl(user,request);
    }
}
