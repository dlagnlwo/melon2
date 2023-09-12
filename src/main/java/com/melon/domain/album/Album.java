package com.melon.domain.album;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.melon.domain.like.UserLike;

import java.util.ArrayList;
import java.util.List;

// 앨범 테이블
@Entity
@Getter @Setter
@Table(name="album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer albumId;
    private String albumPro;
    private String releaseDate;
    @Lob
    private byte[] albumImg;
    private String albumType;
    private String albumName;
    private Integer albumLike;
    private String albumPublisher;
    private String albumAgency;
//    private String albumGenre;

    @OneToOne
    @JoinColumn(name = "likeCnt")
    private UserLike userLike;

}
