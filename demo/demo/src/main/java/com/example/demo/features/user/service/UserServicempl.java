package com.example.demo.features.user.service;

import com.example.demo.features.user.dto.UserDTOReceive;
import com.example.demo.features.user.dto.UserDTOResponce;
import com.example.demo.features.user.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServicempl implements UserSevice {
    private final UserRepository repository;

    public UserServicempl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDTOResponce registerUser(UserDTOResponce userDTOResponce) {
        if (repository.findByLogin(userDTOResponce.getLogin()) == null) {

        } else {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "User is already exist!");
        }
        return userDTOResponce;
    }

    @Override
    public UserDTOResponce authUser(UserDTOReceive userDTOReceive) {
        return null;
    }

    @Override
    public String deleteUser(Long id) {
        return null;
    }
}
