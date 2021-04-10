package com.vasudha.springcassandra.controller;

import com.vasudha.springcassandra.model.*;
import com.vasudha.springcassandra.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public void saveUser(@RequestBody UserDataRequest userDataRequest) {
        userService.saveUser(userDataRequest);
    }
}
