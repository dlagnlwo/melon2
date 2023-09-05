<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="kor">
<%@ include file="/WEB-INF/view/common/front_header.jsp" %>
<link href="<%=request.getContextPath()%>/resources/css/search.css" rel="stylesheet">
<body>
<%@ include file="/WEB-INF/view/common/header.jsp" %>
<section class="sec1">
    <%@ include file="/WEB-INF/view/common/aside.jsp" %>
    <div class="wrap">
<%--        <%String result = request.getParameter("result");%>--%>
<%--        <h2>검색 결과 : <%= result%></h2>--%>
        <div class="search_header">
            <ul>
                <li><h2>검색</h2></li>
                <li><p>통합검색</p></li>
                <li><p>곡</p></li>
                <li style="display: flex;height: 82px;align-items: center;line-height: 70px;"><button type="button" id="albumpos" onsubmit="return false">앨범</button></li>
                <!-- type=button : URI를 연결하지 않고 단순하게 사용자 인터페이스만를 ‘조작‘하기 위한 버튼 -->
                <!-- onsubmit="return false" 위와 같음 -->
                <li><p>아티스트</p></li>
            </ul>
        </div>
        <div class="search_body">
            <p>곡(113) → </p>
            <h3><a href="">전체 재생</a> | <a href="">선택 재생</a></h3>
            <table>
                <tbody>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>titletitletitletitle</p></td>
                        <td><p>artist</p></td>
                        <td><p>album</p></td>
                        <td><p>likes</p></td>
                    </tr>

                </tbody>
            </table>
        </div>
        <div class="search_album">
            <h3>앨범(7) → </h3>
            <table>
                <tbody>
                <tr>
                    <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                    <td><p>Album</p></td>
                    <td><p>Artist</p></td>
                    <td><p>releaseDate</p></td>
                </tr>
                <tr>
                    <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                    <td><p>Album</p></td>
                    <td><p>Artist</p></td>
                    <td><p>releaseDate</p></td>
                </tr>
                <tr>
                    <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                    <td><p>Album</p></td>
                    <td><p>Artist</p></td>
                    <td><p>releaseDate</p></td>
                </tr>
                <tr>
                    <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                    <td><p>Album</p></td>
                    <td><p>Artist</p></td>
                    <td><p>releaseDate</p></td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="search_artist">
            <h3>가수(2) → </h3>
            <table>
                <tbody>
                    <tr>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>Artist</p></td>
                        <td><p>Genre</p></td>
                    </tr>
                    <tr>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>Artist</p></td>
                        <td><p>Genre</p></td>
                    </tr>
                    <tr>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>Artist</p></td>
                        <td><p>Genre</p></td>
                    </tr>
                    <tr>
                        <td><img src="<%=request.getContextPath()%>/resources/Img/album.png"></td>
                        <td><p>Artist</p></td>
                        <td><p>Genre</p></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</section>
</body>
</html>