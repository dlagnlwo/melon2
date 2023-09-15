package com.melon.service.album;


import com.melon.dto.album.AlbumDetails;
import com.melon.dto.comment.CommentDto;
import com.melon.dto.comment.CommentSaveDto;

import java.util.List;
import java.util.Map;

public interface IAlbumService {

    /**
     * 앨범 기본 정보 조회
     *
     * @author 임휘재
     */
    AlbumDetails getAlbumDetails(int albumId);

    /**
     * 앨범의 수록곡 전체 조회
     *
     * @author 임휘재
     */
    List<AlbumDetails> getAlbumSongList(int albumId);

    /**
     * 앨범 상세 조회
     *
     * @author 임휘재
     */
    AlbumDetails getAlbumDetail(int albumId);

    /**
     * 앨범 댓글 작성
     *
     * @author 임휘재
     */
    void saveComment(CommentDto commentDto, int albumId);

    /**
     * 앨범 댓글 조회
     *
     * @author 임휘재
     */
    List<CommentDto> getAlbumCommentList(int albumId);

    /**
     * 앨범 댓글 삭제
     *
     * @author 임휘재
     */
    void deleteComment(int commentId, int albumId);

    /**
     * 앨범 좋아요 증가
     *
     * @author 임휘재
     */
    void albumLikeUpdate(int albumId);

    /**
     * 앨범 좋아요 삭제
     *
     * @author 임휘재
     */
    void albumLikeDelete(int albumId);

    /**
     * 앨범 좋아요 조회
     *
     * @author 임휘재
     */
    AlbumDetails selectAlbumLike(int albumId);

    /**
     * 앨범의 좋아요를 좋아요 테이블에 저장
     *
     * @author 임휘재
     */
    void albumLikeToUserLike(int albumId, String memberId);

}
