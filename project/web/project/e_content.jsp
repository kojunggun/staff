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
      
<form action="staffServlet" method="post" enctype="multipart/form-data" name="frm">
<input type="hidden" name="commnad" value="employee_update_form">

   <table align="center">
        <tr >
        	<th>사번 </th>
        	<td>${emp.empno }</td>
        </tr>
        <tr>
        	<th>ID</th>
        	<td>${emp.id }
		</tr>
		<tr>
			<th>사원명</th>
			<td>${emp.ename }</td>
		</tr>
		<tr>
			<th>주민번호</th>
			<td>${emp.fjumin }-${emp.bjumin }</td>
		</tr>
		<tr>
			<th>입사일</th>
			<td>${emp.hiredate }</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>${emp.email }</td>
		</tr>
		<tr>
			<th>우편번호</th>
			<td>${emp.zipcode }</td>
		</tr>
		<tr>
			<th>주소</th>
			<td>${emp.addr }</td>
		</tr>
		<tr>
			<th>상세주소</th>
			<td>${emp.deaddr }</td>
		</tr>
		<tr>
			<th>급여</th>
			<td>${emp.sal }</td>
		</tr>
		<tr>
			<th>비고</th>
			<td>${emp.etc }</td>
		</tr>
		<tr>
			<th>사원등록일</th>
			<td>${emp.eregdate }</td>
		</tr>
		<tr>
			<th>관리자 여부</th>
			<td>${emp.admin }</td>
		</tr>
		<tr>
			<th>사진</th>
			<td><img id="pic" src="upload/${emp.epic }"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="수정">
				<input type="button" value="목록" onclick="location.href='staffServlet?command=employee_list_view'">
			</td>
		</tr>
  </table>
</form>
        
      </div>
		  
		<jsp:include page="footer.jsp"/>   
    </div>
</body>
</html>