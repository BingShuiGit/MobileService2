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
    
    <title>编辑用户</title>
    
	<%--<script type="text/javascript">--%>
	<%--function updateUser(){--%>
		<%--var form = document.forms[0];--%>
		<%--form.action = "<%=basePath%>user/updateUser";--%>
		<%--form.method="post";--%>
		<%--form.submit();--%>
	<%--}--%>
<%--</script>--%>

  </head>
  
  <body>
    <h1>编辑用户</h1>
	<form action="<%=basePath%>user/updateUser" name="userForm" method="post">
		<input type="hidden" name="id" value="${user.id }"/>
		帐号：<input type="text" name="userId" value="${user.userId }"/>
		用户名：<input type="text" name="userName" value="${user.userName }"/>
		省份证图片：<input type="text" name="IDImage" value="${user.IDImage }"/>
		用户头像：<input type="text" name="userImage" value="${user.userImage }"/>
		薪资：<input type="text" name="salary" value="${user.salary }"/>
		会员：<input type="text" name="isVip" value="${user.isVip }"/>
		<input type="submit" value="更新" />
	</form>
  </body>
  
</html>
