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
    <caption>学生信息表</caption>
    <thead>
    <tr>
        <th>课程id</th>
        <th>课程名称</th>
        <th>教师</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>


    <c:forEach items="${cteacherlist}" var="course_teacher">
        <tr>
            <form action="updatecteacherinf" method="post">
                <td>课程id：<input type="text" name="courseId" value="${course_teacher.courseId}"><br/></td>
                <td>课程名称：<input type="text" name="course" value="${course_teacher.course}"><br/></td>
                <td>教师：<input type="text" name="teacher" value="${course_teacher.teacher}"><br/></td>
                <td><a href="deletecteacherinf?courseId=${course_teacher.courseId}">删除|</a> <input type="submit" value="更新"><br/>
                </td>
            </form>
            <br/>
        </tr>
    </c:forEach>
    </tbody>
</table>
<form action="insertcteacherinf" method="post">
   课程id：<input type="text" name="courseId">
    课程名称：<input type="text" name="course">
    教师：<input type="text" name="teacher">
    <input type="submit" value="保存">

</form>

<a href="javascript:history.back(-1)">点击返回</a>
</div>
</body>
</html>
