<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<html lang="kr">
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
    <script type="application/javascript" src="/js/login.js"></script>
    <script type="application/javascript" src="/js/lib/ajax.js"></script>
</head>
<body>
로그인
<br>
아이디 : <input type="text" id="id">
비밀번호 : <input type="text" id="password">
<button onclick="$login.login()">로그인</button>
<button onclick="$login.signUp()">회원가입</button>

</body>
</html>