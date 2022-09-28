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
<h3>查看学生的成绩信息</h3>
<div id="list1">


<table>
    <tr>
        <th>序号</th>
        <th>学号</th>
        <th>课程ID</th>
        <th>成绩</th>
    </tr>
    <c:forEach items="${scorelist}" var="score_inf">
        <tr>
            <form action="updateScore" method="post">
                <td>序号：<input type="text" name="l" value="${score_inf.l}"><br/></td>
                <td>学号：<input type="text" name="id" value="${score_inf.id}"><br/></td>
                <td>课程ID：<input type="text" name="courseId" value="${score_inf.courseId}"><br/></td>
                <td>成绩：<input type="text" name="score" value="${score_inf.score}"><br/></td>
                <td><a href="deleteScore?L=${score_inf.l}">删除|</a> <input type="submit" value="更新"><br/>
                </td>
            </form>
            <br/>
        </tr>

    </c:forEach>
</table>
<form action="insertScore" method="post">
    序号：<input type="text" name="L">
    学号：<input type="text" name="id">
    课程ID：<input type="text" name="courseId">
    成绩：<input type="text" name="score">
    <input type="submit" value="保存">
</form>
根据学号查看成绩
<form action="findById" method="post">
    请输入学号：<input type="text" name="id">
    <input type="submit" value="查找">
</form>
根据课程查看成绩
<form action="findByCourseId" method="post">
    请输入课程ID：<input type="text" name="courseId">
    <input type="submit" value="查找">
</form>
根据姓名查看成绩（多表查询）
<form action="findByName" method="post">
    请输入姓名：<input type="text" name="name">
    <input type="submit" value="查找">
</form>
<a href="javascript:history.back(-1)">点击返回</a>
</div>
</body>
</html>
