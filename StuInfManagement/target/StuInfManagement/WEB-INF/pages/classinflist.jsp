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
<h3>查看学生的班级信息</h3>
<div id="list1">
<table>
    <caption>学生信息表</caption>
    <thead>
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>专业班级</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${classinflist}" var="Class_inf">
        <tr>
            <form action="updateclassinf" method="post">
                <td>id：<input type="text" name="id" value="${Class_inf.id}"><br/></td>
                <td>姓名：<input type="text" name="name" value="${Class_inf.name}"><br/></td>
                <td>专业班级：<input type="text" name="majorclass" value="${Class_inf.majorclass}"><br/></td>
                <td><a href="deleteclassinf?id=${Class_inf.id}">删除|</a> <input type="submit" value="更新"><br/>
                </td>
            </form>
            <br/>
        </tr>

    </c:forEach>
    </tbody>
</table>
<form action="insertclassinf" method="post">
    <td>id：<input type="text" name="id"><br/></td>
    <td>姓名：<input type="text" name="name"><br/></td>
    <td>专业班级：<input type="text" name="majorclass"><br/></td>
    <input type="submit" value="保存"><br/>

</form>

<a href="javascript:history.back(-1)">点击返回</a>
</div>
</body>
</html>
