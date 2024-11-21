package tech.cspioneer.tech.oneblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.cspioneer.tech.oneblog.DTO.PostDTO;
import tech.cspioneer.tech.oneblog.DTO.PostListDTO;
import tech.cspioneer.tech.oneblog.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping
    public int addPost(@RequestBody PostDTO postdto){
        System.out.println(postdto.getTitle());
         System.out.println(postdto.getContent());
        postService.addPost(postdto);
        return 1;
    }
    @DeleteMapping
    public int deletePost(@RequestBody PostDTO postdto){
        postService.deletePost(postdto);
        return 1;
    }
    @GetMapping
    public PostDTO getPost(@RequestBody PostDTO postdto){

        return postService.getPost(postdto);
    }
    @GetMapping("/list")
    public List<PostListDTO> getPostList(){

        return postService.getPostList();
    }
    @PutMapping
    public int updatePost(@RequestBody PostDTO postdto){
        postService.updatePost(postdto);
        return 1;
    }
}
