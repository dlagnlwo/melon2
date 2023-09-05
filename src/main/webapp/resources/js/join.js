$(document).ready(function (){
    $('#join_btn').click(function (){
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
        if(email.value==""){
            alert("이메일 입력해주세요.");
            email.focus();
            return false;
        }
        if(membername.value==""){
            alert("이름을 입력해주세요.");
            membername.focus();
            return false;
        }
        if(birth.value==""){
            alert("생년월일을 입력해주세요.");
            birth.focus();
            return false;
        }
        if(tel.value==""){
            alert("휴대폰 번호를 입력해주세요.");
            tel.focus();
            return false;
        }
    });
});