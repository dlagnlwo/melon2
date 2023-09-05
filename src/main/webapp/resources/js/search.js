//https://www.youtube.com/watch?v=bWbyhYUkwDQ&list=PLRx0vPvlEmdD2mcWus8hakX103PwcSJe8

$.ajax({
   url:"/search/album",
    type:"get",
    data:"",
    async: true, // (true: 비동기 / false: 동기), 생략시 비동기
    success:function(){
       location.href="/result";
    }
});

albumpos.addEventListener('click', function (){

});

