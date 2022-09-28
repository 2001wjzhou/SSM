<%--
  Created by IntelliJ IDEA.
  User: 10729
  Date: 2022/5/27
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="./css/login.css">
   <%-- <style>

    body{
        background-image: url("images/back.jpg");
        background-size: cover;
    }
    input {
        text-align: center;
    }
    #login{
        width: 30%;
        height: 50%;
        background-color: rgba(123,123,123,0.4);
        margin: auto;
        text-align: center;
        border-radius: 10px;
        font-size: large;
    }
    #login2{
        margin-top: 10%;
    }
    input{
        margin-top: 15%;
    }
    </style>--%>
</head>
<body>
<div id="login">
    <h2>管理员登录窗口</h2>
<br><br>${msg}

    <div>
        <form action="${pageContext.request.contextPath}/login" method="post">
            <div class="dl">用户名：<input type="text" name="uname"><br></div>

            <div class="dl">密码：<input type="password" name="upwd"><br></div>

            <input id="login3" type="submit" value="登录">
        </form>
    </div>

</div>


</body>
</html>
