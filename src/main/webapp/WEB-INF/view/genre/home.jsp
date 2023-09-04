<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="kor">
<link
	href="<%=request.getContextPath()%>/resources/css/genre.css"
	rel="stylesheet">
<%@ include file="/WEB-INF/view/common/front_header.jsp" %>
<script src="<%=request.getContextPath()%>/resources/js/genre.js"></script>
<body>
<%@ include file="/WEB-INF/view/common/header.jsp" %>
<section class="sec1">
    <%@ include file="/WEB-INF/view/common/aside.jsp" %>
    <div class="wrap">
        <div class="dropdown">
     	  	<p>장르 홈</p>
     	  	<div class="dropdown-btn">
     	  		<button class="dropbtn"><i class="fa-solid fa-chevron-down btn"></i></button>
     	  	</div>
     	  	<div id="dropdown-title">
	     	  	<div class="dropdown-content" id="myDropdown">
		            <a href="#">옵션 1</a>
		            <a href="#">옵션 2</a>
		            <a href="#">옵션 3</a>
		            <a href="#">옵션 1</a>
		            <a href="#">옵션 2</a>
		            <a href="#">옵션 3</a>
		            <a href="#">옵션 1</a>
		            <a href="#">옵션 2</a>
		            <a href="#">옵션 3</a>
		        </div>
     	  	</div> 
   		</div>
   		<div class="favorites">
   			<!-- 즐겨찾기 -->
   			<ul>
   				<li class="ballade" style="color:#1fc561; border:1px solid #1fc561">발라드</li>
   				<li class="dance" style="color:#1fbcc5; border:1px solid #1fbcc5">댄스</li>
   				<li class="hiphop" style="color:#875cc9; border:1px solid #875cc9">국내힙합</li>
   				<li class="idol" style="color:#fd6a6a; border:1px solid #fd6a6a">아이돌</li>
   				<li class="r&b" style="color:#DB3D23; border:1px solid #DB3D23">국내R&B</li>
   				<li class="indie" style="color:#886fe5; border:1px solid #886fe5">OST</li>
   				<li class="indie" style="color:#19d7a4; border:1px solid #19d7a4">해외</li>
   			</ul>
   		</div>
    </div>
</section>
</body>
</html>