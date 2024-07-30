package com.parttimestudy.studywork.infrastructure.db.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = "com.parttimestudy.studywork.infrastructure.db.entity")
@EnableJpaRepositories(basePackages = "com.parttimestudy.studywork.infrastructure.db.repository")
class CoreJpaConfig {

}
