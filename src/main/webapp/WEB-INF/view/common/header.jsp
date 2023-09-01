<%@ page contentType = "text/html; charset=utf-8" %>
<<<<<<< HEAD
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header class="header">
    <div class="header_left">
        <a href="">Melon</a>
        <form method="post">
            <div class="header_left_read"><i class="fa-solid fa-magnifying-glass"></i></div>
            <input type="text" name="">
        </form>
    </div>
    <div class="header_right">
        <form><button>로그인</button></form>
        <form><button>회원가입</button></form>
    </div>
    <aside class="aside">
        <div class="playsong_info">
            <img src="<%=request.getContextPath()%>/resources/Img/album.png">
            <p>Vancouver</p>
            <p><span>BIG Naughty (서동현)</span></p>
            <p id="like_btn"><a href="#" class="white"><strong>♥</strong></a></p>
            <p>00:00 | 03:34</p>
            <div class="playsong_oper">
                <div class="playsong_oper_wrap">
                    <a href=""><i class="fa-solid fa-play"></i></a>
                    <a href=""><i class="fa-solid fa-pause"></i></a>
                    <a href=""><i class="fa-solid fa-shuffle"></i></a>
                    <a href=""><i class="fa-solid fa-volume-off"></i></a>
                </div>
            </div>
        </div>
        <div class="playsong_info_ck">
            <input type="checkbox">
            <p>3곡</p>
            <p><a href="">삭제</a></p>
        </div>
        <div class="playsong_list"> <!-- 동적으로 생성-->
            <ul>
                <li class="playsong_list_wrap">
                    <input type="checkbox">
                    <img src="<%=request.getContextPath()%>/resources/Img/album.png">
                    <div class="playsong_list_wrap_div">
                        <p>Vancouver</p>
                        <p>BIG Naughty (서동현)</p>
                    </div>
                </li>
                <li class="playsong_list_wrap">
                    <input type="checkbox">
                    <img src="<%=request.getContextPath()%>/resources/Img/album2.png">
                    <div class="playsong_list_wrap_div">
                        <p>Hype boy</p>
                        <p>NewJeans</p>
                    </div>
                </li>
            </ul>
        </div>
    </aside>
</header>
<script>
    $(document).ready(function (){
        $('#like_btn').on('click', function (e){
            $('.white').toggleClass('green');
        });
    })
</script>
=======
<header class="header">
    <div class="header_left">
        <a href="">Melon</a>
        <form method="post">
            <div class="header_left_read"><i class="fa-solid fa-magnifying-glass"></i></div>
            <input type="text" name="">
        </form>
    </div>
    <div class="header_right">
        <form><button>로그인</button></form>
        <form><button>회원가입</button></form>
    </div>
    <aside class="aside">
        <div class="playsong_info">
            <img src="<%=request.getContextPath()%>/resources/Img/album.png">
            <p>헤어져줘서 고마워</p>
            <p><span>벤</span></p>
            <p>on:❤️ / off:🤍</p>
            <p>00:00 | 03:34</p>
            <div class="playsong_oper">
                <div class="playsong_oper_wrap">
                    <a href=""><i class="fa-solid fa-play"></i></a>
                    <a href=""><i class="fa-solid fa-pause"></i></a>
                    <a href=""><i class="fa-solid fa-shuffle"></i></a>
                    <a href=""><i class="fa-solid fa-volume-off"></i></a>
                </div>
            </div>
        </div>
        <div class="playsong_info_ck">
            <input type="checkbox">
            <p>3곡</p>
            <p><a href="">삭제</a></p>
        </div>
        <div class="playsong_list"> <!-- 동적으로 생성-->
            <ul>
                <li class="playsong_list_wrap">
                    <input type="checkbox">
                    <img src="<%=request.getContextPath()%>/resources/Img/album.png">
                    <div class="playsong_list_wrap_div">
                        <p>헤어져줘서 고마워</p>
                        <p>벤</p>
                    </div>
                </li>
                <li class="playsong_list_wrap">
                    <input type="checkbox">
                    <img src="<%=request.getContextPath()%>/resources/Img/album.png">
                    <div class="playsong_list_wrap_div">
                        <p>헤어져줘서 고마워</p>
                        <p>벤</p>
                    </div>
                </li>
            </ul>
        </div>
    </aside>
</header>
>>>>>>> branch 'main' of https://github.com/yeosuhan/melon.git
