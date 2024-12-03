package tech.cspioneer.tech.oneblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.cspioneer.tech.oneblog.entity.request.LoginRequest;
import tech.cspioneer.tech.oneblog.service.AuthService;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public int  login(@RequestBody LoginRequest loginRequest) {
        System.out.println(loginRequest.getName());
        System.out.println(loginRequest.getPassword());
        int status =authService.login(loginRequest.getName(), loginRequest.getPassword());
        return status;
    }


}
