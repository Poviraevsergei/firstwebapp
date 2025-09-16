package com.tms.service;

import com.tms.repository.UserRepository;

public class Validator {
    private final UserRepository userRepository;

    {
        userRepository = new UserRepository();
    }

    public boolean validateLoginPassword(String userLogin, String userPassword) {
        boolean isValid = userLogin != null
                && userPassword != null
                && !userLogin.isBlank()
                && !userPassword.isBlank()
                && userPassword.length() > 3
                && userRepository.isUserContains(userLogin);

        if (isValid) {
            String password = userRepository.getPassword(userLogin);
            return userPassword.equals(password);
        }
        return false;
    }
}
