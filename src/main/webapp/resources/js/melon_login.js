$(document).ready(function (){
    $('#login_btn').click(function (){
        if(id.value==""){
            alert("아이디를 입력해주세요.");
            id.focus();
            return false;
        }
        if(pw.value==""){
            alert("비밀번호를 입력해주세요.");
            pw.focus();
            return false;
        }
    });
});
