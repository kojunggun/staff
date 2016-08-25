<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/layout_style.css">
 <style type="text/css">
 textarea {
	overflow-y:scroll;
	resize:none; 	
}
 </style>
</head>
<body>
 <div id="container">
      <jsp:include page="header.jsp"/>  
      <div id="content" >
        <h2 align="center">프로젝트 상세</h2>
		<form action="staffServlet?command=project_update_form&prono=${project.prono }" method="post">
		<table align="center">
			<tr>
				<th>프로젝트 번호</th>
				<td>${project.prono }</td>
			</tr>
        	<tr>
        		<th>프로젝트 명</th>
        		<td class="inp" colspan="5">${project.pname }</td> 
        	</tr>
        	<tr >
        		<th>사번</th>
        		<td class="inp">${emp.empno}</td>
        		<th>아이디</th>
        		<td class="inp">${emp.id }</td>
        		<th>기간</th>
        		<td class="inp" >${project.prosta}~${project.penddate }</td>
        	
        	<tr>
        		<th>프로젝트 내용</th>
        		<td class="inp" colspan="5"><textarea cols="90" rows="10" disabled >${project.pcontent}</textarea></td>
        	</tr>
        	<tr>
        	<th>수행 역할</th>
        		<td class="inp">${project.pselect}</td>
        	</tr>
     	 	<tr >
   				<td colspan="6"> <input type="submit" value="수정">
        		<input type="button" value="취소" onclick="location.href='staffServlet?command=project_list_view'"></td>
   				
   				
        	</tr>
        </table>
        </form>
      </div>
		  
		<jsp:include page="footer.jsp"/>   
    </div>
</body>
</html>