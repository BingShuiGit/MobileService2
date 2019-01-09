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
    <title>手机列表</title>
    
	<script type="text/javascript">
	function del(id){
		$.get("<%=basePath%>mobile/delMobile?id=" + id,function(data){
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
    <h6><a href="<%=basePath%>mobile/toAddMobile">添加手机信息</a></h6>
	<table border="1">
		<tbody>
			<tr>
				<th>品牌</th>
				<th>型号</th>
				<th>版本</th>
				<th>运行容量</th>
				<th>SD卡容量</th>
				<th>IMEI</th>
				<th>越狱</th>
				<th>锁</th>
				<th>WiFi状态</th>
				<th>GPS状态</th>
				<th>蓝牙状态</th>
				<th>指纹状态</th>
				<th>扬声器状态</th>
				<th>震动器状态</th>
				<th>散光灯状态</th>
				<th>前置摄像头</th>
				<th>后置摄像头</th>
				<th>陀螺传感器</th>
				<th>指南针传感器</th>
				<th>加速感应器</th>
				<th>麦克风</th>
				<th>外观评级</th>
				<th>电池状态</th>
				<th>创建时间</th>
				<th>更新时间</th>
				<th>操作</th>
			</tr>
			<%--<c:if test="${!empty mobileList }">--%>
				<c:forEach items="${mobileList}" var="mobile">
					<tr>
						<td>${mobile.brand}</td>
						<td>${mobile.model }</td>
						<td>${mobile.version }</td>
						<td>${mobile.memory }</td>
						<td>${mobile.storage }</td>
						<td>${mobile.IMEI }</td>
						<td>${mobile.rootState }</td>
						<td>${mobile.simLock }</td>
						<td>${mobile.wifiState }</td>
						<td>${mobile.gpsState }</td>
						<td>${mobile.bluetooth }</td>
						<td>${mobile.fingerprint }</td>
						<td>${mobile.speaker }</td>
						<td>${mobile.vibration }</td>
						<td>${mobile.flashlightState }</td>
						<td>${mobile.frontCamera }</td>
						<td>${mobile.backCamera }</td>
						<td>${mobile.gyroscope }</td>
						<td>${mobile.orientation }</td>
						<td>${mobile.acceleration }</td>
						<td>${mobile.dbvalue }</td>
						<td>${mobile.deadPixel }</td>
						<td>${mobile.appearance }</td>
						<td>${mobile.battery_Status }</td>
						<td>${mobile.create_time }</td>
						<td>${mobile.update_time }</td>
						<td>
							<a href="<%=basePath%>mobile/getById?id=${mobile.id}">编辑</a>
							<a href="javascript:del('${mobile.id }')">删除</a>
						</td>
					</tr>				
				</c:forEach>
			<%--</c:if>--%>
		</tbody>
	</table>
  </body>
</html>
