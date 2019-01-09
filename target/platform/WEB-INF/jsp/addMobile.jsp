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
    
    <title>添加手机</title>
    
	<%--<script type="text/javascript">--%>
	<%--function addMobile(){--%>
		<%--var form = document.forms[0];--%>
		<%--form.action = "<%=basePath%>mobile/addMobile";--%>
		<%--form.method="post";--%>
		<%--form.submit();--%>
	<%--}--%>
<%--</script>--%>

  </head>
  
  <body>
    <h1>添加手机</h1>
	<form action="<%=basePath%>mobile/addMobile" name="mobileForm" method="post">
		品牌：<input type="text" name="Brand"/>
		型号：<input type="text" name="Model"/>
		版本：<input type="text" name="Version"/>
		运行容量：<input type="text" name="Memory"/>
		SD卡容量：<input type="text" name="Storage"/>
		IMEI：<input type="text" name="IMEI"/>
		越狱：<input type="text" name="RootState"/>
		锁：<input type="text" name="SimLock"/>
		wifi状态：<input type="text" name="WifiState"/>
		GPS状态：<input type="text" name="GpsState"/>
		蓝牙状态：<input type="text" name="Bluetooth"/>
		指纹状态：<input type="text" name="Fingerprint"/>
		扬声器状态：<input type="text" name="Speaker"/>
		震动器状态：<input type="text" name="Vibration"/>
		闪光灯状态：<input type="text" name="FlashlightState"/>
		前置摄像头：<input type="text" name="FrontCamera"/>
		后置摄像头：<input type="text" name="BackCamera"/>
		陀螺传感器：<input type="text" name="Gyroscope"/>
		指南针传感器：<input type="text" name="Orientation"/>
		加速感应器：<input type="text" name="Acceleration"/>
		麦克风：<input type="text" name="Dbvalue"/>
		坏点有无：<input type="text" name="DeadPixel"/>
		外观评级：<input type="text" name="Appearance"/>
		电池状态：<input type="text" name="Battery_Status"/>
		创建时间：<input type="text" name="create_time"/>
		更新时间：<input type="text" name="update_time"/>
		<input type="submit" value="添加">
	</form>
  </body>
</html>
