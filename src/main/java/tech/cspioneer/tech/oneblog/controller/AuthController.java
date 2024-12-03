package tech.cspioneer.tech.oneblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.cspioneer.tech.oneblog.DTO.TokenDTO;
import tech.cspioneer.tech.oneblog.entity.HttpResponseEntity;
import tech.cspioneer.tech.oneblog.entity.request.LoginRequest;
import tech.cspioneer.tech.oneblog.service.AuthService;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<HttpResponseEntity> login(@RequestBody LoginRequest loginRequest) {
        System.out.println(loginRequest.getName());
        System.out.println(loginRequest.getPassword());
        int status =authService.login(loginRequest.getName(), loginRequest.getPassword());
        if (status == 0) {
            TokenDTO TokenDTO = new TokenDTO();
            TokenDTO.setAccessToken("refresh_token");
            TokenDTO.setRefreshToken("access_token");
            return ResponseEntity.ok(new HttpResponseEntity(200, TokenDTO,"login success!"));
        } else {
            return ResponseEntity.ok(new HttpResponseEntity(403, "null","username or password error!"));
        }
    }


}
