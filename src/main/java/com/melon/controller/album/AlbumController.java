package com.melon.controller.album;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/album")
public class AlbumController {

    /**
     * 앨범 수록곡 조회
     * @author 임휘재
     */
    @GetMapping
    public String album_song(){
        return "/album/album_song";
    }

    /**
     * 앨범상세 조회
     * @author 임휘재
     */
    @GetMapping("/detail")
    public String album_detail(){
        return "/album/album_detail";
    }

    /**
     * 앨범 댓글 조회
     * @author 임휘재
     */
    @GetMapping("/comment")
    public String album_comment(){
        return "/album/album_comment";
    }

}
