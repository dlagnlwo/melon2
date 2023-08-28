package com.melon.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// 장르 테이블
@Entity
@Getter @Setter
@Table(name = "genre")
public class Genre {
    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int genreId;
    private String genreName;
}
