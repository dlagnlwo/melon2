package com.melon.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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

    @OneToOne
    @JoinColumn(name = "songId")
    private Song song;

    @OneToOne
    @JoinColumn(name = "albumId")
    private Album album;

    @OneToOne
    @JoinColumn(name = "artistId")
    private Artist artist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId")
    private Member member;
}