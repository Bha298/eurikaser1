package com.controller;

import com.Vo.ResponseTemplateVO;
import com.entity.User;
import com.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/use")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User save(@RequestBody User user){
        log.info("Inside save user");
        return userService.save(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUser(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUser(userId);
    }
}
