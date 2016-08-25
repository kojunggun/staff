/*$("#login-button").click(function(event){
	 event.preventDefault();
	 $('form').fadeOut(500);
	 $('.wrapper').addClass('form-success');
	 setTimeout("location.href=''",700);
});*/
 
function loginCheck(){
	if(document.frm.userid.value.length ==0){
		alert("아이디 입력");
		frm.userid.focus();
		return false;
	}
	if(document.frm.userpwd.value.length ==0){
		alert("비밀번호 입력");
		frm.userpwd.focus();
		return false;
	}
	return true;
}		
function noticeCheck(){
	if(document.frm.title.value.length ==0){
		alert("제목 입력");
		frm.title.focus();
		return false;
	}
	if(document.frm.content.value.length ==0){
		alert("내용 입력");
		frm.content.focus();
		return false;
	}
	return true;
}