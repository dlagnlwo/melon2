package com.melon.dto.like;

import lombok.Data;

@Data
public class LikeDto {

    private int likeCnt;
    private String memberId;
    private int artistId;
    private int albumId;
    private int songId;
    private int genreId;
}
