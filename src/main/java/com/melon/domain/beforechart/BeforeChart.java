package com.melon.domain.beforechart;


import com.melon.domain.song.Song;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "before_chart")
public class BeforeChart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int beforeChartId;
    private int chartCount;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "songId")
    private Song song;
}
