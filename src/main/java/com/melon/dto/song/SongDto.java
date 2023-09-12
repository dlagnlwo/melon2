package com.melon.dto.song;

import lombok.Data;

@Data
public class SongDto {

    private int songId; //노래코드
    private String songName; //노래명
    private char title; //노래구분
    private byte[] songFile; //노래파일
    private String playTime; //재생시간
    private String iyrics; //가사
    private int playCount; //조회수
    private int songLike; //좋아요
    private int genreId; //장르코드(fk)
    private int albumId; //앨범코드(fk)
    private int artistId; //가수코드(fk)

}
