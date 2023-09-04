package com.melon.controller.artist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/artist")
public class ArtistController {

    @GetMapping
    public String artist_song(){
        return "/artist/artist_song";
    }

    @GetMapping("/album")
    public String artist_album(){
        return "/artist/artist_album";
    }

    @GetMapping("/detail")
    public String artist_detail(){
        return "/artist/artist_detail";
    }

}
