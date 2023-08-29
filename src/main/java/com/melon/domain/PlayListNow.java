package com.melon.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

// 현재 재생 목록 테이블
@Entity
@Getter @Setter
@Table(name="playlist_now")
public class PlayListNow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playlistCd;
    private String memberId;
    private int songId;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="memberId")
//    private Member member;
//
//    @OneToMany(mappedBy = "playlist_now")
//    private List<PlayListNowSong> playListNowSongs = new ArrayList<>();

}
