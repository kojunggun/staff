<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="wrapper">
	<div class="container">
		
		<h1>사원 관리 프로그램</h1>
		
		<form method="post" class="form" name="frm" action="staffServlet">
			<input type="hidden" name="command" value="login_action">
			<input type="text" placeholder="아이디" name="id" >  
			<input type="password" placeholder="비밀번호" name="pswd" ><!-- required="required"  -->
			<button type="submit" id="login-button" >로그인</button>
		</form>
	</div>
	
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
	
</div>
 
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script src="js/index.js"></script>

</body>
</html>