package com.parttimestudy.studywork.application.facade;

import com.parttimestudy.studywork.domain.model.UserRegistrationRequestData;
import com.parttimestudy.studywork.domain.service.RegisterUserProcessor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserFacade {

    private final RegisterUserProcessor registerUserProcessor;

    public UserFacade(RegisterUserProcessor registerUserProcessor) {
        this.registerUserProcessor = registerUserProcessor;
    }


    @Transactional
    public void registerUser(UserRegistrationRequestData userRegistrationRequestData) {
        registerUserProcessor.register(userRegistrationRequestData);
    }
}
