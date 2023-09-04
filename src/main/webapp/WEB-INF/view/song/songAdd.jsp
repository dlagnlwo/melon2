<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="kor">
<%@ include file="/WEB-INF/view/common/front_header.jsp" %>
<link href="<%=request.getContextPath()%>/resources/css/songAdd.css" rel="stylesheet">

<body>
<%@ include file="/WEB-INF/view/common/header.jsp" %>
<section class="sec1">
    <%@ include file="/WEB-INF/view/common/aside.jsp" %>
    <div class="wrap">

        <div class="song_button">
            <div class="song_add_title"><p>노래 추가</p></div>
            <a href="/admin"><button>나가기</button></a>
            <button formaction="/" formmethod="post">저장</button>
            <form action="" method="post">
                <input type="text" size="30px" placeholder="가수이름">
                <input type="text" size="30px" placeholder="앨범명">
                <input type="text" size="30px" placeholder="노래제목">
                <input type="text" size="30px" placeholder="재생시간">
                <input type="text" size="30px" placeholder="노래파일">
                <input type="text" size="30px" placeholder="노래가사">
            </form>
        </div>
    </div>
</section>
</body>
</html>