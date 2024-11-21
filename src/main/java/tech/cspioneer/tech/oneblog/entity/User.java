package tech.cspioneer.tech.oneblog.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String password;
    private String email;
    private String phoneNmuber;
    private String selfIntroduction;

}
