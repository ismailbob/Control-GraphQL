package com.example.examqraphql;

import com.example.examqraphql.entities.User;
import com.example.examqraphql.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ExamQraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamQraphQlApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public CommandLineRunner start(UserRepository userrepository){
        return args -> {
            userrepository.saveAll(List.of(
                    User.builder().name("ismail1").email("ismail1@gmail.com").password("qwr").dateNaissance("20/12/2001").build(),
                    User.builder().name("ismail2").email("ismail2@gmail.com").password("qwert").dateNaissance("23/12/2001").build(),
                    User.builder().name("ismail3").email("ismail3@gmail.com").password("qwertz").dateNaissance("24/12/2001").build(),
                    User.builder().name("ismail4").email("ismail4@gmail.com").password("qwertzu").dateNaissance("25/12/2001").build()
            ));
        };
    }
}
