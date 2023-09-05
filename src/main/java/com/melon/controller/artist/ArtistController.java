package com.melon.controller.artist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/artist")
public class ArtistController {

    /**
     * 가수 곡 조회
     * @author 임휘재
     */
    @GetMapping
    public String artist_song(){
        return "/artist/artist_song";
    }

    /**
     * 가수 앨범 조회
     * @author 임휘재
     */
    @GetMapping("/album")
    public String artist_album(){
        return "/artist/artist_album";
    }

    /**
     * 가수 상세 조회
     * @author 임휘재
     */
    @GetMapping("/detail")
    public String artist_detail(){
        return "/artist/artist_detail";
    }

}
