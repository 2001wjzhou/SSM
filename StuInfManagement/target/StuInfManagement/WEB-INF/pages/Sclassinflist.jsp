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
    <caption>学生班级信息表</caption>
    <thead>
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>专业班级</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${classinflist}" var="Class_inf">
        <tr>
                <td>id：${Class_inf.id}<br/></td>
                <td>姓名：${Class_inf.name}<br/></td>
                <td>专业班级：${Class_inf.majorclass}<br/></td>
            <br/>
        </tr>

    </c:forEach>
    </tbody>
</table>


<a href="javascript:history.back(-1)">点击返回</a>
</div>
</body>
</html>
