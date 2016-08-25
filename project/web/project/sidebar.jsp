<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/layout_style.css">
<style type="text/css">
html, body {
 margin: 0; padding: 0; 
 }
ul.menu {
 margin: 50px auto 0 auto;

  }
</style>
</head>
<body>
  		
       
<ul class="menu">
	<li><a href="staffServlet?command=main_view">HOME</a></li>
	<li><a href="#">공지사항</a>
		<ul>
			<li><a href="staffServlet?command=notice_list_view" class="documents">공지사항 목록</a></li>
			<li><a href="staffServlet?command=notice_write_form" class="documents">공지사항 등록</a></li>
		</ul>
	</li>
	<li><a href="#">프로젝트 관리</a>
		<ul>
			<li><a href="staffServlet?command=project_list_view" class="documents">개인 프로젝트 목록</a></li>
			<li><a href="staffServlet?command=project_write_form" class="messages">개인 프로젝트 등록</a></li>
		</ul>
	
	</li>
	<li><a href="#">개인 정보 관리</a>
		<ul>
			<li><a href="staffServlet?command=employee_list_view" class="documents">사원 정보 목록</a></li>
			<li><a href="staffServlet?command=employee_write_form&" class="messages">사원 정보 등록</a></li>
		</ul>
	</li>
	<li style="float: right;" id="logout"><a href="staffServlet?command=logout_action">로그아웃</a>
	<li style="float: right;" id="name"><a href="#">${userid}님 로그인</a>
	</li>
</ul>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script>
jQuery.noConflict();
$(function () {
    $("#logout").click(function() {
	if(confirm("정말 로그아웃") == true){
		return true;
	}else{
		return false;
	}
    });
});
</script>

</body>
</html>