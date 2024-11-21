package tech.cspioneer.tech.oneblog.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Post {
    private int id;
    private String title;
    private String content;
    private int type;
    private Date postDate;
    private String postExcerpt;
    private int post_status;

}
