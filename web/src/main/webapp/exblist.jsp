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

<head>
    <title>会员列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
    <script src="js/jquery.js"></script>
    <script src="js/public.js"></script>
    <script type="easyui/jquery.min.js"></script>
    <script type="easyui/jquery.easyui.min.js"></script>
    <script src="easyui/jquery.easyui.min.js"></script>
</head>
<body>
<div class="operate" style="margin-top:10px ">
    <table class="easyui-datagrid"
           data-options="url:'datagrid_data.json',fitColumns:true,
			 singleSelect:true,pagination:true,rownumbers:true" id="prod">
        <thead>
        <tr>
            <th data-options="field:'code'">列表</th>

        </tr>
        </thead>
        <tbody style="font-weight: bold" >
        <c:forEach items="${Exblist}" var="o" varStatus="status">
            <tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'" align="left" >
                <td><a href="exbAction_viewone?id=${o.id}" ></a></td>
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
