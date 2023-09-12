package com.melon.controller.song;

import com.melon.service.album.AlbumServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/song")
@RequiredArgsConstructor
@Slf4j
public class SongController {

	private final AlbumServiceImpl albumService;

	/**
	* 인기차트 조회
	* @author 여수한
	*/
	@GetMapping("/popular")
	public String getPopularChart() {
		
		return "song/popularcharts";
	}
	/**
	* 최신노래 조회
	* @author 여수한
	*/
	@GetMapping("/recente/song")
	public String getRecenteSong() {
		
		return "song/recentesong";
	}
	/**
	* 최신앨범 조회
	* @author 여수한
	*/
	@GetMapping("/recente/album")
	public String getRecenteAlbum() {
		return "song/recentealbum";
	}
}
