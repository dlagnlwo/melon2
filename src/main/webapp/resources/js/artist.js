// 곡 버튼 클릭 시 곡만 나오게 하는 기능
function showTable() {
    $(".song_tb").show();
    $(".artist_album").hide();
    $(".artist_info_body").hide();
    $(".artist_menu_right").show();
}

// 앨범 버튼 클릭 시 앨범만 나오게 하는 기능
function showAlbum() {
    $(".song_tb").hide();
    $(".artist_album").show();
    $(".artist_info_body").hide();
    $(".artist_menu_right").hide();
}

// 상세정보 버튼 클릭 시 상제정보만 나오게 하는 기능
function showInfo() {
    $(".song_tb").hide();
    $(".artist_album").hide();
    $(".artist_info_body").show();
}

$(document).ready(function() {
    // 초기화: 모든 탭을 숨기고, 선택한 탭을 활성화
    $(".show_table").addClass("active");

    // 곡 버튼 클릭 시
    $(".show_table").click(function() {
        $(".show_table").addClass("active");
        $(".show_album, .show_info").removeClass("active");
        showTable();
    });

    // 앨범 버튼 클릭 시
    $(".show_album").click(function() {
        $(".show_album").addClass("active");
        $(".show_table, .show_info").removeClass("active");
        showAlbum();
    });

    // 상세정보 버튼 클릭 시
    $(".show_info").click(function() {
        $(".show_info").addClass("active");
        $(".show_table, .show_album").removeClass("active");
        showInfo();
    });

    // 최신순, 인기순, 가나다순을 눌렀을 때
    $(".artist_song_latest_text, .artist_song_popularity_text, .artist_song_alphabetically_text").click(function() {
        $(".artist_song_latest_text, .artist_song_popularity_text, .artist_song_alphabetically_text").removeClass("sort");
        $(this).addClass("sort");
        if ($(".show_table").hasClass("active")) {
            showTable();
        } else if ($(".show_album").hasClass("active")) {
            showAlbum();
        } else if ($(".show_info").hasClass("active")) {
            showInfo();
        }
    });
});

// 상세정보를 누르면 최신순, 인기순, 가나다순, 전체재생, 전체선택이 안보이게 하는 기능
$(".show_info").click(function () {
    $(".artist_sort_and_play").hide();
    if( $(".show_table").click(function () {
        $(".artist_sort_and_play").show();
    }));
});

// 곡, 앨범, 상세정보를 누르면 색깔이 바뀌게 하는 기능
$(document).ready(function() {
    // 클릭한 요소를 초록색으로 변경
    $(".show_table, .show_album, .show_info").click(function() {
        // 모든 요소의 색상을 하얀색으로 초기화
        $(".show_table, .show_album, .show_info").removeClass("active");
        // 클릭한 요소의 색상을 초록색으로 변경
        $(this).addClass("active");
    });
});

//체크박스 전체선택버튼
function selectAll() {
    let checkboxes = document.querySelectorAll(".check_tb");
    let allChecked = true;

    for (let i = 0; i < checkboxes.length; i++) {
        if (!checkboxes[i].checked) {
            allChecked = false;
            break;
        }
    }
    // 만약 모든 체크박스가 선택된 경우에 전체 해제
    if (allChecked) {
        for (let i = 0; i < checkboxes.length; i++) {
            checkboxes[i].checked = false;
        }
    } else {
        // 그렇지 않은 경우에는 전체 선택
        for (let i = 0; i < checkboxes.length; i++) {
            checkboxes[i].checked = true;
        }
    }
}


