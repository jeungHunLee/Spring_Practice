<%--
  Created by IntelliJ IDEA.
  User: jeunghun
  Date: 11/4/23
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <style type="text/css">
        table { boarder-collapse:collapse; }
        table.wth { width:250px; }
        tr,td { padding:3px; }
        td.head{
            font-size:25px; font-weight:bold;
            text-align:center; padding:10px;
        }
        td.left { width:80px; background-color:#dddddd; }
        td.right { width:170px; }
    </style>
    <title>로그인</title>
</head>
<body>
<table class="wth">
    <tr><td class="head">로그인</td></tr>
</table>
<form action="login.do" method="post">
    <table border="1">
        <tr>
            <td class="left">아이디</td>
            <td class="right"><input type="text" name="id" value="${user.id}"/></td>
        </tr>
        <tr>
            <td class="left">비밀번호</td>
            <td><input type="password" name="password"/></td>
        </tr>
    </table>
    <table class="wth" border="0">
        <tr>
            <td align="center">
                <input type="submit" value="로그인"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
