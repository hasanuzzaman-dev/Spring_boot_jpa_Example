package com.hasan.springbootjpaexample;

import com.hasan.springbootjpaexample.dao.UserRepository;
import com.hasan.springbootjpaexample.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJpaExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(SpringBootJpaExampleApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);


        User user = new User();
        user.setName("Hasib");
        user.setCity("Dhaka");
        user.setStatus("I am learning spring boot");

        User user1 = userRepository.save(user);
        System.out.println(user1.toString());
    }

}
