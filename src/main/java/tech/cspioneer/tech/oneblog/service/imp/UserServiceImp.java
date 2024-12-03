package tech.cspioneer.tech.oneblog.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.cspioneer.tech.oneblog.DTO.UserDTO;
import tech.cspioneer.tech.oneblog.mapper.UserMapper;
import tech.cspioneer.tech.oneblog.service.UserService;

@Service
 class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUserInfo(UserDTO userDTO) {
        userMapper.addUserInfo(userDTO);
        return 0;
    }

}
