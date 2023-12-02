<%--
  Created by IntelliJ IDEA.
  User: jeunghun
  Date: 10/25/23
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <style type="text/css">
        table { border-collapse: collapse; }
        table.wth { width: 500px; }
        tr, td { padding:3px; }
        td.head {
            font-size:25px; font-weight: bold;
            text-align:center; padding: 10px;
        }
        td.left { width: 80px; background-color:#dddddd; }
        td.right { width:420px; }
    </style>
</head>
<body>
    <table class="wth">
        <tr><td class="head">레코드 내용</td></tr>
        <tr><td align="right"><a href="logout.do">로그아웃</a></td></tr>
    </table>
    <table border="1">
        <tr>
            <td class="left">번호</td>
            <td class="right">${board.seq}</td>
        </tr>
        <tr>
            <td class="left">제목</td>
            <td class="right">${board.title}</td>
        </tr>
        <tr>
            <td class="left">작성자</td>
            <td class="right">${board.writer}</td>
        </tr>
        <tr>
            <td class="left">내용</td>
            <td class="right">
                <p style="white-space: pre-line;">${board.content}</p>
            </td>
        </tr>
    </table>
    <table class="wth" border="0">
        <tr>
            <td align="center">
                <input type="button" value="입력" onClick=location.replace("insertBoardForm.do")>
                <input type="button" value="수정" onClick=location.replace("updateBoardForm.do?seq=${board.seq}")>
                <input type="button" value="삭제" onClick=location.replace("deleteBoard.do?seq=${board.seq}")>
                <input type="button" value="리스트" onClick=location.replace("getBoardList.do")>
            </td>
        </tr>
    </table>
</body>
</html>
