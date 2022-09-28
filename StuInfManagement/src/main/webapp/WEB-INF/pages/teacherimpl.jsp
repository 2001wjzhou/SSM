<%--
  Created by IntelliJ IDEA.
  User: 10729
  Date: 2022/5/31
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="./css/contexts.css">
</head>
<body>
当前用户：${user.uname}
老师<br>
<div id="context">
    <br>
    <h3>请选择你要进行的操作</h3>
    <div class="choose">    <a href="account/findAll">查看所有账户</a><br></div>

    <div class="choose">    <a href="stuaccount/findAll">查看所有学生账户</a><br></div>

    <div class="choose">    <a href="basicinf/findAll">查看所有学生的基本信息</a><br></div>

    <div class="choose">    <a href="classinf/findAll">产看所有学生的班级信息</a><br></div>

    <div class="choose">    <a href="cteacherinf/findAll">查看课程信息</a><br></div>

    <div class="choose"> <a href="score/findAll">查看学生成绩</a><br></div>

    <h3>学生综合评价表文件上传</h3>
    请选择你要上传的文件:
    <form action="fileupload" method="post" enctype="multipart/form-data">
        <input type="file" name="upload">
        <input id="up" type="submit" value="上传">
    </form>
    <div class="choose">
    <a href="${pageContext.request.contextPath}/logout">退出</a>
    </div>
</div>

</body>
</html>
