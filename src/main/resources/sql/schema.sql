CREATE TABLE users
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_name   VARCHAR(255)        NOT NULL,
    login_id   VARCHAR(255) UNIQUE NOT NULL,
    password   VARCHAR(255)        NOT NULL,
    study_goal VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE challenges
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(255)   NOT NULL,
    min_deposit DECIMAL(15, 2) NOT NULL,
    max_deposit DECIMAL(15, 2) NOT NULL,
    status      VARCHAR(50)    NOT NULL,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE orders
(
    id             BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id        BIGINT         NOT NULL,
    challenge_id   BIGINT         NOT NULL,
    challenge_name VARCHAR(255)   NOT NULL,
    deposit        DECIMAL(15, 2) NOT NULL,
    start_date     DATE           NOT NULL,
    study_hours    INT            NOT NULL,
    created_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users (id),
    CONSTRAINT fk_challenge FOREIGN KEY (challenge_id) REFERENCES challenges (id)
);
