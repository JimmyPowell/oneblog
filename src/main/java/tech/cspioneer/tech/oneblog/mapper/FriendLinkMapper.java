package tech.cspioneer.tech.oneblog.mapper;

import org.apache.ibatis.annotations.*;
import tech.cspioneer.tech.oneblog.DTO.FriendLinkDTO;

import java.util.List;

@Mapper
public interface FriendLinkMapper {
    @Insert("INSERT INTO friend_link(name,url,avatar,ranking) VALUES(#{name},#{url},#{avatar},#{ranking})")
    int addFriendLink(FriendLinkDTO friendLinkDTO);

    @Update("UPDATE friend_link SET name=#{name},url=#{url},avatar=#{avatar},ranking=#{ranking} WHERE id=#{id}")
    int updateFriendLink(FriendLinkDTO friendLinkDTO);

    @Delete("DELETE FROM friend_link WHERE id=#{id}")
    int deleteFriendLink(int id);

    @Select("SELECT * FROM friend_link WHERE id=#{id}")
    FriendLinkDTO getFriendLink(int id);

    @Select("SELECT * FROM friend_link")
    List<FriendLinkDTO> getFriendLinkList();
}
