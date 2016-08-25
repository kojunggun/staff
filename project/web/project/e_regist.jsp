<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/layout_style.css">
<link rel="stylesheet" href="css/tab_style.css">
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script>
$(function(){
        $("#epic").on('change', function(){
            readURL(this);
        });
    });

    function readURL(input) {
        if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
                $('#pic').attr('src', e.target.result);
            }

          reader.readAsDataURL(input.files[0]);
        }
    }
</script>
<style type="text/css">
textarea {
	resize: none;
}
#pic{
}
</style>
</head>
<body>
 <div id="container">
      <jsp:include page="header.jsp"/>  
      <div id="content" >
        
        <form action="staffServlet?command=employee_write" method="post" enctype="multipart/form-data" >
        	<table id="rform" align="center" cellspacing="0" cellpadding="2" >
        		<tr>
        			<td style="text-align:center;" colspan="3">사원 등록</td>
        		</tr>
        		<tr>
        			<td colspan="2"></td>
        			<td rowspan="8"><div id="picsize"><img id="pic" src="#"></div><input type="file" name="epic" id="epic"></td>
        		</tr>
        		<tr>
        			<td>사번</td>
        			<td class="inp"><input type="hidden" name="empno"value= ${emp.empno}>
        			</td>
        		</tr>
        		<tr>
        			<td>이름</td>
        			<td class="inp"><input type="text" name="ename">
        			</td>
        		</tr>
        		<tr>
        			<td>ID</td>
        			<td class="inp"><input type="text" name="id">
        			</td>
        		</tr>
        		<tr>
        			<td>비밀번호</td>
        			<td class="inp"><input type="password" name="pswd">
        			</td>
        		</tr>
        		<tr>
        			<td>주민번호</td>
        			<td class="inp"><input type="text" name="fjumin"maxlength="6" size="12" >-
        							<input type="text" name="bjumin" maxlength="7"size="12"></td>
        		</tr>
        		<tr>
        		<td>부서</td>
        			<td class="inp">
        				<select name="deptno">
        					<option selected="selected" value="00">개발부</option>
        					<option value="01">인사부</option>
        					<option value="02">총무부</option>
        					<option value="03">관리부</option>
        				</select>
        				</td>
        		</tr>
        			<tr>
        		<td>직급</td>
        			<td class="inp">
        				<select name="jobno">
        					<option selected="selected" value="00">사원</option>
        					<option value="01">주임</option>
        					<option value="02">대리</option>
        					<option value="03">과장</option>
        					<option value="03">차장</option>
        					<option value="03">부장</option>
        				</select>
        				</td>
        		</tr>
        		<tr>
        			<td>입사일</td>
        			<td  class="inp"><input type="date"name="hiredate"></td>
        		</tr>
        		<tr>
        			<td>퇴사일</td>
        			<td  class="inp"><input type="date"name="resigndate"></td>
        		</tr>
        		<tr>
        			<td>급여</td>
        			<td class="inp"><input type="text" size="10" name="sal">
        			</td>
        		</tr>
        		<tr>
        			<td>비고</td>
        			<td class="inp"><textarea rows="4" cols="40"name="etc"></textarea>
        			</td>
        		</tr>
        		<tr>
        			<td>등록일</td>
        			<td  class="inp"><input type="date"name="eregdate"></td>
        		</tr>
        		<tr>
        		<td colspan="3">
        		 <div id="tab1" class="tab_menu">
    				<ul class="tab_list">
    			  	  <li class="active"><a href="#">자격증</a></li>
   				      <li><a href="#">학력</a></li>
    				  <li><a href="#">경력</a></li>
   				   </ul>
   				    <ul class="tab_content">
	  				  <li class="active">자격증입니다자격증입니다자격증입니다자격증입니다자격증입니다자격증입니다자격증입니다자격증입니다자격증입니다자격증입니다</li>
 	 			      <li>학력이구요학력이구요학력이구요학력이구요학력이구요학력이구요학력이구요학력이구요학력이구요학력이구요학력이구요학력이구요학력이구요학력이구요</li>
 			     	  <li>경력입니다경력입니다경력입니다경력입니다경력입니다경력입니다경력입니다경력입니다경력입니다경력입니다경력입니다경력입니다경력입니다경력입니다경력입니다</li>
 				   </ul>
				 </div>
        		</td>
        		</tr>
        		<tr>
        			<td colspan="3">
        				<input type="submit" name="regist" value="가입하기">
        				<input type="reset"  value="취소하기">
        			</td>
        		</tr>
        		
        	</table>
        </form>
      </div>
		  
		<jsp:include page="footer.jsp"/>   

<script type="text/javascript">

$('#tab1').find('.tab_list li').on('click', 'a', function(){
var $parent = $(this).parent();
var idx = $parent.index();
	$parent.addClass('active')
	.siblings().removeClass('active');
	$('.tab_content li').eq(idx).addClass('active')
	.siblings().removeClass('active');
});

	

</script>
    </div>
</body>
</html>