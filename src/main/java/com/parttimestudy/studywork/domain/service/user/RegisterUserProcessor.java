package com.parttimestudy.studywork.domain.service.user;

import com.parttimestudy.studywork.domain.model.user.UserRegistrationRequestData;
import com.parttimestudy.studywork.infrastructure.db.entity.User;
import com.parttimestudy.studywork.infrastructure.db.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class RegisterUserProcessor {
    private final UserRepository userRepository;

    public RegisterUserProcessor(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(UserRegistrationRequestData userRegistrationRequestData) {
        User user = userRegistrationRequestData.toUserEntity();
        userRepository.save(user);
    }
}
