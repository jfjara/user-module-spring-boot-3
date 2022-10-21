package com.jfjara.usermodule.infraestructure.spring.controller;

import com.jfjara.usermodule.application.GetUserUseCase;
import com.jfjara.usermodule.infraestructure.spring.mapper.UserApiMapper;
import com.jfjara.usermodule.infraestructure.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private GetUserUseCase getUserUseCase;

    @Autowired
    private UserApiMapper userMapper;

    @GetMapping("/{username}")
    public User get(@PathVariable String username) {
        return userMapper.toApiModel(getUserUseCase.execute(username));
    }

}
