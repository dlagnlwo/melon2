package com.melon.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name="playlist_cnt")
public class PlayListCnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playCnt;
}
