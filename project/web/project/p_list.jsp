<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/layout_style.css">
 <link rel="stylesheet" href="css/jquery-ui.min.css">
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="js/jquery-ui.min.js"></script>
<script>
$(function(){
	$("#testDatepicker1,#testDatepicker2").datepicker({
		changeMonth : true,
		dayNames:['월요일','화요일','수요일','목요일','금요일','토요일','일요일'],
		dayNamesMin:['월','화','수','목','금','토','일'],
		monthNamesShort:['1','2','3','4','5','6','7','8','9','10','11','12'],
		monthNames:['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월']
	});
});
</script>
</head>
<body>
  <div id="container">
      <jsp:include page="header.jsp"/>  
      <div id="content" >
        <h2 style="text-align: center">프로젝트 목록</h2>
        <form action="">
         <table align="center" >
        	<tr>
        		<td>ID</td>
        		<td><input type="text" name="id" ></td>
        		<td>등록일</td>
        		<td><input type="text"  id="testDatepicker1" name="rdate" size=12 >~
        			<input type="text"  id="testDatepicker2" name="rdate" size=12 >
        		</td>
        		
        	</tr>
        	<tr>
        		<td>프로젝트명</td>
        		<td><input type="text" name="id" ></td>
        		<td></td>
        		<td></td>
        		<td style="float: right"><input type="submit" name="search" value="조회"></td>
        	</tr>
       	 </table>
        </form><hr style="width: 800px">
        <table align="center">
        <tr>
        	<th>번호</th>
        	<th>아이디 </th>
        	<th>프로젝트 명 </th>
        	<th>시작일</th>
        	<th>종료일</th>
        	<th>수행역할</th>
        </tr>
        <c:forEach var="project" items="${projectList }">
        <tr>
        <td>${project.prono}</td>
        <td>${emp.id }</td>
        <td><a href="staffServlet?command=project_view&prono=${project.prono}">${project.pname}</a></td>
        <td>${project.prosta}</td>
        <td>${project.penddate}</td>
        <td>${project.pselect}</td>
        
        </tr>
        </c:forEach>
        </table>
      </div>
		  
		<jsp:include page="footer.jsp"/>   
    </div>
</body>
</html>