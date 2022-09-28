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
    <caption>学生信息表</caption>
    <thead>
    <tr>
        <th>序号</th>
        <th>学号</th>
        <th>课程ID</th>
        <th>成绩</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${scorelist}" var="score_inf">
        <tr>
                <td>序号：${score_inf.l}<br></td>
                <td>学号：${score_inf.id}<br></td>
                <td>课程ID：${score_inf.courseId}<br></td>
                <td>成绩：${score_inf.score}<br></td>
            <br/>
        </tr>

    </c:forEach>
    </tbody>
</table>

</form>

<a href="javascript:history.back(-1)">点击返回</a>
</div>
</body>
</html>
