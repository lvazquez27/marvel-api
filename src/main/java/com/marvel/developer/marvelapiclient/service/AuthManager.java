package com.marvel.developer.marvelapiclient.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Service
public class AuthManager {

    Map<String, String> usersMap;
    {
        usersMap = new HashMap<>();
        this.usersMap.put("admin","admin123");
        this.usersMap.put("user","user123");
    }

    public void authenticateRequest(String basicToken){
        if (basicToken==null || basicToken.isBlank()){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Bad Credentials");
        }
        String[] loginUserInfo = this.getUserDataFromBasicToken(basicToken);
        String username = loginUserInfo[0];
        String password = loginUserInfo[1];
        if (!usersMap.containsKey(username)){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Bad Credentials");
        }
        String currentPassword = usersMap.get(username);
        if (!currentPassword.equals(password)){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"Bad Credentials");
        }
    }

    public String[] getUserDataFromBasicToken(String basicToken){
        String base64UserInfo = basicToken.replace("Basic ", "");
        byte[] decodedBytes = Base64.getDecoder().decode(base64UserInfo);
        String decodedString = new String(decodedBytes);
        return decodedString.split(":");
    }
}
