<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/layout_style.css">
 <style type="text/css">

 #inp_title{
 	width: 600px;
 }
 </style>
</head>
<body>
 <div id="container">
      <jsp:include page="header.jsp"/>  
      <div id="content" >
        <h2 style="text-align: center;">공지사항 수정</h2>
        
       <form action="staffServlet"name="frm" method="post">
        <input type="hidden" name="command" value="notice_update">
        <input type="hidden" name="notno" value="${notice.notno }">
        
        	<table id="rform" align="center" cellspacing="0" cellpadding="2" >
        		<tr>
        			<td colspan="3">공지사항 수정</td>
        		</tr>
        		<tr>
        			<td>글번호</td>
        			<td class="inp" colspan="3">${notice.notno }
        			</td>
        		</tr>
        		<tr>
        			<td>제목</td>
        			<td class="inp" colspan="3"><input type="text" id="inp_title" name="notname" value="${notice.notname }">
        			</td>
        		</tr>
        		<tr>
        			<td>작성자</td>
        			<td>작성일자 ${notice.notdate }</td>
        			<td>조회수 ${notice.nothits }</td>
        			
        		</tr>
        		<tr>
        			<td>내용</td>
        			<td class="inp" colspan="3"><textarea rows="10" cols="94" name="notcon" >${notice.notcon }</textarea></td>
        		</tr>
        		<tr>
        		<td></td>
        			<td align="center" colspan="2">
        				<input type="submit" name="regist" value="저장">
        				<input type="button"  value="취소" onclick="location.href='staffSerlvet?command=notice_list_view'">
        			</td>
        		</tr>
        	</table>
        </form>
      </div>
		  
		<jsp:include page="footer.jsp"/>   
    </div>
</body>
</html>