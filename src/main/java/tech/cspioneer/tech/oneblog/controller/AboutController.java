package tech.cspioneer.tech.oneblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
public class AboutController {
    @RequestMapping("/me")
    public String aboutMe(){
        return "Hello, I am a programmer";
    }

}
