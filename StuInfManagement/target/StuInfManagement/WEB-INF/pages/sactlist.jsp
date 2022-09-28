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
<h3>查询学生账户</h3>
<div id="list1">
<table>
    <caption>学生信息表</caption>
    <thead>
    <tr>
        <th>账户</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sactlist}" var="Stuaccount">
        <tr>
            <form action="updateStuaccount" method="post">
                <td>账户：<input type="text" name="account" value="${Stuaccount.account}"><br/></td>
                <td>密码：<input type="text" name="password" value="${Stuaccount.password}"><br/></td>
                <td><a href="deleteStuaccount?account=${Stuaccount.account}">删除|</a> <input type="submit" value="更新"><br/>
            </td>
            </form>
            <br/>
        </tr>

    </c:forEach>
    </tbody>
</table>
<%--类型 状态报告  描述 由于被认为是客户端对错误（例如：畸形的请求语法、无效的请求信息帧或者虚拟的请求路由），服务器无法或不会处理当前请求。--%>
<form action="deleteStuaccount" method="post">
    要删除的账户：<input type="text" name="account">
    <input type="submit" value="删除"><br/>

</form>
<form action="insertStuaccount" method="post">
    账户：<input type="text" name="account">
    密码：<input type="text" name="password">
    <input type="submit" value="保存"><br/>

</form>

<a href="javascript:history.back(-1)">点击返回</a></body>
</div>
</body>
</html>
