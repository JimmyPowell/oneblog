package tech.cspioneer.tech.oneblog.entity;

import lombok.Data;

@Data
public class FriendLink {
    private int id;
    private String name;
    private String url;
    //private String description;
    private String avatar;
    private int ranking;
}
