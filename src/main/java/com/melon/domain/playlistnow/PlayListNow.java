package com.melon.domain.playlistnow;

import javax.persistence.*;

import com.melon.domain.member.Member;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId")
    private Member member;
}
