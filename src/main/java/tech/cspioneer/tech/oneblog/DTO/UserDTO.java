package tech.cspioneer.tech.oneblog.DTO;

import lombok.Data;

@Data
public class UserDTO {
    private String name;
    private String password;
    private String email;
    private String phoneNumber;
    private String selfIntroduction;

}
