package com.melon.domain.song;

import javax.persistence.*;

import com.melon.domain.album.Album;
import com.melon.domain.artist.Artist;
import com.melon.domain.genre.Genre;
import com.melon.domain.like.UserLike;

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
    private int songLike;

    @OneToOne
    @JoinColumn(name = "likeCnt")
    private UserLike userLike;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genreId")
    private Genre genre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "albumId")
    private Album album;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artistId")
    private Artist artist;

}
