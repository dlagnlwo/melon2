// 클릭하여 드롭다운 메뉴 토글하기
document.addEventListener('DOMContentLoaded', function() {
    var dropdown_title = document.getElementById('dropdown-title');    
    var button1 = document.querySelector('.dropbtn');
    
    button1.addEventListener('click', function() {
        // 버튼을 클릭하면 드롭다운 메뉴를 토글합니다.
        dropdown_title.classList.toggle('show');
    });
    // 다른 곳을 클릭하면 드롭다운을 닫습니다.
    window.addEventListener('click', function(event) {
        if (!event.target.matches('.dropbtn')&&!event.target.matches('.btn')) {
            if (dropdown_title.classList.contains('show')) {
                dropdown_title.classList.remove('show');
            }
        }
    });
});