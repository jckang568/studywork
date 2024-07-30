package com.parttimestudy.studywork.infrastructure.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column
    private String loginId;
    @Column
    private String password;
    @Column
    private String studyGoal;

    public User() {
    }

    public User(String loginId, String password, String studyGoal) {
        this.loginId = loginId;
        this.password = password;
        this.studyGoal = studyGoal;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getPassword() {
        return password;
    }

    public String getStudyGoal() {
        return studyGoal;
    }
}
