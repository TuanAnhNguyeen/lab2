<%--
  Created by IntelliJ IDEA.
  User: Duy
  Date: 6/30/2021
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tam Giác</title>
</head>
<body>
    <h1>Tam Giác</h1>
    <form action="tamgiac" method="post">
        <input type="text" name="canhA" placeholder="nhập cạnh a">
        <br>
        <input type="text" name="canhB"  placeholder="nhập cạnh b">
        <br>
        <input type="text" name ="canhC"  placeholder="nhập cạnh c">
        <br>
        <button formaction="dientich">Tính Diện Tich</button>
        <button formaction="chuvi">Tính Chu Vi</button>
    </form>
        <h3>${msg}</h3>
</body>
</html>
