package com.melon.dao.album;

import com.melon.dto.album.AlbumDetails;
import com.melon.dto.comment.CommentDto;
import com.melon.dto.comment.CommentSaveDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IAlbumDao {

    /**
     * 앨범 정보
     * @author 임휘재
     */
    AlbumDetails selectAlbumDetails(@Param("albumId") int albumId);

    /**
     * 앨범 수록곡
     * @author 임휘재
     */
    List<AlbumDetails> selectAlbumSongList(@Param("albumId") int albumId);

    /**
     * 앨범 상세 정보
     * @author 임휘재
     */
    AlbumDetails selectAlbumDetail(@Param("albumId") int albumId);

    /**
     * 앨범 댓글 작성
     *
     * @author 임휘재
     */
    void saveComment(@Param("albumId") int albumId,
                     @Param("commentDto") CommentDto commentDto);


    /**
     * 앨범 댓글 조회
     *
     * @author 임휘재
     */
    List<CommentDto> selectMyComment(@Param("albumId") int albumId);


    /**
     * 앨범 댓글 삭제
     *
     * @author 임휘재
     */
    void deleteComment(@Param("albumId") int albumId,
                       @Param("commentId") int commentId);



}
