package com.parttimestudy.studywork.api.domain.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserRegistrationResult addNewUser(UserData userData) {
        // TODO: database 통신
        return new UserRegistrationResult(userData.name());
    }
}
