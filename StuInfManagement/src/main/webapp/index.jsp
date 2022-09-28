<%--
  Created by IntelliJ IDEA.
  User: 10729
  Date: 2022/5/24
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<style>
    #index {
        width: 30%;
        height: 50%;
        margin: 10% auto;
        background-color: aliceblue;
        text-align: center;
        border-radius: 10px;
    }
    h1 {
        line-height: 80px;
        background-color: cornflowerblue;
        border-radius: 10px;
    }
    a {
        line-height: 50px;
        text-decoration: none;
    }
</style>

</head>
<body>
<div id="index">

    <h1 >欢迎进入学生管理系统</h1>
    <div >
        <a href="teacherimpl"><h2>老师登录</h2></a>
    </div>
    <div >
        <a href="studentimpl"><h2>学生登录</h2></a>
    </div>

</div>

</body>
</html>
<script>
    h1:{
        align="center";
    }
    h2:{
        align="center";
    }
</script>
