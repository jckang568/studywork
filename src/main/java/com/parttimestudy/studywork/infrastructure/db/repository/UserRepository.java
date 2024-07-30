package com.parttimestudy.studywork.infrastructure.db.repository;


import com.parttimestudy.studywork.infrastructure.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
