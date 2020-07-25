<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2020/7/24
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js\jquery-1.8.2.min.js"></script>
    <link href="css/css.css" rel="stylesheet">
</head>
<body>
    <table>
        <tr>
            <td>序号</td>
            <td>名称</td>
            <td>文章数量</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="l">
            <tr>
                <td>${l.cid}</td>
                <td>${l.bname}</td>
                <td>${l.count1}</td>
                <td>
                    <button onclick="list(${l.cid})">文章列表</button>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
    <script type="text/javascript">
        function list(cid) {
            location = "list?cid="+cid;
        }
    </script>
</html>
