package com.melon.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    private String group;
}
