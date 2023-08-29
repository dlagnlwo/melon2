package com.melon.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class PlayListNowSong {
    // (playlistCd, songId)로 Primary Key를 선언할 수도 있지만,
    // 제약조건이 많아질 경우 독립적인 ID가 있는 것이
    // 유연하게 대처하기 좋기 때문에 별도의 ID를 만드는 것이 좋다.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playlistCd")
    private PlayListNow playListNow;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "songId")
    private Song song;
}
