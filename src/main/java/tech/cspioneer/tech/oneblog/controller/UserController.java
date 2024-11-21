package tech.cspioneer.tech.oneblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.cspioneer.tech.oneblog.DTO.UserDTO;
import tech.cspioneer.tech.oneblog.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/info")
    public int addUserInfo(@RequestBody UserDTO userDTO){
        System.out.println(userDTO.getPassword());
        userService.addUserInfo(userDTO);
        System.out.println("添加用户信息成功！");
        return 1;
    }
    @GetMapping("/info")
    public int getUserInfo(){
        return 1;
    }
    @PutMapping("/info")
    public int updateUserInfo(){
        return 1;
    }

}

