<%--
  Created by IntelliJ IDEA.
  User: jeunghun
  Date: 10/27/23
  Time: 09:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style type="text/css">
        table{border-collapse:collapse;}
        table.wth {width: 500px;}
        tr,td{padding:3px;}
        td.head{
            font-size: 25px; font-weight: bold;
            text-align: center; padding:10px;
        }
        td.left{width: 80px; background-color:#dddddd; }
        td.right{width:420px;}
    </style>
</head>
<body>
<table class=  "wth">
    <tr><td class="head">레코드 입력</td></tr>
    <tr><td align="right"><a href="logout.do">로그아웃</a></td></tr>
</table>
<form name="insert" methodd=post action="insertBoard.do">
    <table border="1" class="wth">
        <tr>
            <td class="left">작성자</td>
            <td class="right"><input type=text name="writer" size=10></td>
        </tr>
        <tr>
            <td class="left">제목</td>
            <td class="right"><input type=text name="title" size=50></td>
        </tr>
        <tr>
            <td class="left">내용</td>
            <td class="right"><textarea rows="10" cols="50" name="content"></textarea></td>
        </tr>
    </table>
    <table class="wth" border=0>
        <tr>
            <td align="center">
                <input type="submit" value="SAVE">&nbsp;&nbsp;
                <input type="reset" value="CANCEL">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
