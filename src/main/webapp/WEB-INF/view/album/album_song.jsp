<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="kor">
<%@ include file="/WEB-INF/view/common/front_header.jsp" %>
<head>
    <link href="/resources/css/album/album_song.css" rel="stylesheet" type="text/css">
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
                    <div class="album_top_type">[싱글]</div>
                    <div class="album_top_song_name">Next Level</div>
                    <div class="album_top_artist">aespa</div>
                    <div class="album_top_release">
                        <div class="release">발매일</div>
                        <div class="date">2021.05.07</div>
                        <div class="comment">댓글 &nbsp</div>
                        <div class="comment_count">12,113개 ></div>
                    </div>
                    <div class="album_top_genre">
                        <div class="genre">장르</div>
                        <div class="genre_name">댄스</div>
                        <div class="hart"><strong>♥ &nbsp</strong></div>
                        <div class="hart_count">5,1179</div>
                    </div>
                    <div class="album_top_agency">
                        <div class="agency">소속사</div>
                        <div class="agency_name">(주)SM엔터테인먼트</div>
                    </div>
                </div>
            </div>
            <div class="album_menu">
                <div class="album_menu_left">
                    <div class="album_left_song">
                        <div class="album_left_song_text">
                            <a href=#>수록곡</a>
                        </div>
                    </div>
                    <div class="album_left_detail">
                        <div class="album_left_detail_text">
                            <a href="/album/detail">앨범상세</a>
                        </div>
                    </div>
                    <div class="album_left_comment">
                        <div class="album_left_comment_text">
                            <a href="/album/comment">댓글</a>
                        </div>
                    </div>
                </div>
                <div class="album_menu_right">
                    <div class="album_right_select">
                        <div class="album_right_select_btn">
                            <i class="fa-solid fa-check"></i>&nbsp
                            <span class="select_btn" onclick="selectAll()">전체선택</span>
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
            <table class="song_tb">
                <thead class="head_th">
                    <tr>
                        <th><input type="checkbox" class="check_tb"></th>
                        <th>번호</th>
                        <th>곡정보</th>
                        <th>좋아요</th>
                        <th>재생</th>
                        <td>담기</td>
                        <td>다운</td>
                    </tr>
                </thead>
                <tbody class="body_tb">
                    <tr>
                        <td><input type="checkbox" class="check_tb"></td>
                        <td>1</td>
                        <td>
                            <div class="song_name_tb">노래제목</div>
                            <div class="artist_name_tb">가수명</div>
                        </td>
                        <td>
                            <strong>♥ &nbsp</strong>55,799
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
                    <tr>
                        <td><input type="checkbox" class="check_tb"></td>
                        <td>2</td>
                        <td>
                            <div class="song_name_tb">노래제목</div>
                            <div class="artist_name_tb">가수명</div>
                        </td>
                        <td>
                            <strong>♥ &nbsp</strong>122,131
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
                </tbody>
            </table>
        </div>
    </div>
</section>
</body>
<script>
    $(document).ready(function() {
        let originalColor = $(".album_left_song_text").css("color");

        $(".album_left_song_text").click(function() {
            if ($(this).css("color") === originalColor) {
                $(this).css("color", "#04E632");
            } else {
                $(this).css("color", originalColor);
            }
        });
    });

    //체크박스 전체선택
    function selectAll() {
        let checkboxes = document.querySelectorAll('input[type="checkbox"]');
        for (let i = 0; i < checkboxes.length; i++) {
            checkboxes[i].checked = true;
        }
    }

    // 수록곡이 보이게
    function showTrackList() {
        let trackTable = document.querySelector('.song_tb');
        trackTable.style.display = 'table';
    }

    // 앨범상세 및 수록곡 요소의 초기 상태를 저장하기 위한 변수
    let albumDetailVisible = false;
    let trackListVisible = false;
</script>
</html>
