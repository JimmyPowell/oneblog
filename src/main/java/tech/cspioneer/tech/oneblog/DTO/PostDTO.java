package tech.cspioneer.tech.oneblog.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class PostDTO {
    private int postId;
    private String title;
    private String content;
    private int type;
    private Date postDate;
    private Date latestUpdateTime;
    private String postExcerpt;
    private int postStatus;

}
