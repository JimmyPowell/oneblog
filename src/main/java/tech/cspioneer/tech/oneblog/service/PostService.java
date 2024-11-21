package tech.cspioneer.tech.oneblog.service;

import tech.cspioneer.tech.oneblog.DTO.PostDTO;
import tech.cspioneer.tech.oneblog.DTO.PostListDTO;

import java.util.List;

public interface PostService {
    int addPost(PostDTO postDTO);
    int deletePost(PostDTO postDTO);
    PostDTO getPost(PostDTO postDTO);
    int updatePost(PostDTO postDTO);

    List<PostListDTO> getPostList();
}
