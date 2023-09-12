package com.melon.domain.nowchart;

import com.melon.domain.song.Song;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "now_chart")
public class nowChart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nowChartId;
    private int countChart;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "songId")
    private Song song;
}
