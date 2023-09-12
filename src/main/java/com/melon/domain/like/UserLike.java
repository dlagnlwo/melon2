package com.melon.domain.like;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.melon.domain.album.Album;
import com.melon.domain.artist.Artist;
import com.melon.domain.member.Member;
import com.melon.domain.song.Song;

import java.util.ArrayList;
import java.util.List;

// 좋아요 테이블
@Entity
@Getter @Setter
@Table(name="user_like")
public class UserLike {
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId")
    private Member member;
}