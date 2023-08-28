package com.melon.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

// 최근 들은 재생 목록 테이블
@Entity
@Setter @Getter
@Table(name="playlist_recente")
public class PlayListRecente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String streamingTime;
    private int songName;
}
