package com.parttimestudy.studywork.api.controller.v1.request;

import com.parttimestudy.studywork.api.domain.user.UserData;

public record UserRegistrationRequestDTO(
        String userName
        , String loginId
        , String password
        , String studyGoal) {
    /*public UserData toUserData() {

    }*/
}
