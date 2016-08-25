<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/layout_style.css">

</head>
<body>
 <div id="container">
      <jsp:include page="header.jsp"/>  
      <div id="content" >
        <h2 align="center">공지사항 목록</h2>
		
		<table align="center">
        	<tr>
        		<th>글번호</th>
        		<th>작성자 </th>
        		<th>제목 </th>
        		<th>작성일 </th>
        		<th>조회수</th>
       	 </tr>							
       	 <c:forEach var="notice" items="${noticeList}">
       	 <tr>
       	 	 <td>${notice.notno}</td> 
       		 <td>관리자</td>
       		 <td><a href="staffServlet?command=notice_view&notno=${notice.notno }">${notice.notname}</a></td>
       		 <td>${notice.notdate}</td>
       		 <td>${notice.nothits }</td>
       	 </tr>
        </c:forEach>
        </table>
      </div>
		  
		<jsp:include page="footer.jsp"/>   
    </div>
</body>
</html>