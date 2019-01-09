<%--
  Created by IntelliJ IDEA.
  User: rihui
  Date: 2016/5/17
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>获取手机所有信息</title>
</head>
<body>
    <table>
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
            </tr>
        </tbody>
    </table>
</body>
</html>
