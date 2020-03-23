This is practice project that used SpringBoot and MySQL(Community version) and JPA

Change the code of UserRepositoryTest.java in src/test package.

I made the schema and table using MySQL Workbench.

The table's name is user. and The table's create query is
```
CREATE TABLE user (
    `user_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `user_name` VARCHAR(45) NOT NULL,
    `phone_number` VARCHAR(45) NULL DEFAULT NULL,
    PRIMARY KEY (`user_id`));
```

The spring-boot and mysql connection settings are in application.properties
