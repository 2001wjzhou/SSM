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
学生<br>
<div id="context">
    <br>
    <h3>请选择你要进行的操作</h3>
    <div class="choose"><a href="student/score">查看成绩</a><br></div>
        <div class="choose"><a href="student/classinf">查看班级信息</a><br></div>
            <div class="choose"><a href="student/basicinf">查看学生基本信息</a><br></div>
                <div class="choose"><a href="student/cteacher">查看课程教师</a><br></div>
                    <br>
    <div class="choose">
    <a href="${pageContext.request.contextPath}/Slogout">退出</a>
    </div>
</div>

</body>
</html>
