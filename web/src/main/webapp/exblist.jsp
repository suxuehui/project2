<%--
  Created by IntelliJ IDEA.
  User: ZT
  Date: 2017/11/20
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"/>
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/datagrid-detailview.js"></script>
<link href="style/adminStyle.css" rel="stylesheet" type="text/css"/>
<!--<script type="text/javascript" src="js/jquery.js"></script>-->
<script type="text/javascript" src="js/public.js"></script>
<head>
    <title>会员列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
    <script src="js/jquery.js"></script>
    <script src="js/public.js"></script>
    <script type="easyui/jquery.min.js"></script>
    <script src="easyui/jquery.easyui.min.js"></script>
</head>
<body>
<div class="operate" style="margin-top:10px;height: 500px">
    <table class="easyui-datagrid"
           data-options="fitColumns:true,singleSelect:true,rownumbers:true,fit: true" id="prod">
        <thead>
        <tr>
            <th data-options="field:'code'">列表</th>
        </tr>
        </thead>
        <tbody style="font-weight: bold">
        <c:forEach items="${Exblist}" var="o" varStatus="status">
            <tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'" align="left">
                <td><a href="recordAction_viewone?id=${o.id}">${o.exbName}</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<div style=" width: 400px;height: 150px;float:left;">

</div>


</div>
</body>
</html>
