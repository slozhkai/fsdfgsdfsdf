package com.example.demo.features.user.controller;

import com.example.demo.features.user.service.UserSevice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/server")
public class UserController {
    private final UserSevice userSevice;

    public UserController(UserSevice userSevice) {
        this.userSevice = userSevice;
    }
}
