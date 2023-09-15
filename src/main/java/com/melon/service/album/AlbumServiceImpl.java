package com.melon.service.album;


import com.melon.dao.album.IAlbumDao;
import com.melon.dto.album.AlbumDetails;
import com.melon.dto.comment.CommentDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class AlbumServiceImpl implements IAlbumService{

    private final IAlbumDao albumDao;

    /**
     * 앨범 정보
     *
     * @author 임휘재
     */
    @Override
    public AlbumDetails getAlbumDetails(int albumId) {
        return albumDao.selectAlbumDetails(albumId);
    }

    /**
     * 앨범 수록곡 조회
     *
     * @author 임휘재
     */
    @Override
    public List<AlbumDetails> getAlbumSongList(int albumId) {
        return albumDao.selectAlbumSongList(albumId);
    }

    /**
     * 앨범 상세 조회
     *
     * @author 임휘재
     */
    @Override
    public AlbumDetails getAlbumDetail(int albumId) {
        return albumDao.selectAlbumDetail(albumId);
    }

    /**
     * 앨범 댓글 작성
     *
     * @author 임휘재
     */
    @Override
    public void saveComment(CommentDto commentDto, int albumId) {
        albumDao.saveComment(albumId, commentDto);
    }

    /**
     * 앨범 댓글 조회
     *
     * @author 임휘재
     */
    @Override
    public List<CommentDto> getAlbumCommentList(int albumId) {
        List<CommentDto> dto =  albumDao.selectMyComment(albumId);
        dto.sort((c1, c2) -> c2.getCommentDate().compareTo(c1.getCommentDate()));
        return dto;
    }

    /**
     * 앨범 댓글 삭제
     *
     * @author 임휘재
     */
    @Override
    public void deleteComment(int commentId, int albumId) {
        albumDao.deleteComment(albumId, commentId);
    }

    /**
     * 앨범 좋아요 증가
     *
     * @author 임휘재
     */
    @Override
    public void albumLikeUpdate(int albumId) {
        albumDao.albumLikeUpdate(albumId);
    }

    /**
     * 앨범 좋아요 삭제
     *
     * @author 임휘재
     */
    @Override
    public void albumLikeDelete(int albumId) {
        albumDao.albumLikeDelete(albumId);
    }

    /**
     * 앨범 좋아요 조회
     *
     * @author 임휘재
     */
    @Override
    public AlbumDetails selectAlbumLike(int albumId) {
        return albumDao.selectAlbumLike(albumId);
    }

    /**
     * 앨범의 좋아요를 좋아요 테이블에 저장
     *
     * @author 임휘재
     */
    @Override
    public void albumLikeToUserLike(int albumId, String memberId) {
        try {
            albumDao.AlbumLikeToUserLike(albumId, memberId);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


}
