<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="kor">
<%@ include file="/WEB-INF/view/common/front_header.jsp" %>
<link href="<%=request.getContextPath()%>/resources/css/ticket.css" rel="stylesheet">
<body>
<%@ include file="/WEB-INF/view/common/header.jsp" %>
<script src="<%=request.getContextPath()%>/resources/js/ticket.js"></script>
<section class="sec1">
    <%@ include file="/WEB-INF/view/common/aside.jsp" %>
    <div class="wrap">
        <!-- 여기서 만들자️ -->
        
        <!-- 티켓 헤드 -->
        <div class="head">
	        <div class="boxhead">이용권</div>
	        	<div class="box">
	        		<a href="#">할인 특가</a>
	        	</div>
	        <div class="box">
	        	<a href="#">전체 이용권</a>
	        </div>
        </div>
        
        <div class="head2">
        	<div class="box">
        		<p>MP3 다운 + 무제한 듣기</p>
        	</div>
        </div>	
		<!-- 할인특가 -->
		
		<!-- 10플러스 정기결제 -->
		
		<div class="streaming">
			<div class="mp3">MP3 10 플러스 정기결제</div>
			<div class="pic">
				<div class="price">
					<div><p>9,900원</p></div>
					<div><p>14,500원</p></div>
				</div>
				<div class="buy">
        			<a href="#">구매</a>
        		</div>
        	</div>
			
        		
	        
			<div class="read">월 10곡 다운(평생소장) + 무제한 듣기</div>
		</div>
		
		<!-- 30플러스 정기결제 -->
		<div class="streaming2">
			<div class="left">
				<div class="left_text">
					<p>MP3 10 플러스 정기결제</p>
					<p>월 10곡 다운(평생소장) + 무제한 듣기</p>
				</div>
			</div>
			<div class="right">
				<div class="right_text">
					<p>9900</p>
					<p>14500</p>
					<p>구매</p>
				</div>
			</div>
		</div>
		
        
    </div>
</section>
</body>
</html>
