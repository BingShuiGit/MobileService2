<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>编辑手机</title>
    
	<%--<script type="text/javascript">--%>
	<%--function updateMobile(){--%>
		<%--var form = document.forms[0];--%>
		<%--form.action = "<%=basePath%>mobile/updateMobile";--%>
		<%--form.method="post";--%>
		<%--form.submit();--%>
	<%--}--%>
<%--</script>--%>

  </head>
  
  <body>
    <h1>编辑手机信息</h1>
	<form action="<%=basePath%>mobile/updateMobile" method="post">
		<input type="hidden" name="id" value="${mobile.id }"/>
		品牌：<input type="text" name="brand" value="${mobile.brand }"/>
		型号：<input type="text" name="model" value="${mobile.model }"/>
		版本：<input type="text" name="version" value="${mobile.version }"/>
		运行容量：<input type="text" name="memory" value="${mobile.memory }"/>
		SD卡容量：<input type="text" name="storage" value="${mobile.storage }"/>
		IMEI：<input type="text" name="IMEI" value="${mobile.IMEI }"/>
		越狱：<input type="text" name="rootState" value="${mobile.rootState }"/>
		锁：<input type="text" name="simLock" value="${mobile.simLock }"/>
		wifi状态：<input type="text" name="wifiState" value="${mobile.wifiState }"/>
		GPS状态：<input type="text" name="gpsState" value="${mobile.gpsState }"/>
		蓝牙状态：<input type="text" name="bluetooth" value="${mobile.bluetooth }"/>
		指纹状态：<input type="text" name="fingerprint" value="${mobile.fingerprint }"/>
		扬声器状态：<input type="text" name="speaker" value="${mobile.speaker }"/>
		震动器状态：<input type="text" name="vibration" value="${mobile.vibration }"/>
		闪光灯状态：<input type="text" name="flashlightState" value="${mobile.flashlightState }"/>
		前置摄像头：<input type="text" name="frontCamera" value="${mobile.frontCamera }"/>
		后置摄像头：<input type="text" name="backCamera" value="${mobile.backCamera }"/>
		陀螺传感器：<input type="text" name="gyroscope" value="${mobile.gyroscope }"/>
		指南针传感器：<input type="text" name="orientation" value="${mobile.orientation }"/>
		加速感应器：<input type="text" name="acceleration" value="${mobile.acceleration }"/>
		麦克风：<input type="text" name="dbvalue" value="${mobile.dbvalue }"/>
		坏点有无：<input type="text" name="deadPixel" value="${mobile.deadPixel }"/>
		外观评级：<input type="text" name="appearance" value="${mobile.appearance }"/>
		电池状态：<input type="text" name="battery_Status" value="${mobile.battery_Status }"/>
		创建时间：<input type="text" name="create_time" value="${mobile.create_time }"/>
		更新时间：<input type="text" name="update_time" value="${mobile.update_time }"/>
		<input type="submit" value="更新" />
	</form>
  </body>
  
</html>
