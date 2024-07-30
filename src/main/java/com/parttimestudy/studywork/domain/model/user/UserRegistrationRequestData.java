package com.parttimestudy.studywork.domain.model.user;

import com.parttimestudy.studywork.infrastructure.db.entity.User;

public record UserRegistrationRequestData(
        String userName
        , String loginId
        , String password
        , String studyGoal) {
    public User toUserEntity() {
        return new User(
                this.loginId
                , this.password
                , this.studyGoal
        );
    }
}
