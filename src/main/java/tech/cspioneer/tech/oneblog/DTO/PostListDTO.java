package tech.cspioneer.tech.oneblog.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class PostListDTO {
    private int postId;
    private String title;
    private String postExcerpt;
    private Date postDate;
    private Date latestUpdateDate;
}
