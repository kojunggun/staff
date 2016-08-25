<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <h2 align="center">공지사항</h2>
		<form action="staffServlet" method="post" name="frm">
		<input type="hidden" name="command" value="notice_update_form">
		<input type="hidden" name="notno" value="${notice.notno }">
		
		<table align="center">
        	<tr>
        		<th>글번호</th>
        		<td class="inp">${notice.notno }</td>
        	</tr>
        	<tr>
        		<th>제목</th>
        		<td class="inp" colspan="5">${notice.notname }</td> 
        	</tr>
        	<tr >
        		<th>작성자</th>
        		<td class="inp">관리자</td>
        		<th>작성일자</th>
        		<td class="inp">${notice.notdate }</td>
        		<th>조회수</th>
        		<td class="inp" >${notice.nothits }</td>
        	</tr>
        	<tr>
        		<th>내용</th>
        		<td class="inp" colspan="5"><textarea cols="93" rows="20" disabled  >${notice.notcon }</textarea></td>
        	</tr>
        	
     	 	<tr >
   				<td colspan="5"> <input type="submit" value="수정">
   				<input type="button" value="삭제" onclick="location.href='staffServlet?command=notice_delete&notno=${notice.notno}'">
        		<input type="button" value="목록으로" onclick="location.href='staffServlet?command=notice_list_view'">
        		
        		
   				</td>
   				
   				
        	</tr>
        </table>
        </form>
      </div>
		  
		<jsp:include page="footer.jsp"/>   
    </div>
</body>
</html>