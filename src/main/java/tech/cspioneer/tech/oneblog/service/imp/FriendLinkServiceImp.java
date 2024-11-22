package tech.cspioneer.tech.oneblog.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.cspioneer.tech.oneblog.DTO.FriendLinkDTO;
import tech.cspioneer.tech.oneblog.mapper.FriendLinkMapper;
import tech.cspioneer.tech.oneblog.service.FriendLinkService;

import java.util.List;

@Service
public class FriendLinkServiceImp implements FriendLinkService {
    @Autowired
    private FriendLinkMapper friendLinkMapper;

    @Override
    public int addFriendLink(FriendLinkDTO friendLinkDTO) {
        friendLinkMapper.addFriendLink(friendLinkDTO);
        return 0;
    }

    @Override
    public List<FriendLinkDTO> getFriendLinkList() {
        return friendLinkMapper.getFriendLinkList();
    }

    //不加public 就会报错，一会儿再看看
    @Override
    public int deleteFriendLink(int id) {
        return friendLinkMapper.deleteFriendLink(id);
    }
    @Override
    public int updateFriendLink(FriendLinkDTO friendLinkDTO) {
        friendLinkMapper.updateFriendLink(friendLinkDTO);
        return 0;

    }

}
