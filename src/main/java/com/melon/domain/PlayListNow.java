package com.melon.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
}
