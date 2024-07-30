package com.parttimestudy.studywork.api.core.v1.request;

import com.parttimestudy.studywork.domain.model.user.UserRegistrationRequestData;

public record UserRegistrationRequestDTO(
        String userName
        , String loginId
        , String password
        , String studyGoal) {
    public UserRegistrationRequestData toUserRegistrationRequestData() {
        return new UserRegistrationRequestData(
                userName
                , loginId
                , password
                , studyGoal
        );
    }
}
