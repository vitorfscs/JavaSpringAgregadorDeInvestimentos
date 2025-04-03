package com.biuld.agregadorinvestimentos.Controller;

import java.net.URI;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biuld.agregadorinvestimentos.DTO.CreateUserDto;
import com.biuld.agregadorinvestimentos.Service.UserService;
import com.biuld.agregadorinvestimentos.entity.User;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping 
    
    /* Criação de usuários  */
 public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto) {
    UUID userId = userService.CreateUser(createUserDto);

    // Construct the URI correctly
    URI location = URI.create("/v1/user/" + userId.toString());

    return ResponseEntity.created(location).build();
}


    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId){
        return null;
    }
    
}
