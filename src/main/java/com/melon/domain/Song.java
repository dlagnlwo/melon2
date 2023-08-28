package com.melon.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// 노래 테이블
@Entity
@Setter @Getter
@Table(name="song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int songId;
    private String songName;
    @Column(length = 1)
    private String title;
    @Lob
    private byte[] songFile;
    private String playTime;
    private String lyrics;
    private int playCount;
    private int genreId;
    private int albumId;
    private int artistId;
}
