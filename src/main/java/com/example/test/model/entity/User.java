package com.example.test.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id // entity의 primary key를 지정하는 annotation
    @GeneratedValue(strategy = GenerationType.IDENTITY) // primary key에 대한 생성 전략을 지정하는 annotation, Id annotation과 함께 entity의 primary key에 적용될 수 있다.
    private Long userId;
    private String userName;
    private String phoneNumber;
}
