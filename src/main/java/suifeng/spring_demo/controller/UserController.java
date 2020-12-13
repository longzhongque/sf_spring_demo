package suifeng.spring_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import suifeng.spring_demo.model.entity.User;
import suifeng.spring_demo.model.request.LoginRequest;
import suifeng.spring_demo.service.UserService;
import suifeng.spring_demo.utils.JsonData;

import java.util.Map;

@RestController
@RequestMapping("sf/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 登录
     * @return token
     */
    @PostMapping("login")
    public JsonData login(@RequestBody LoginRequest loginRequest){
        String token = userService.findByPhonePwd(loginRequest.getPhone(),loginRequest.getPwd());
        return token == null ?JsonData.buildError("失败") : JsonData.buildSuccess(token);
    }

    @GetMapping("findById")
    public User findById(@RequestParam int id){
        User user = userService.findById(id);
        return user;
    }
    @GetMapping("listOrder")
    public User listOrder(int id){
        User user= userService.queryUserOrder(id);
        return user;
    }

    @PostMapping("register")
    public Integer register(@RequestBody Map<String, String> userInfo){
        return userService.save(userInfo);
    }


}
