<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加用户</title>
    
	<%--<script type="text/javascript">--%>
	<%--function addUser(){--%>
		<%--var form = document.forms[0];--%>
		<%--form.action = "<%=basePath%>user/addUser";--%>
		<%--form.method="post";--%>
		<%--form.submit();--%>
	<%--}--%>
<%--</script>--%>

  </head>
  
  <body>
    <h1>添加用户</h1>
	<form action="<%=basePath%>user/addUser" name="userForm" method="post">
		帐号：<input type="text" name="UserId" value="${user.UserId }"/>
		用户名：<input type="text" name="userName" value="${user.userName }"/>
		省份证图片：<input type="text" name="IDImage" value="${user.IDImage }"/>
		用户头像：<input type="text" name="userImage" value="${user.userImage }"/>
		薪资：<input type="text" name="salary" value="${user.salary }"/>
		会员：<input type="text" name="isVip" value="${user.isVip }"/>
		<input type="submit" value="添加">
	</form>
  </body>
</html>
