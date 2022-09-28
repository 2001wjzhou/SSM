<%--
  Created by IntelliJ IDEA.
  User: 10729
  Date: 2022/5/31
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="./css/index.css">
</head>
<body> stu
当前用户：${user.uname}    学生<br>
<div id="login">
    <div class="login2">
        <a href="student/score">查看成绩</a><br>
        <a href="student/classinf">查看班级信息</a><br>
        <a href="student/basicinf">查看学生基本信息</a><br>
        <a href="student/cteacher">查看课程教师</a><br>
    </div>

</div>

</body>
</html>
