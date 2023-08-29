package com.melon.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "song")
    private List<PlayListNow> playListNows = new ArrayList<>();

    @OneToMany(mappedBy = "song")
    private List<PlayListCnt> playListCnts = new ArrayList<>();

    @OneToMany(mappedBy = "song")
    private List<PlayListRecente> playListRecentes = new ArrayList<>();

    @OneToMany(mappedBy = "song")
    private List<Like> likes = new ArrayList<>();

    //N:N
    @OneToMany(mappedBy = "song")
    private List<PlayListNowSong> playListNowSongs = new ArrayList<>();

    //N:N
    @OneToMany(mappedBy = "song")
    private List<PlayListCntSong> playListCntSongs = new ArrayList<>();

    //N:N
    @OneToMany(mappedBy = "song")
    private List<PlayListRecenteSong> playListRecenteSongs = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="albumId")
    private Album album;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="genreId")
    private Genre genre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="artistId")
    private Artist artist;
}
