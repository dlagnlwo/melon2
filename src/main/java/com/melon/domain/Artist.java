package com.melon.domain;


import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.One;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    private String artistPro;

    @OneToMany(mappedBy = "artist")
    private List<Song> songs = new ArrayList<>();

    @OneToMany(mappedBy = "artist")
    private List<Like> likes = new ArrayList<>();
}
