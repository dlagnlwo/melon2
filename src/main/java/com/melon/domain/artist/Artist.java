package com.melon.domain.artist;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

import com.melon.domain.like.UserLike;

// 가수 테이블
@Entity
@Setter @Getter
@Table(name = "artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artistId;
    private String artistName;
    private String debut;
    private String agency;
    @Column(name = "artist_group")
    private String artistGroup; // SQL 예약어로 인해 group을 사용할 수 없음 테이블명 변경필
    private String artistPro;
    private int artistLike;
    @Lob
    private byte[] artistFile;

    @OneToOne
    @JoinColumn(name = "likeCnt")
    private UserLike userLike;
}
