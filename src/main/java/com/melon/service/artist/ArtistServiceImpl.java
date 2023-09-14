package com.melon.service.artist;

import com.melon.dao.artist.IArtistDao;
import com.melon.dto.artist.ArtistDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class ArtistServiceImpl implements IArtistService{

    private final IArtistDao artistDao;


    @Override
    public ArtistDto getArtistInfo(int artistId) {
        return artistDao.selectArtistInfo(artistId);
    }

    @Override
    public List<ArtistDto> getArtistSongs(int artistId) {
        return artistDao.selectArtistSongs(artistId);
    }

    @Override
    public List<ArtistDto> getArtistAlbums(int artistId) {
        return artistDao.selectArtistAlbums(artistId);
    }

    @Override
    public ArtistDto getArtistActivity(int artistId) {
        return artistDao.selectArtistActivity(artistId);
    }

    /**
     * 가수 수록곡 최신순, 인기순, 가나다순
     *
     * @author 임휘재
     */
    @Override
    public List<ArtistDto> getArtistSongsSort(int artistId, String sortType) {
        List<ArtistDto> sort = new ArrayList<>();

        if (sortType.equals("최신순")) {
            sort = artistDao.selectArtistSongs(artistId);
        } else if (sortType.equals("인기순")) {
            sort = artistDao.ArtistPopularSongsSort(artistId);
        } else if (sortType.equals("가나다순")) {
            sort = artistDao.ArtistSongNameSort(artistId);
        }

        log.info("sort : " + sort);
        log.info("sortType : " + sortType);
        return sort;
    }

    /**
     * 가수 앨범 목록 중복 제거
     *
     * @author 임휘재
     */
    @Override
    public List<ArtistDto> ArtistAlbumsRemoveDuplication(int artistId) {
        List<ArtistDto> artistAlbums = artistDao.ArtistAlbumsRemoveDuplication(artistId);

        //Set에 담는 이유는 Set은 중복요소를 자동으로 지워주기 때문.
        Set<String> uniqueArtistNames = new HashSet<>();

        // 중복 제거된 결과를 담을 리스트
        List<ArtistDto> uniqueArtistAlbums = new ArrayList<>();

        for (ArtistDto artistDto : artistAlbums) {
            String albumName = artistDto.getAlbumName();

            if (!uniqueArtistNames.contains(albumName)) {
                uniqueArtistNames.add(albumName);
                uniqueArtistAlbums.add(artistDto);
            }
        }
        return uniqueArtistAlbums;
    }

}
