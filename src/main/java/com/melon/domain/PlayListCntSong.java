package com.melon.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class PlayListCntSong {
    @Id @GeneratedValue
    private Long id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "song_id")
//    private Song song;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "play_cnt")
//    private PlayListCnt playListCnt;
}
