package com.melon.domain.timeviews;

import com.melon.domain.song.Song;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@Table(name = "time_views")
public class TimeViews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int timeViewId;
    private LocalDateTime addTime;
    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "songId")
    private Song song;
}
