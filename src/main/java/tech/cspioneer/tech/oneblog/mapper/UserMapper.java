package tech.cspioneer.tech.oneblog.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import tech.cspioneer.tech.oneblog.DTO.UserDTO;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user(name,password,email,phone_number,self_introduction) VALUES(#{name},#{password},#{email},#{phoneNumber},#{selfIntroduction})")
    int addUserInfo(UserDTO userDTO);
}
