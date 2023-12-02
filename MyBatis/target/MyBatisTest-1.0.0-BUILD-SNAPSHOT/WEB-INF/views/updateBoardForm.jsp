<%--
  Created by IntelliJ IDEA.
  User: jeunghun
  Date: 10/27/23
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <style type="text/css">
        table { boarder-collapse:collapse }
        table.wth { width:500px; }
        tr, td { padding:3px; }
        td.head {
            font-size:25px; font-weight:bold;
            text-align:center; padding:10px;
        }
        td.left { width:80px; background-color:#dddddd; }
        td.right { width:420px; }
    </style>
</head>
<body>
    <table class="wth">
        <tr><td class="head">레코드 수정</td></tr>
        <tr><td align="right"><a href="logout.do">로그아웃</a></td></tr>
        <form method="post" name="update" action="updateBoard.do?seq=${board.seq}">
            <table border="1">
                <tr>
                    <td class="left">번호</td>
                    <td class="right">${board.seq}</td>
                </tr>
                <tr>
                    <td class="left">작성자</td>
                    <td class="right">${board.writer}</td>
                </tr>
                <tr>
                    <td class="left">제목</td>
                    <td class="right">
                        <input type="text" name="title" size="50" value="${board.title}">
                    </td>
                </tr>
                <tr>
                    <td class="left">내용</td>
                    <td class="right">
                        <textarea rows="10" cols="50" name="content">${board.content}</textarea>
                    </td>
                </tr>
            </table>
            <table class="wth" border="0">
                <tr>
                    <td align="center">
                        <input type="submit" value="SAVE">&nbsp;&nbsp;
                        <input type="reset" value="CANCEL">
                    </td>
                </tr>
            </table>
        </form>
    </table>
</body>
</html>
