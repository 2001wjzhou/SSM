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
<h3>查询账户信息</h3>
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
        <c:forEach items="${actlist}" var="Account">
            <tr>
                <form action="updateAccount" method="post">
                    <td>账户：<input type="text" name="account" value="${Account.account}"><br/></td>
                    <td>密码：<input type="text" name="password" value="${Account.password}"><br/></td>
                    <td><a href="deleteAccount?id=${Account.account}">删除|</a> <input type="submit" value="更新"><br/>
                    </td>
                </form>
                <br/>
            </tr>

        </c:forEach>
        </tbody>
    </table>
    <form action="insertAccount" method="post">
        账户：<input type="text" name="account">
        密码：<input type="text" name="password">
        <input type="submit" value="保存"><br/>

    </form>

    <a href="javascript:history.back(-1)">点击返回</a>
</div>

</body>
</html>
