package tech.cspioneer.tech.oneblog.service;

import tech.cspioneer.tech.oneblog.DTO.FriendLinkDTO;

import java.util.List;

public interface FriendLinkService {
    int addFriendLink(FriendLinkDTO friendLinkDTO);
    List<FriendLinkDTO> getFriendLinkList();
    int deleteFriendLink(int id);
    int updateFriendLink(FriendLinkDTO friendLinkDTO);
}
