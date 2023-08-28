package com.melon.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "genre")
    private List<Song> songs = new ArrayList<>();
}
