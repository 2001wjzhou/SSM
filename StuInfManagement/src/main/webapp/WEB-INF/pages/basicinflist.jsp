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
   <%-- <style>

        body{
            background-image: url("../images/back.jpg");
            background-size: cover;
        }
        #list1{
            width: 70%;
            height: 90%;
            background-color: rgba(123,123,123,0.4);
            margin: auto;
            text-align: center;
            border-radius: 10px;
            font-size: large;
        }
        table{
            margin: auto;
        }
        a{
            text-decoration: none;
        }
    </style>
--%>
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
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${basicinflist}" var="Basic_inf">
        <tr>
            <form action="updatebasicinf" method="post">
                <td>id：<input type="text" name="id" value="${Basic_inf.id}"><br/></td>
                <td>姓名：<input type="text" name="name" value="${Basic_inf.name}"><br/></td>
                <td>性别：<input type="text" name="sex" value="${Basic_inf.sex}"><br/></td>
                <td>地址：<input type="text" name="address" value="${Basic_inf.address}"><br/></td>
                <td>年龄：<input type="text" name="age" value="${Basic_inf.age}"><br/></td>
                <td><a href="deletebasicinf?id=${Basic_inf.id}">删除|</a> <input type="submit" value="更新"><br/>
                </td>
            </form>
            <br/>
        </tr>

    </c:forEach>
    </tbody>
</table>
<form action="insertbasicinf" method="post">
    id：<input type="text" name="id">
    姓名：<input type="text" name="name">
    性别：<input type="text" name="sex">
    地址：<input type="text" name="address">
    年龄：<input type="text" name="age">
    <input type="submit" value="保存">

</form>

<a href="javascript:history.back(-1)">点击返回</a>
</div>
</body>
</html>
