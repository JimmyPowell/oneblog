package tech.cspioneer.tech.oneblog.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.cspioneer.tech.oneblog.DTO.UserDTO;
import tech.cspioneer.tech.oneblog.mapper.UserMapper;
import tech.cspioneer.tech.oneblog.service.AuthService;

@Service
public class AuthServiceImp implements AuthService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int login(String name, String password) {
        UserDTO userDTO = userMapper.getUserInfoByName(name);
        if (userDTO == null) {
            return -1;
        }
        if (!userDTO.getPassword().equals(password)) {
            return -1;
        }

        return 0;
    }
}
