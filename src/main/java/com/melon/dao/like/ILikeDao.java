package com.melon.dao.like;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ILikeDao {

    void insertLikeLog(@Param("artistId") int artistId, String admin);

    void deleteLikeLog(@Param("artistId") int artistId);

    boolean isUserLikedArtist(@Param("artistId") int artistId, String admin);



}
