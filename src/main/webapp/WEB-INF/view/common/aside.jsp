<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<aside class="nav">
    <img src="<%=request.getContextPath()%>/resources/Img/melon_icon.png">
    <ul>
        <li><a href="">멜론홈</a></li>
        <li><a href="">인기차트</a></li>
        <li>
            <a href="#">최신음악</a>
            <ul>
                <li><a href="">최신곡</a></li>
                <li><a href="">최신앨범</a></li>
            </ul>
        </li>
        <li><a href="">장르음악</a></li>
        <li><a href="">Q&A</a></li>
        <li>
            <a href="#">마이뮤직</a>
            <ul>
                <li><a href="">재생목록</a></li>
                <li><a href="">좋아요</a></li>
            </ul>
        </li>
        <li><a href="">구매목록</a></li>
    </ul>
</aside>