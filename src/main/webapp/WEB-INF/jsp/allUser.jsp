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
    <script type="text/javascript" src="js/jquery-1.7.1.js"></script>
    <title>用户列表</title>
    
	<script type="text/javascript">
	function del(id){
		$.get("<%=basePath%>user/delUser?id=" + id,function(data){
			if("success" == data.result){
				alert("删除成功");
				window.location.reload();
			}else{
				alert("删除失败");
			}
		});
	}
</script>
  </head>
  
  <body>
    <h6><a href="<%=basePath%>user/toAddUser">添加用户</a></h6>
	<table border="1">
		<tbody>
			<tr>
				<th>id</th>
				<th>用户帐号</th>
				<th>用户名</th>
				<th>身份证照片</th>
				<th>用户头像</th>
				<th>薪资</th>
				<th>会员</th>
				<%--<th>爱好</th>--%>
				<th>操作</th>
			</tr>
			<%--<c:if test="${!empty userList }">--%>
				<c:forEach items="${userList}" var="user">
					<tr>
						<td style="display: block">${user.id}</td>
						<td>${user.userId }</td>
						<td>${user.userName }</td>
						<td>${user.IDImage }</td>
						<td>${user.userImage }</td>
						<td>${user.salary }</td>
						<td>${user.isVip }</td>
						<%--<td>${user.hobbies }</td>--%>
						<td>
							<a href="<%=basePath%>user/getUser?id=${user.id}">编辑</a>
							<a href="javascript:del('${user.id }')">删除</a>
						</td>
					</tr>				
				</c:forEach>
			<%--</c:if>--%>
		</tbody>
	</table>
  </body>
</html>
