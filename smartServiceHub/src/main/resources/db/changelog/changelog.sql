--liquibase formatted sql
-- changeset postgres:1
--preconditions onFail:MARK_RAN onError:HALT
--precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables WHERE table_name = 'users';
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(255) NOT NULL
);
--rollback DROP TABLE users;
-- changeset postgres:2
INSERT INTO users (name, email, password, role) VALUES ('salim', 'salim.ahm01@gmail.com','123456','ADMIN');
--rollback DELETE FROM users WHERE name = 'salim';
-- changeset postgres:3
INSERT INTO users (name, email, password, role) VALUES ('ahmed', 'ahm@gmail.com','123456','CLIENT');
--rollback DELETE FROM users WHERE name = 'ahmed';
