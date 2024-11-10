package com.projetoSpring.projetoSpring.Service;

import com.projetoSpring.projetoSpring.Entidades.User;
import com.projetoSpring.projetoSpring.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private final UserRepository repository;

    public UserService(UserRepository repository) {

        this.repository = repository;
    };


    public List<User>  findAll() {
        return repository.findAll();
    }

    public User findById(Long id ){
        Optional <User> user = repository.findById(id);
        return user.get();
    }

}
