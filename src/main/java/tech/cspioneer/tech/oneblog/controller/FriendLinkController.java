package tech.cspioneer.tech.oneblog.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.cspioneer.tech.oneblog.DTO.FriendLinkDTO;
import tech.cspioneer.tech.oneblog.service.FriendLinkService;

import java.util.List;

@RestController
@RequestMapping("/friendlink")
public class FriendLinkController {
    @Autowired
    private FriendLinkService friendLinkService;

    @PostMapping
    public int addFriendLink(@RequestBody FriendLinkDTO friendLinkDTO) {
        friendLinkService.addFriendLink(friendLinkDTO);
        return 1;
    }
//    @GetMapping
//    public int getFriendLink() {
//        return 0;
//    }
    @GetMapping("/list")
    public List<FriendLinkDTO> listFriendLinkList() {

        return friendLinkService.getFriendLinkList();

    }
    @PutMapping
    public int updateFriendLink(@RequestBody FriendLinkDTO friendLinkDTO) {
        friendLinkService.updateFriendLink(friendLinkDTO);
        return 0;
    }
    @DeleteMapping("/")
    //不加“/”会报错，一会儿再看看
    public int deleteFriendLink(@RequestParam("id") int id) {
        friendLinkService.deleteFriendLink(id);
        return 0;
    }

}
