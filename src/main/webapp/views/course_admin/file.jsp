<%--
  Created by IntelliJ IDEA.
  User: mafh
  Date: 2017/7/25 0025
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我不是真正的慕课网</title>
    <link rel="stylesheet" href="/css/main.css" type="text/css">
</head>
<body>
    <div align="center">
        <h1>点击上传文件</h1>
        <form action="/courses/upload" method="post" enctype="multipart/form-data">
            <input type="file" name="file"/>
            <input type="submit"/>
        </form>
    </div>
</body>
</html>
