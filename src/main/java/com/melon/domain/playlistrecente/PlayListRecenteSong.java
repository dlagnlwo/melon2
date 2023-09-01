package com.melon.domain.playlistrecente;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.melon.domain.song.Song;

@Entity
@Setter @Getter
public class PlayListRecenteSong {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "streamingTime")
    private PlayListRecente playListRecente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "songId")
    private Song song;
}
