<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
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
        <h2 style="text-align: center">사원 정보 목록</h2>
        <form action="">
         <table align="center" >
        	<tr>
        		<td>ID</td>
        		<td><input type="text" name="id" ></td>
        		<td>입사일</td>
        		<td><input type="date"  size=12 >~
        			<input type="date"  size=12 >
        		</td>
        		
        	</tr>
        	<tr>
        		<td>사원명</td>
        		<td><input type="text" name="name" ></td>
        		<td></td>
        		<td></td>
        		<td style="float: right"><input type="submit" name="search" value="조회"></td>
        	</tr>
       	 </table>
        </form><hr style="width: 800px">
        <table align="center">
		
        <tr >
        	<th>순번 </th>
        	<th>사번 </th>
        	<th>ID </th>
        	<th>사원명 </th>
        	<th>입사일</th>
        </tr>
        <c:forEach var="emp" items="${emplist }">
        <tr >
        	<td>${emp.empnum }</td>
      	    <td>${emp.empno }</td>
        	<td>${emp.id }</td>
        	<td><a href="staffServlet?command=employee_view&empno=${emp.empno}">${emp.ename }</a></td>
        	<td>${emp.hiredate }</td>
        </tr>
        </c:forEach>
        </table>
      </div>
		  
		<jsp:include page="footer.jsp"/>   
    </div>
</body>
</html>