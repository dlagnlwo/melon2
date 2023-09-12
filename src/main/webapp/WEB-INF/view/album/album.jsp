<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="kor">
<%@ include file="/WEB-INF/view/common/front_header.jsp" %>
<head>
    <link href="/resources/css/album.css" rel="stylesheet" type="text/css">
</head>
<body>
<%@ include file="/WEB-INF/view/common/header.jsp" %>
<section class="sec1">
    <%@ include file="/WEB-INF/view/common/aside.jsp" %>
    <div class="wrap">
        <div class="container">
            <div class="album_top">
                <div class="album_top_img">
                    <div class="album_img">
                        <img src="/resources/Img/next_level.jpg"/>
                    </div>
                </div>
                <div class="album_top_text">
                    <div class="album_top_type">[ ${albumDetails.albumType} ]</div>
                    <div class="album_top_song_name">${albumDetails.songName}</div>
                    <div class = "album_top_comment">
                        <a href="#" class="comment">댓글 &nbsp</a>
                        <a href="#" class="comment_count">${albumComments.size()}개 ></a>
                    </div>
                    <a href="/artist/${albumDetails.artistId}" class="album_top_artist">${albumDetails.artistName}</a>
                    <div class="album_top_release">
                        <div class="release">발매일</div>
                        <div class="date">${albumDetails.releaseDate}</div>
                    </div>
                    <div class="album_top_genre">
                        <div class="genre">장르</div>
                        <div class="genre_name">${albumDetails.genreName}</div>
                    </div>
                    <div class="album_top_hart">
                        <div class="hart"><strong>♥ &nbsp</strong></div>
                        <div class="hart_count">5,1179</div>
                    </div>
                    <div class="album_top_agency">
                        <div class="agency">기획사</div>
                        <div class="agency_name">${albumDetails.albumAgency}</div>
                    </div>
                    <div class="album_top_publisher">
                        <div class="publisher">발매사</div>
                        <div class="publisher_name">${albumDetails.albumPublisher}</div>
                    </div>
                </div>
            </div>
            <div class="album_menu">
                <div class="album_menu_left">
                    <div class="album_left_song">
                        <div class="album_left_song_text">
                            <p class="show_songs active" onclick="showSong()">수록곡</p>
                        </div>
                    </div>
                    <div class="album_left_detail">
                        <div class="album_left_detail_text">
                            <p class="show_detail_albums" onclick="showDetailAlbum()">앨범상세</p>
                        </div>
                    </div>
                    <div class="album_left_comment">
                        <div class="album_left_comment_text">
                            <p class="show_comments" onclick="showComment()">댓글</p>
                        </div>
                    </div>
                </div>
                <div class="album_menu_right">
                    <div class="album_right_select">
                        <div class="album_right_select_btn" onclick="selectAll()">
                            <i class="fa-solid fa-check"></i>&nbsp
                            <span class="select_btn">전체선택</span>
                        </div>
                    </div>
                    <div class="album_right_play">
                        <div class="album_right_select_play">
                            <i class="fa-solid fa-play"></i>&nbsp
                            <span class="play_btn">전체재생</span>
                        </div>
                    </div>
                </div>
            </div>
            <c:if test="${not empty albumDetails}">
            <table class="song_tb">
                <thead class="head_th">
                    <tr>
                        <th><input type="checkbox" class="check_tb" onclick="selectAll()"></th>
                        <th><p>번호</p></th>
                        <th><p>곡정보</p></th>
                        <th><p>가수</p></th>
                        <th><p>좋아요</p></th>
                        <th><p>재생</p></th>
                        <th><p>담기</p></th>
                        <th><p>다운</p></th>
                    </tr>
                </thead>
                <tbody class="body_tb">
                <c:forEach items="songs" var="songs">
                    <tr>
                        <td><input type="checkbox" class="check_tb"></td>
                        <td>
                            <c:set var="startNumber" value="1" />
                                <p>${startNumber}</p>
                        </td>
                        <td>
                            <div class="song_name_tb">${albumDetails.songName}</div>
                        </td>
                        <td>
                            <a href="/artist/${albumDetails.albumId}" class="artist_name_tb">${albumDetails.artistName}</a>
                        </td>
                        <td>
                            <strong>♥ &nbsp</strong>13,215 개
                        </td>
                        <td>
                            <i class="fa-solid fa-play"></i>
                        </td>
                        <td>
                            <i class="fa-solid fa-plus"></i>
                        </td>
                        <td>
                            <i class="fa-solid fa-download"></i>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            </c:if>
            <div class="album_detail_body" style="display: none">
                <div class="album_information_body">
                    <div class="album_detail_name_box">
                        <div class="album_name">앨범명</div>
                        <div class="album_name_value">${albumDetail.albumName}</div>
                    </div>
                    <div class="album_detail_artist_box">
                        <div class="album_artist">아티스트</div>
                        <div class="album_artist_value">${albumDetail.artistName}</div>
                    </div>
                    <div class="album_detail_genre_box">
                        <div class="album_genre">장르</div>
                        <div class="album_genre_value">${albumDetail.genreName}</div>
                    </div>
                    <div class="album_detail_agency_box">
                        <div class="album_agency">소속사</div>
                        <div class="album_agency_value">${albumDetail.artistAgency}</div>
                    </div>
                </div>
                <div class="album_produce_text_box">
                    <span class="album_produce_text">앨범소개</span>
                </div>
                <div class="album_produce_content_box">
                    <div class="album_produce_content">${albumDetail.albumPro}</div>
                </div>
            </div>
            <div class="comment_box" style="display: none">
                <div class="comment_write_count_box">
                    <div class="comment_write_box">
                        <div class="comment_write_count">
                            <span class="comment_span">댓글 ${albumComments.size()}개</span>
                        </div>
                        <div class="user_comment_form">
                            <form class="comment_form" id="commentForm1" action="/album/${albumId}/comment/write" method="post" onsubmit="writeSuccess()">
                            <div class="comment_write_img">
                                    <i class="fa-regular fa-user"></i>
                                </div>
                                <div class="comment_write_input">
                                    <input type="text" class="comment" name="commentDetail" placeholder="댓글 작성하기"/>
                                </div>
                                <div class="comment_write_btn">
                                    <button type="submit" name="reg_btn" id="reg_btn">등록</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="people_comment_box" id="commentList1">
                    <div class="member_comment_box">
                        <div class="member_comment_count">
                            <span class="member_comment_count_text">총 ${albumComments.size()}개</span>
                        </div>
                        <c:forEach items="${albumComments}" var="albumComments">
                        <div class="member_comment">
                            <div class="member_comment_pic_box">
                                <div class="member_comment_pic">
                                    <img src="/resources/Img/member_comment_pic1.jpg"/>
                                </div>
                            </div>
                            <div class="member_comment_mem_id">${albumComments.memberId}</div>
                            <div class="member_comment_mem_content">${albumComments.commentDetail}</div>
                            <fmt:formatDate value="${albumComments.commentDate}" pattern="yyyy-MM-dd" var="formattedCommentDate"/>
                            <div class="member_comment_mem_date">${formattedCommentDate}</div>
                            <form action="/album/${albumId}/comment/delete/${albumComments.commentId}" method="post" class="delete_btn_box" onsubmit="showDeleteSuccessAlert()">
                                <button type="submit" class="comment_delete_btn">삭제</button>
                            </form>
                        </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
<script src="/resources/js/album.js">
</script>
</html>
