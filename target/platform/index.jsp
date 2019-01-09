<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>首页</title>

</head>

<body>
<a href="<%=basePath%>user/getAllUser">查询所有用户</a></h5>
<br>
<a href="<%=basePath%>user/getAllUserJson?json">查询用户(返回json)</a></h5>
<br>
<a href="<%=basePath%>user/id/4?json">查询用户4(返回json)</a></h5>
<br>
<a href="<%=basePath%>mobile/getAll">查询所有手机</a></h5>


<%--<br>--%>
<%--<a href="<%=basePath%>user/getAllUserJson?xml">查询用户(返回xml)</a></h5>--%>
<%--<br>--%>
<%--<a href="<%=basePath%>user/id/4.xml">查询用户4(返回xml)</a></h5>--%>

</body>
</html>