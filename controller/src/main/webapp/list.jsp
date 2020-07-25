<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2020/7/24
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js\jquery-1.8.2.min.js"></script>
    <link href="css/css.css" rel="stylesheet">
</head>
<body>
<form action="list" method="post">
    <input type="hidden" name="cpage">
    <input type="hidden" name="bid" value="1">
   那关键子查询: <input type="text" name="mohu1" value="${map.mohu1}">
    <input type="submit" value="查询">

</form>
<button onclick="add()">发布文章</button>
<table>
    <tr>
        <td>分类</td>
        <td>标题</td>
        <td>标签</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="l">
        <tr>
            <td>${l.bname}</td>
            <td>${l.title}</td>
            <td>${l.label}</td>
            <td>
                <button onclick="del(${l.lid})">删除</button>
                <button onclick="xiu(${l.lid})">删除</button>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="11">
            <button onclick="fenye(${p.isIsFirstPage()?1:p.getPrePage()})">上一页</button>
            <c:forEach items="${p.navigatepageNums}" var="n">
                <button onclick="fenye(${n})">${n}</button>
            </c:forEach>
            <button onclick="fenye(${p.isIsLastPage()?p.getPages():p.getNextPage()})">下一页</button>
        </td>
    </tr>
</table>

</body>
<script type="text/javascript">
    function fenye(cpage) {
        $("[name = 'cpage']").val(cpage);
        $("form").submit();
    }
    function list(cid) {
        location = "toList?cid="+cid;
    }
    function add() {
        location = "toAdd";
    }
    function del(lid) {
        location = "delete?lid="+lid
    }
    function xiu(lid) {
        location = "toXiu?lid="+lid;
    }

</script>
</html>
