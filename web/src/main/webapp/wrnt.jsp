<%@ page language="java" isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>订单列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"/>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/datagrid-detailview.js"></script>
	<link href="style/adminStyle.css" rel="stylesheet" type="text/css"/>
	<script type="text/javascript" src="js/public.js"></script>
	<script type="text/javascript">
        $(function () {
            $('#rntList').datagrid({
                onClickRow: function (rowIndex, rowData) {
//                    console.log(rowData);
                    $('#rntDetail').find('td:odd').each(function (i, n) {
                        var temp = rowData[n.className];
                        console.log(temp);
                        if (temp) {
                            n.innerText = temp;
                        } else {
                            n.innerText = "暂无";
                        }
                    })
                }
            });

        });

        function addNewRow() {
            $('#dlg').dialog('open').dialog('setTitle','添加展商');
        }


	</script>
</head>
<body>
 
  <div class="operate" style="margin-top:10px ">
   <form>
    <input type="button" value="新增" class="tdBtn"/>
    <input type="button" value="暂存" class="tdBtn"/>
    <input type="button" value="申报" class="tdBtn"/>
    <input type="button" value="删除" class="tdBtn"/>
    <input type="button" value="打印" class="tdBtn"/>
    <input type="button" value="关联报关单" class="tdBtn"/>
   </form>
  </div>
  <table class="list-style Interlaced">
   <tr>
  	 行政许可
   </tr>
   
  <tr>
	    <td class="center">
	     <span class="block">暂存号</span>
	    </td>
	    <td>Z100001512${seqNo}</td>
	    <td class="center">
	     <span class="block">行政许可清单预录入号</span>
	    </td>
	    <td>PEZHSDJS${preSeqNo}</td>
	    </td>
	    <td class="center">
	     <span class="block">填报日期</span>
	    </td>
	    <td>20160218${declDate}</td>
   </tr>
	<tr>
		 <td class="center"> 
	    	<span class="block">行政许可清单编号</span>
	    </td>
	    <td>XZ16224512${wrntNo}</td>
		<td class="center"> 
    		<span class="block">申请文书编号</span>
	    </td>
	    <td colspan="3">5431513展申15</td>
	</tr>
	<tr>
		<td class="center"> 
    		<span class="block">展览会编号</span>
	    </td>
	    <td>HINH12${exbNo}</td>
		<td class="center"> 
    		<span class="block">展览会名称</span>
    	</td>
    	<td colspan="3">${exbName}中国国际纺织机械展览会暨ITM亚洲展览会</td>
	</tr>
	<tr>
		<td class="center"> 
    		<span class="block">主管海关</span>
	    </td>
	    <td>沪业二处${masterCustom}</td>
    	<td class="center">
    		<span class="block">备案海关</span>
    	</td>
    	<td>沪业二处${recordCustom}</td>
    	<td class="center">
    		<span class="block">主办单位</span>
    	</td>
    	<td>${masterName}中国国际贸易促进委员会</td>
	</tr>
	<tr>
		<td class="center">
    		<span class="block">申报单位代码</span>
    	</td>
    	<td>1231332${agentCode}</td>
    	<td class="center">
    		<span class="block">申报单位名称</span>
    	</td>
    	<td colspan="3">${agentName}上海国际展览运输有限公司</td>
	</tr>
	<tr>
		<td class="center">
    		<span class="block">报关员</span>
    	</td>
    	<td>2213122${decno}</td>
    	<td class="center">
    		<span class="block">报关员联系电话</span>
    	</td>
    	<td colspan="3">232321312${decnoPhone}</td>
	</tr>
	<tr>
		<td class="center">
    		<span class="block">备注</span>
    	</td>
    	<td colspan="5">${notes}</td>
	</tr>
   
  </table>

  
  </div>
  	行政许可清单列表
  
  	<table class="list-style Interlaced" width="800px" id="rntDetail">
  		<tr>
  			<td class="center">
  				序号	
  			</td>
  			<td class="center">
  				商品编码
  			</td>
  			<td class="center">
  				商品名称
  			</td>
  		</tr>
  		<tr align="center">
  			<td>
  				1
  			</td>
  			<td>
  				15134654
  			</td>
  			<td>
  				其他建筑用木工制品
  			</td>
  		</tr>
  	</table>



   <form action="">
   <input type="button" value="新增" class="tdBtn" onclick="addNewRow()"/>
  	<input type="button" value="删除" class="tdBtn"/>
   <!-- 垃圾数据 -->
	   <!--easyui 实现页面-->
	   <table class="easyui-datagrid list-style Interlaced" id="rntList" align="center"
			  data-options="fitColumns:true,singleSelect:true,rownumbers:true,fit: true">
		   <thead>
		   <tr>
			   <th data-options="field:'exbEntNo',width:100">序号</th>
			   <th data-options="field:'entName',width:100">商品编码</th>
			   <th data-options="field:'entCountry',width:100">商品名称</th>
		   </tr>
		   </thead>
		   <tbody>
		   <c:forEach items="${tWinxWrntLists}" var="rnt">

			   <tr>
				   <td>${rnt.gNo}</td>
				   <td>${rnt.codeTs}</td>
				   <td>${rnt.gName}</td>

			   </tr>
		   </c:forEach>
		   </tbody>
   </table>
   <!-- 占格子 -->
   </form>
  <!-- BatchOperation -->
 </div>
</body>
</html>