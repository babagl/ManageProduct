package com.example.springbootpart2;

import com.example.springbootpart2.Services.UserServices;
import com.example.springbootpart2.dto.UserDto;
import com.example.springbootpart2.model.Users;
import com.example.springbootpart2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPart2Application implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;



    UserServices userServices = new UserServices();

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPart2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Users users = new Users();
        users.setUsername("baba");
        users.setPassword("house");

        userRepository.save(users);

        UserDto userDto = new UserDto();
        userDto.setUsername("abdoulaye");
        userDto.setPassword("Sall");

        //userServices.save(userDto);
    }
}
