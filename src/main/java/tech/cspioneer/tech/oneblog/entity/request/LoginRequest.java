package tech.cspioneer.tech.oneblog.entity.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String name;
    private String password;
}
