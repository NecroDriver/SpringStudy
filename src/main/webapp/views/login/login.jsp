<%--
  Created by IntelliJ IDEA.
  User: mafh
  Date: 2017/7/31 0031
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <form action="/login/doLogin" method="post">
        <div>用户名：<input type="text" placeholder="请输入用户名" name="name"/></div>
        <div>密码：<input type="password" placeholder="请输入密码" name="password"/></div>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
