package com.kaimuellercode.securitydemo.service;

import com.kaimuellercode.securitydemo.Entities.UserEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {

    private static final String EXISTING_EMAIL = "test@test.com";

    public Optional<UserEntity> findByEmail(String email){
        //TODO Move this to a Database
        if (! EXISTING_EMAIL.equalsIgnoreCase(email)) return Optional.empty();

        var user = new UserEntity();
        user.setId(1L);
        user.setEmail(EXISTING_EMAIL);
        user.setPassword("$2a$12$y7ti2x5hrRaUvTaZzFDTQuzDVvBouW7TBvHCSJ.4vXhr5ieubem4G"); // = test;
        user.setRole("ROLE_ADMIN");
        user.setExtraInfo("Is the best admin");

        return Optional.of(user);
    }
}
