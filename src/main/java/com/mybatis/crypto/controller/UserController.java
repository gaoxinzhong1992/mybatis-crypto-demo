package com.mybatis.crypto.controller;

import com.mybatis.crypto.entity.User;
import com.mybatis.crypto.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 *
 * @author gaoxinzhong
 * @date 2022/2/14 14:12
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(value = "/list")
    public List<User> list() {
        return userService.list();
    }

    @PostMapping(value = "/save")
    public boolean save(@RequestBody User user) {
        return userService.save(user);
    }
}
