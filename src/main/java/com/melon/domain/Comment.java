package com.melon.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
}
