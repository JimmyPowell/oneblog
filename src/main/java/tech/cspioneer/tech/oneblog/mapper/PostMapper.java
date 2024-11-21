package tech.cspioneer.tech.oneblog.mapper;

import org.apache.ibatis.annotations.*;
import tech.cspioneer.tech.oneblog.DTO.PostDTO;
import tech.cspioneer.tech.oneblog.DTO.PostListDTO;
import tech.cspioneer.tech.oneblog.DTO.UserDTO;

import java.util.List;

@Mapper
public interface PostMapper {
    @Insert("INSERT INTO post(title,content,type,post_excerpt,post_status)VALUES (#{title},#{content},#{type},#{postExcerpt},#{postStatus})")
    int addPost(PostDTO postdto);
    @Delete("DELETE FROM post WHERE id = #{postId}")
    int deletePost(int postId);
    @Select("SELECT * FROM post WHERE id = #{postId}")
    @Results({
        @Result(column = "post_date", property = "postDate"),
        @Result(column = "latest_update_time", property = "latestUpdateTime"),
        @Result(column = "post_status", property = "postStatus"),
        @Result(column="post_excerpt",property = "postExcerpt"),
        @Result(column = "id",property = "postId")
    })
    PostDTO getPost(int postId);

    @Select("SELECT id,title, post_excerpt,post_date,latest_update_date FROM post")
    @Results({
            @Result(column = "id", property = "postId"),
            @Result(column = "post_excerpt", property = "postExcerpt"),
            @Result(column = "latest_update_date", property = "latestUpdateDate"),
            @Result(column = "post_date", property = "postDate"),
    })
    List<PostListDTO> getPostList();

    @Update("UPDATE post SET title = #{title},content = #{content},type = #{type},post_excerpt = #{postExcerpt},post_status = #{postStatus} WHERE id = #{postId}")
    int updatePost(PostDTO postdto);
}
