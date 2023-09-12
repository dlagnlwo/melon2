package com.melon.dto.comment;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentReadDto {

    private int albumId;
    private int commentId;
    private String commentDetail; // 댓글 내용
    private LocalDateTime commentDate; // 댓글 작성 일자
    private String nick; // 작성자 닉네임
}
