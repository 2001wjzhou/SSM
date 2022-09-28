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
<h3>查看学生的基本信息</h3>
<div id="list1">
<table>
    <caption>学生信息表</caption>
    <thead>
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>性别</th>
        <th>地址</th>
        <th>年龄</th>
    </tr>
    </thead>
   <tbody>
    <c:forEach items="${basicinflist}" var="Basic_inf">
        <tr>
                <td>id：${Basic_inf.id}<br/></td>
                <td>姓名：${Basic_inf.name}<br/></td>
                <td>性别：${Basic_inf.sex}<br/></td>
                <td>地址：${Basic_inf.address}<br/></td>
                <td>年龄：${Basic_inf.age}<br/></td>
        </tr>

    </c:forEach>
   </tbody>
</table>
<a href="javascript:history.back(-1)">点击返回</a>
</div>
</body>
</html>
