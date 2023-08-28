package com.melon.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
    private String likeCd;
}
