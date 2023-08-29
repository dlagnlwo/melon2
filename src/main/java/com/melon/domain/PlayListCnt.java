package com.melon.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name="playlist_cnt")
public class PlayListCnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="play_cnt")
    private int playCnt;
    private int songId;

//    // N:N
//    @OneToMany(mappedBy = "playlist_cnt")
//    private List<PlayListCntSong> playListCntSongs = new ArrayList<>();
}
