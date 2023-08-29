package com.melon.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// 앨범 테이블
@Entity
@Getter @Setter
@Table(name="album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int albumId;
    private String albumPro;
    private String releaseDate;
    @Lob
    private byte[] albumImg;
    private String albumType;
    private String albumName;
    private int likeCnt;

//    @OneToMany(mappedBy = "album")
//    private List<Comment> comments = new ArrayList<>();
//
//    @OneToMany(mappedBy = "album")
//    private List<Song> songs = new ArrayList<>();
//
//    @OneToMany(mappedBy = "album")
//    private List<Like> likes = new ArrayList<>();
}
