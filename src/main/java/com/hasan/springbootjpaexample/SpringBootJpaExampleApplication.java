package com.hasan.springbootjpaexample;

import com.hasan.springbootjpaexample.dao.UserRepository;
import com.hasan.springbootjpaexample.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringBootJpaExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(SpringBootJpaExampleApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);


/*        User user1 = new User();
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

        System.out.println("done");*/

        // update thee user by id

        /*Optional<User> optional = userRepository.findById(3);
        User user = optional.get();
        user.setName("Hreday Sagar");
        User result = userRepository.save(user);
        System.out.println(result);*/

        Iterable<User> userIterable = userRepository.findAll();
        userIterable.forEach(user-> {
            System.out.println(user);
        });


    }

}
