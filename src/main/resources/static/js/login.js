$login = {
    login: function () {
        var id = document.getElementById("id").value;
        var password = document.getElementById("password").value;
        var url = "/api/login"
        var param = {
            id: id,
            password: password
        }
        $ajax.post(url, param, $login.callback, $login.errCallback);
    },

    callback: function (response) {
        var jsonResponse = JSON.parse(response);
        if (jsonResponse.rtnCd == 0) {
            alert("로그인 성공");
        } else {
            if (jsonResponse.rtnMsg != '') {
                alert(jsonResponse.rtnMsg);
            } else {
                alert("시스템 오류입니다.");
            }
        }
    },

    errCallback: function (response) {
        alert("시스템 오류입니다.");
    }

}