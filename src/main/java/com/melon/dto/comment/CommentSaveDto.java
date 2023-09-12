package com.melon.dto.comment;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentSaveDto {

    private int albumId;
    private int commentId;
    private String commentDetail; // 댓글 내용
    private String memberId; // 회원 ID
    private LocalDateTime commentDate;
}
