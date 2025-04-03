package com.biuld.agregadorinvestimentos.Service;

import java.time.Instant;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.biuld.agregadorinvestimentos.DTO.CreateUserDto;
import com.biuld.agregadorinvestimentos.Repository.UserRepository;
import com.biuld.agregadorinvestimentos.entity.User;


@Service
public class UserService {

    //Chamada do Repositório para aqui. 
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository; // Constructor do Repository
    }

    public UUID CreateUser(CreateUserDto createUserDto) {
        // Cria uma nova instância de User usando os dados do DTO
        User newUser = new User(
            UUID.randomUUID(),
            createUserDto.username(),
            createUserDto.email(),
            createUserDto.password(),
            Instant.now(),
            null // lastLogin é inicialmente nulo
        );
    
        // Salva o novo usuário no repositório
        User userSaved = userRepository.save(newUser);
    
        // Retorna o UUID do usuário salvo
        return userSaved.getUserId();
    }
    

}
