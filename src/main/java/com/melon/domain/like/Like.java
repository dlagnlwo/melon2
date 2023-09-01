package com.melon.domain.like;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.melon.domain.album.Album;
import com.melon.domain.artist.Artist;
import com.melon.domain.song.Song;

// 좋아요 테이블
@Entity
@Getter @Setter
@Table(name="user_like")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int likeCnt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "songId")
    private Song song;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "albumId")
    private Album album;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artistId")
    private Artist artist;
}
