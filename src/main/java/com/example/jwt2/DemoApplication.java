package com.example.jwt2;

import com.example.jwt2.model.User;
import com.example.jwt2.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    @Bean
    public CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {

            List<User> users = Stream.of(
                    new User(1L, "Alex", "1111", "alex@mail.ru"),
                    new User(2L, "Tom", "1111", "tom@mail.ru"),
                    new User(3L, "Jack", "1111", "jack@mail.ru")
            ).collect(Collectors.toList());

            repository.saveAll(users);

//            repository.saveAll(List.of(
//                    new User(1L, "Alex", "1111", "alex@mail.ru"),
//                    new User(2L, "Tom", "1111", "tom@mail.ru"),
//                    new User(3L, "Jack", "1111", "jack@mail.ru")
//            ));

        };
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
