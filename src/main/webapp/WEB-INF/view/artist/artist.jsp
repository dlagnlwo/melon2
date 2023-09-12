<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<html lang="kor">
<%@ include file="/WEB-INF/view/common/front_header.jsp" %>
<head>
    <link href="/resources/css/artist.css" rel="stylesheet" type="text/css">
</head>
<body>
<%@ include file="/WEB-INF/view/common/header.jsp" %>
<section class="sec1">
    <%@ include file="/WEB-INF/view/common/aside.jsp" %>
    <div class="wrap">
        <div class="container">
            <div class="artist_top">
                <div class="artist_top_img">
                    <div class="artist_img">
                        <img src="/resources/Img/karina.png"/>
                    </div>
                </div>
                <div class="artist_top_text">
                    <div class="artist_top_text_box">
                        <div class="artist_top_name"><p>${artistInfo.artistName}</p></div>
                        <div class="artist_top_hart_play">
                            <div class="hart"><strong>♥ &nbsp;</strong></div>
                            <div class="hart_count">51,179</div>
                            <div class="play_btn"><i class="fa-solid fa-play"></i></div>
                            <div class="rep_song">${artistInfo.songName}</div>
                        </div>
                        <div class="artist_top_agency">
                            <div class="agency">소속사</div>
                            <c:choose>
                                <c:when test="${empty artistInfo.agency}">
                                    <div class="agency_name">없음</div>
                                </c:when>
                                <c:otherwise>
                                    <div class="agency_name">${artistInfo.agency}</div>
                                </c:otherwise>
                            </c:choose>
                        </div>
                    </div>
                </div>
            </div>
            <div class="artist_menu">
                <div class="artist_menu_left">
                    <div class="artist_left_song">
                        <div class="artist_left_song_text">
                            <p class="show_table active" onclick="showTable()">곡</p>
                        </div>
                    </div>
                    <div class="artist_left_detail">
                        <div class="artist_left_detail_text">
                            <p class="show_album" onclick="showAlbum()">앨범</p>
                        </div>
                    </div>
                    <div class="artist_left_comment">
                        <div class="artist_left_comment_text">
                            <p class="show_info" onclick="showInfo()">상세정보</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="artist_sort_and_play">
                <div class="artist_song_sort_box">
                    <div class="artist_song_latest_box">
                        <span class="artist_song_latest_text sort" onclick="showTable()">최신순</span>
                    </div>
                    <div class="artist_song_popularity_box">
                        <span class="artist_song_popularity_text" onclick="showTable()">인기순</span>
                    </div>
                    <div class="artist_song_alphabetically_box">
                        <span class="artist_song_alphabetically_text" onclick="showTable()">가나다순</span>
                    </div>
                </div>
                <div class="artist_select_and_play">
                    <div class="artist_menu_right">
                        <div class="artist_right_select">
                            <div class="artist_right_select_btn" onclick="selectAll()">
                                <i class="fa-solid fa-check"></i>&nbsp
                                <span class="select_btn">전체선택</span>
                            </div>
                        </div>
                        <div class="artist_right_play">
                            <div class="artist_right_select_play">
                                <i class="fa-solid fa-play"></i>&nbsp
                                <span class="play_btn">전체재생</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <table class="song_tb">
                <thead class="head_th">
                <tr>
                    <th><input type="checkbox" class="check_tb"></th>
                    <th><p>곡명</p></th>
                    <th><p>아티스트명</p></th>
                    <th><p>앨범명</p></th>
                    <th><p>좋아요</p></th>
                    <th><p>재생</p></th>
                </tr>
                </thead>
                <tbody class="body_tb">
                <c:forEach items="${artistSongs}" var="song">
                    <tr>
                        <td><input type="checkbox" class="check_tb"></td>
                        <td>
                            <div class="artist_song_name_box_tb">
                                <div class="artist_album_pic">
                                    <img src="/resources/Img/Better_Things.jpg"/>
                                </div>
                                <div class="artist_song_name_tb">${song.songName}</div>
                            </div>
                        </td>
                        <td>
                            <div class="artist_name_tb">${song.artistName}</div>
                        </td>
                        <td>
                            <a href="/album/${song.albumId}" class="artist_album_name_tb">${song.albumName}</a>
                        </td>
                        <td>
                            <p><strong>♥ &nbsp</strong>55,799</p>
                        </td>
                        <td>
                            <p><i class="fa-solid fa-play"></i></p>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="artist_album" style="display: none">
                <div class="artist_album_list">
                    <div class="artist_album_list_box">
                        <div class="artist_album_list_img">
                            <img src="/resources/Img/OMG.jpg">
                        </div>
                        <c:forEach items="${artistAlbums}" var="albums">
                        <div class="artist_album_text_box">
                            <a href="#">${albums.albumName}</a>
                            <p>${albums.songName}</p>
                            <p>${albums.releaseDate}</p>
                        </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
            <div class="artist_info_body" style="display: none">
                <div class="artist_info_text_box">
                    <div class="artist_info_text">
                        <div class="artist_activity_info"><p>활동정보</p></div>
                        <div class="artist_debut">
                            <p>데뷔</p>
                            <c:choose>
                                <c:when test="${empty artistActivity.debut}">
                                    <p>알 수 없음</p>
                                </c:when>
                                <c:otherwise>
                                    <p>${artistActivity.debut}</p>
                                </c:otherwise>
                            </c:choose>
                        </div>
                        <div class="artist_recent_song">
                            <div class="artist_recent_song_text">
                                <p>최근곡</p>
                            </div>
                            <div class="artist_recent_album">
                                <p><i class="fa-solid fa-play"></i></p>
                                <img src="/resources/Img/Love_Lee.jpg"/>
                            </div>
                            <div class="artist_song_name">
                                <p>${artistActivity.songName}</p>
                                <p>${artistActivity.artistName}</p>
                            </div>
                        </div>
                        <div class="artist_type">
                            <p>유형</p>
                            <p>${artistActivity.activityType}</p>
                        </div>
                        <div class="artist_group">
                            <p>소속그룹</p>
                            <p>${artistActivity.artistName}</p>
                        </div>
                    </div>
                </div>
                <div class="artist_pro_box">
                    <div class="artist_pro_text_box">
                        <p>아티스트 소개</p>
                    </div>
                    <div class="artist_pro_content_box">
                        <div class="artist_pro_content">
                            <p>${artistActivity.artistPro}</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
<script src="/resources/js/artist.js"></script>
</html>
