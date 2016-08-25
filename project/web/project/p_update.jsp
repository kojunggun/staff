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
		 <form action="staffServlet"name="frm" method="post">
        <input type="hidden" name="command" value="project_update">
        <input type="hidden" name="prono" value="${project.prono }">
		<table align="center">
        	
        	<tr>
        		<th>프로젝트 번호</th>
        		<td class="inp" colspan="5">${project.prono}</td> 
        	</tr>
        	<tr>
        		<th>프로젝트 명</th>
        		<td class="inp" colspan="5"><input type="text"  style="width: 500px" name="pname"value="${project.pname}"></td> 
        	</tr>
        	<tr >
        		<th>사번</th>
        		<td class="inp"><input type="text" disabled value="관리자"></td>
        		<th>아이디</th>
        		<td class="inp"><input type="text" disabled ></td>
        		<th>기간</th>
        		<td class="inp">${project.prosta}</td>
        	
        	<tr>
        		<th>프로젝트 내용</th>
        		<td class="inp" colspan="5"><textarea cols="90" rows="10" name="pcontent" >${project.pcontent }</textarea></td>
        	</tr>
        	<tr>
        		<th>수행 역할</th>
        		<td>
        			<select>
        				<option selected="selected" value="00">개발</option>
        				<option value="01">이것</option>
        				<option value="02">저것</option>
        				<option value="03">요것</option>
        			</select>
        	</tr>
     	 	<tr >
   				<td colspan="6"> <input type="submit" value="확인">
        		<input type="button" value="취소">
   				</td>
   				
   				
        	</tr>
        </table>
        </form>
      </div>
		  
		<jsp:include page="footer.jsp"/>   
    </div>
</body>
</html>