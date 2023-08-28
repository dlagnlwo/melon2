package com.melon.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="playlist_cnt")
public class PlayListCnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playCnt;
    private int songId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="songId")
    private Song song;
}
