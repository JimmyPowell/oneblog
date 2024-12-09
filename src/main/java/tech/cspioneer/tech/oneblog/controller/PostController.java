package tech.cspioneer.tech.oneblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.cspioneer.tech.oneblog.DTO.PostDTO;
import tech.cspioneer.tech.oneblog.DTO.PostListDTO;
import tech.cspioneer.tech.oneblog.entity.HttpResponseEntity;
import tech.cspioneer.tech.oneblog.service.PostService;
import tech.cspioneer.tech.oneblog.utils.MarkdownToHtmlUtil;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping
    public ResponseEntity<HttpResponseEntity> addPost(@RequestBody PostDTO postdto){

        postService.addPost(postdto);

        return ResponseEntity.ok(new HttpResponseEntity(200, "null","add post success!"));

    }





    @DeleteMapping
    public int deletePost(@RequestBody PostDTO postdto){
        postService.deletePost(postdto);
        return 1;
    }

    @GetMapping
    public ResponseEntity<HttpResponseEntity> getPostHtml(@RequestParam int postId){
        //TODO：这里有点小问题，还是得改一下
        return ResponseEntity.ok(new HttpResponseEntity(200, postService.getPostHtml(postId),"get post success!"));
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
