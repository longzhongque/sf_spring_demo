package suifeng.spring_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import suifeng.spring_demo.model.entity.User;
import suifeng.spring_demo.service.UserService;

import java.util.Map;

@RestController
@RequestMapping("sf/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("findById")
    public User findById(int id){
        User user = userService.findById(id);
        return user;
    }

    @PostMapping("register")
    public Integer register(@RequestBody Map<String, String> userInfo){
        return userService.save(userInfo);
    }
}
