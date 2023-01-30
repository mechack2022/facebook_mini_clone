package com.fragile.facebookclone_springboot.service;

import com.fragile.facebookclone_springboot.entity.User;
import com.fragile.facebookclone_springboot.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {



    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    private User user;
//    @BeforeEach
//    void setUp(){
////        Department  department = Department.builder()
////                .departmentName("CSC")
////                .departmentAddress("CSC-200")
////                .departmentCode("201")
////                .departmentId(1L)
////                .build();
////        Mockito.when(departmentRespository.findByDepartmentNameIgnoreCase(department.getDepartmentName())).thenReturn(department);
////       public User(String firstName, String lastName, String username, String password)
//        User  user = new User("taiwo", "gboyegun","taiwo1","1234");
//        Mockito.when()
//
//
//    }

    @Test
    void createUser() {
         user = new User( "taiwo", "gboyegun","taiwo1","1234");
         userRepository.save(user);


    }

    @Test
    void findUserByUsernameAndPassword() {
        User  user = new User("taiwo", "gboyegun","taiwo1","1234");

    }

    @Test
    void findById() {
    }
}