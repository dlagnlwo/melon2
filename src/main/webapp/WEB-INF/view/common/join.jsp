<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="kor">
<%@ include file="/WEB-INF/view/common/front_header.jsp" %>
<link href="<%=request.getContextPath()%>/resources/css/join.css" rel="stylesheet">
<script src="<%=request.getContextPath()%>/resources/js/join.js"></script>
<body>
<%@ include file="/WEB-INF/view/common/header.jsp" %>
<section class="sec1">
    <%@ include file="/WEB-INF/view/common/aside.jsp" %>
    <div class="wrap">
        <div class="login_wrap">
            <h2>Melon</h2>
            <div class="join_form">
                <form action="/join" method="post">
                    <input type="text" placeholder="아이디 입력" name="" value="" id="id">
                    <p>*유효성 검사</p>
                    <input type="password" placeholder="비밀번호 입력" name="" value="" id="pw">
                    <p>*유효성 검사</p>
                    <input type="text" placeholder="이메일 입력" name="" value="" id="email">
                    <input type="text" placeholder="이름 입력" name="" value="" id="membername">
                    <input type="text" placeholder="닉네임 입력" name="" value="">
                    <p>*유효성 검사</p>
                    <input type="text" placeholder="생년월일 8자리 입력" name="" value="" id="birth">
                    <p>*유효성 검사</p>
                    <input type="text" placeholder="핸드폰 번호 입력" name="" value="" id="tel">
                    <button type="submit" id="join_btn">회원가입</button>
                    <button formaction="/" formmethod="get"><p>취소</p></button>
                </form>
            </div>
        </div>
    </div>
</section>
</body>
</html>