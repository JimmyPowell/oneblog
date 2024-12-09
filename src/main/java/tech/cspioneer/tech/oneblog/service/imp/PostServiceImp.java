package tech.cspioneer.tech.oneblog.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.cspioneer.tech.oneblog.DTO.PostDTO;
import tech.cspioneer.tech.oneblog.DTO.PostListDTO;
import tech.cspioneer.tech.oneblog.mapper.PostMapper;
import tech.cspioneer.tech.oneblog.service.PostService;
import tech.cspioneer.tech.oneblog.utils.MarkdownToHtmlUtil;

import java.util.List;

@Service
public class PostServiceImp implements PostService {
    @Autowired
    private PostMapper postMapper;
    @Override
    public int addPost(PostDTO postdto) {
       postMapper.addPost(postdto);
      String html = MarkdownToHtmlUtil.convertMarkdownToHtml(postdto.getContent());
      postdto.setContent(html);
      postMapper.addPostHtml(postdto);
        return 1;
    }
    @Override
    public int deletePost(PostDTO postdto) {
        postMapper.deletePost(postdto.getPostId());
        return 0;
    }
    @Override
    public PostDTO getPost(PostDTO postdto) {
        return postMapper.getPost(postdto.getPostId());
    }

    @Override
    public PostDTO getPostHtml(int postId) {
        return postMapper.getPostHtml(postId);
    }


    @Override
    public int updatePost(PostDTO postdto) {
        postMapper.updatePost(postdto);
        return 1;
    }

    @Override
    public List<PostListDTO> getPostList() {
        return postMapper.getPostList();
    }

}
