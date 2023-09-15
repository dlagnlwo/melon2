package com.melon.controller.album;

import com.melon.dto.album.AlbumDetails;
import com.melon.dto.artist.ArtistDto;
import com.melon.dto.comment.CommentDto;
import com.melon.dto.comment.CommentSaveDto;
import com.melon.service.album.IAlbumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/album")
@RequiredArgsConstructor
@Slf4j
public class AlbumController {

    private final IAlbumService albumService;

    /**
     * 앨범 정보, 수록곡, 상세, 댓글 조회
     * @author 임휘재
     */
    @GetMapping("/{albumId}")
    public String albumDetails(@PathVariable("albumId") int albumId,
                               Model model){
        AlbumDetails albumDetails = albumService.getAlbumDetails(albumId);
        model.addAttribute("albumDetails", albumDetails);

        List<AlbumDetails> getAlbumSongList = albumService.getAlbumSongList(albumId);
        model.addAttribute("getAlbumSongList", getAlbumSongList);

        AlbumDetails albumDetail = albumService.getAlbumDetail(albumId);
        model.addAttribute("albumDetail", albumDetail);

        List<CommentDto> albumCommentList = albumService.getAlbumCommentList(albumId);
        log.info("Number of comments retrieved: {}", albumCommentList.size());
        model.addAttribute("albumComments", albumCommentList);
        if (!albumCommentList.isEmpty()) {
            log.info("memberId : {}", albumCommentList.get(0).getMemberId());
            log.info("albumId : {}", albumCommentList.get(0).getAlbumId());
        } else {
            log.info("No albums found for this artist.");
        }
        return "album/album";
    }


    /**
     * 앨범 댓글 작성
     * @author 임휘재
     */
    @PostMapping("/{albumId}/comment/write")
    public String addUserComment(@ModelAttribute CommentDto commentDto,
                                 @PathVariable("albumId") int albumId) {
        log.info("dto : {}", commentDto);
        albumService.saveComment(commentDto, albumId);
        return "redirect:/album/" + albumId;
    }

    /**
     * 앨범 댓글 삭제
     * @author 임휘재
     */
    @PostMapping("/{albumId}/comment/delete/{commentId}")
    public String deleteUserComment(@PathVariable("albumId") int albumId,
                                    @PathVariable("commentId") int commentId) {
            albumService.deleteComment(commentId, albumId);
        return "redirect:/album/" + albumId;
    }

    @PostMapping("/{albumId}/like/update")
    public ResponseEntity<Integer> albumLikeCntUpdate(@PathVariable("albumId") int albumId) {
        try {
            String memberId = "admin";
            albumService.albumLikeUpdate(albumId);
            AlbumDetails dto = albumService.selectAlbumLike(albumId);
            log.info("selectAlbumLike : {}", dto.getAlbumLike());
            albumService.albumLikeToUserLike(albumId, memberId);
            log.info("앨범 좋아요 증가를 user_like 테이블에 저장. memberId: {}", memberId);
            return ResponseEntity.ok(dto.getAlbumLike());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(-1);
        }
    }

    @PostMapping("/{albumId}/like/delete")
    public ResponseEntity<Integer> albumLikeCntDelete(@PathVariable("albumId") int albumId) {
        try {
            String memberId = "admin";
            albumService.albumLikeDelete(albumId);
            AlbumDetails dto = albumService.selectAlbumLike(albumId);
            log.info("selectAlbumLike : {}", dto.getAlbumLike());
            albumService.albumLikeToUserLike(albumId, memberId);
            log.info("앨범 좋아요 감소를 user_like 테이블에 저장. memberId: {}", memberId);
            return ResponseEntity.ok(dto.getAlbumLike());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(1);
        }
    }



}
