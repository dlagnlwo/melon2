package com.melon.controller.artist;

import com.melon.dto.album.AlbumDetails;
import com.melon.dto.artist.ArtistDto;
import com.melon.service.album.AlbumServiceImpl;
import com.melon.service.artist.IArtistService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/artist")
@RequiredArgsConstructor
@Slf4j
public class ArtistController {

    private final IArtistService artistService;

    /**
     * 가수 곡 조회, 가수 앨범 조회, 가수 상세정보 조회
     * @author 임휘재
     */
    @GetMapping("/{artistId}")
    public String artistMain(@PathVariable("artistId") int artistId,
                             Model model){
        log.info("artistId : {}", artistId);
        ArtistDto artistDto = artistService.getArtistInfo(artistId);
        model.addAttribute("artistInfo", artistDto);
        log.info("artistInfo : {}", artistDto);

        List<ArtistDto> artistDtoList = artistService.getArtistSongs(artistId);
        model.addAttribute("artistSongs", artistDtoList);

        List<ArtistDto> artistAlbums = artistService.getArtistAlbums(artistId);
        model.addAttribute("artistAlbums", artistAlbums);
        if (!artistAlbums.isEmpty()) {
            log.info("albumId : {}", artistAlbums.get(0).getAlbumId());
        } else {
            log.info("No albums found for this artist.");
        }

        try {
            ArtistDto artistActivity = artistService.getArtistActivity(artistId);
            model.addAttribute("artistActivity", artistActivity);
        }catch (Exception e){
            ArtistDto artistAc = artistService.getArtistActivity(artistId);
            if(artistAc.getDebut().isEmpty()) {
                model.addAttribute("emptyMessage", "알 수 없음");
            }
        }
        return "artist/artist";
    }


}
