package com.melon.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// 좋아요 테이블
@Entity
@Getter @Setter
@Table(name="like")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int likeCnt;
    private int songId;
    private int albumId;
    private int artistId;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "songId")
//    private Song song;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "albumId")
//    private Album album;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "artistId")
//    private Artist artist;
}
