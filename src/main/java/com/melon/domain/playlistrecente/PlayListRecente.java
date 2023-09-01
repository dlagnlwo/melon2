package com.melon.domain.playlistrecente;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// 최근 들은 재생 목록 테이블
@Entity
@Setter @Getter
@Table(name="playlist_recente")
public class PlayListRecente {
    @Id
    private LocalDateTime streamingTime;
}
