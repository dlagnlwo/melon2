package com.melon.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// 댓글 테이블
@Entity
@Getter @Setter
@Table(name="comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;
    private String comment;
    private String commentDate;
    private String memberId;
    private int albumId;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "memberId")
//    private Member member;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "albumId")
//    private Album album;
}
