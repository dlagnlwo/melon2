<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="kor">
<%@ include file="/WEB-INF/view/common/front_header.jsp" %>
<link href="<%=request.getContextPath()%>/resources/css/melon_login.css" rel="stylesheet">
<script src="<%=request.getContextPath()%>/resources/js/melon_login.js"></script>
<body>
<%@ include file="/WEB-INF/view/common/header.jsp" %>
<section class="sec1">
    <%@ include file="/WEB-INF/view/common/aside.jsp" %>
    <div class="wrap">
        <div class="login_wrap">
            <h2>Melon</h2>
            <div class="kakao_btn">
                <form action="/login" method="post">
                    <input type="text" placeholder="아이디 입력" name="" value="" class="id" id="id">
                    <input type="password" placeholder="비밀번호 입력" name="" value="" class="pw" id="pw">
                    <div class="checkbox">
                        <input type="checkbox">
                        <p>로그인 상태 유지</p>
                    </div>
                    <button type="submit" id="login_btn"><p>로그인</p></button>
                    <button formaction="/login" formmethod="get"><p>취소</p></button>
                </form>
            </div>
        </div>
    </div>
</section>
</body>
</html>