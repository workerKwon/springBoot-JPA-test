package com.example.test.repository;

import com.example.test.TestApplicationTests;
import com.example.test.model.entity.User;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserRepositoryTest extends TestApplicationTests {

    @Autowired
    private UserRepository userRepository;
//    @Test
//    public void insert(){
//        User user = new User();
//        user.setUserName("K.TaeIl");
//        user.setPhoneNumber("010-1234-1234");
//
//        userRepository.save(user);
//    }

//    @Test
//    public void read(){
//        Optional<User> user = userRepository.findById(1L);
//
//        user.ifPresent(selectUser -> {
//            System.out.println(selectUser);
//        });
//    }

//    @Test
//    public void update(){
//        Optional<User> user = userRepository.findById(1L);
//
//        user.ifPresent(selectedUser ->{
//            selectedUser.setUserName("TestName");
//            selectedUser.setPhoneNumber("010-0000-9999");
//            userRepository.save(selectedUser);
//        });
//
//        System.out.println(user);
//    }

    @Test
    public void delete(){
        Optional<User> user = userRepository.findById(1L);

        user.ifPresent(selectedUser -> {
            userRepository.delete(selectedUser);
        });
    }


}
