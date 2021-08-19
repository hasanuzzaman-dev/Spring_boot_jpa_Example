package com.hasan.springbootjpaexample;

import com.hasan.springbootjpaexample.dao.UserRepository;
import com.hasan.springbootjpaexample.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJpaExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(SpringBootJpaExampleApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);


        User user1 = new User();
        user1.setName("hasan");
        user1.setCity("Dhaka");
        user1.setStatus("I am learning spring boot");

        User user2 = new User();
        user2.setName("Hreday");
        user2.setCity("Faridpur");
        user2.setStatus("I am learning Flutter");

        List<User> users = List.of(user1,user2);
        Iterable<User> result = userRepository.saveAll(users);

        result.forEach(user -> {
            System.out.println(user);
        });

        System.out.println("done");


    }

}
