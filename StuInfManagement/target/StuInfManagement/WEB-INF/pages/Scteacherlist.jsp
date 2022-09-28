<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 10729
  Date: 2022/5/30
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../css/list1.css">
</head>
<body>
<h3>查看课程及教师信息</h3>
<div id="list1">
<table>
    <tr>
        <th>课程id</th>
        <th>课程名称</th>
        <th>教师</th>
    </tr>
    <c:forEach items="${cteacherlist}" var="course_teacher">
        <tr>
                <td>课程id：${course_teacher.courseId}<br/></td>
                <td>课程名称：${course_teacher.course}<br/></td>
                <td>教师：${course_teacher.teacher}<br/></td>
            <br/>
        </tr>
    </c:forEach>
</table>
<a href="javascript:history.back(-1)">点击返回</a>
</div>
</body>
</html>
