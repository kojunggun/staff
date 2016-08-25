<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="css/layout_style.css">
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
</script>
<style type="text/css">
td{
	width:70px;
	text-align: center;
}
</style>
</head>
<body>
  <div id="container">
      <jsp:include page="header.jsp"/>  
      <div id="content" >
        <h2 style="text-align: center;">프로젝트 등록</h2>
        
        <form action="staffServlet" method="post">
        <input type="hidden" name="command" value="project_write">
        	<table id="rform" align="center" cellspacing="0" cellpadding="2" >
        		<tr>
        			<td colspan="2">프로젝트 등록</td>
        		</tr>
        		<tr>
        			<td>사번</td>
        			<td class="inp">${emp.empno}</td>
        		</tr>
        		<tr>
        			<td>아이디</td>
        			<td class="inp">${emp.id}</td>
        		</tr>
        		
        		<tr>
        			<td>프로젝트 명</td>
        			<td class="inp"><input type="text" name="pname"/></td>
        		</tr>
        		<tr>
        			<td>프로젝트 시작일</td>
        			<td class="inp"><input  type="date" name="prosta"/></td>
        		</tr>
        		<tr>
        			<td>프로젝트 종료일</td>
        			<td class="inp"><input  type="date" name="penddate"/></td>
        		</tr>
        		<tr>
        		<td>상세내용</td>
        		<td class="inp"><textarea rows="8" cols="40" name="pcontent"></textarea></td>
        		</tr>
        		<tr>
        			<td>수행 역할</td>
        			<td class="inp">
        				<select name="pselect">
        					<option selected="selected" value="00">개발</option>
        					<option value="01">이것</option>
        					<option value="02">저것</option>
        					<option value="03">요것</option>
        				</select>
        		</tr>
        		<tr>
        		<td></td>
        			<td align="center">
        				<input type="submit" name="regist" value="등록">
        				<input type="reset"  value="취소">
        			</td>
        		</tr>
        	</table>
        </form>
      </div>
		  
		<jsp:include page="footer.jsp"/>   
    </div>
</body>
</html>