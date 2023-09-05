package com.melon.controller.album;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/album")
public class AlbumController {

    @GetMapping
    public String album_song(){
        return "/album/album_song";
    }

    @GetMapping("/detail")
    public String album_detail(){
        return "/album/album_detail";
    }

    @GetMapping("/comment")
    public String album_comment(){
        return "/album/album_comment";
    }

}
