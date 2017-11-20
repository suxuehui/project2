<%@page contentType="text/html; utf-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>会员列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    <!-- easyui css js 包 开始-->
    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
    <script type="text/javascript" src="easyui/jquery.min.js"></script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="easyui/datagrid-detailview.js"></script>
    <link href="style/adminStyle.css" rel="stylesheet" type="text/css"/>
    <!--<script type="text/javascript" src="js/jquery.js"></script>-->
    <script type="text/javascript" src="js/public.js"></script>
    <!-- easyui css js 包 结束-->
    <script type="text/javascript">
        $(function () {
            $('#entList').datagrid({
                onClickRow: function (rowIndex, rowData) {
//                    console.log(rowData);
                    $('#entDetail').find('td:odd').each(function (i, n) {
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


            $('#billList').datagrid({
                onClickRow: function (rowIndex, rowData) {
                    console.log(rowData);
                    $('#billDetail').find('td:odd').each(function (i, n) {
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
<body style="margin-left: 25px;margin-top: 10px;">
<!---------------------------------------------------------------------------------->
<div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"
     closed="true" buttons="#dlg-buttons">

    <form id="fm" method="post" novalidate>
        <div style="margin-top: 5px">
            <input name="exbEntNo" class="easyui-textbox" required="true" label="展商编号:" name="estoreprice" labelPosition="left"  style="width: 240px">
        </div>
        <div style="margin-top: 5px">
            <input name="entName" class="easyui-textbox" required="true" label="展商名称:" name="estoreprice" labelPosition="left"  style="width: 240px">
        </div>
        <div style="margin-top: 5px">
            <input name="entCountry" class="easyui-textbox" required="true" label="展商国别:" name="estoreprice" labelPosition="left"  style="width: 240px">
        </div>
        <div style="margin-top: 5px">
            <input name="roomNo" class="easyui-textbox" required="true" label="展馆号:" name="estoreprice" labelPosition="left"  style="width: 240px">
        </div>
        <div style="margin-top: 5px">
            <input name="placeNo" class="easyui-textbox" required="true" label="座位号:" name="estoreprice" labelPosition="left"  style="width: 240px">
        </div>
    </form>
</div>
<div id="dlg-buttons">
    <!--TODO: 添加增加展商的方法 -->
    <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveEnt()" style="width:90px">Save</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close');$('#fm').form('clear');" style="width:90px">Cancel</a>
</div>
<!---------------------------------------------------------------------------------->

<div class="operate" style="margin-top:25px; height: 380px">

    <input type="button" value="新增" class="tdBtn"/>
    <input type="button" value="暂存" class="tdBtn"/>
    <input type="button" value="申报" class="tdBtn"/>
    <input type="button" value="删除" class="tdBtn"/>
    <input type="button" value="打印" class="tdBtn"/>
    <input type="button" value="关联报关单" class="tdBtn"/>

    <table class="list-style Interlaced">
        <th style="color:mediumblue;">
            展会备案
        </th>
        <form action="#" method="#">
            <table class="list-style Interlaced" align="center">
                <tr>
                    <td class="center">
                        <span class="block">展览会暂存号</span>
                    </td>
                    <td>${seqNo}</td>
                    <td class="center" width="120" colspan="2">
                        <span class="block">展商会预录入编号</span>
                    </td>
                    <td>${preSeqNo}</td>
                    <td class="center">
                        <span class="block">填报日期</span>
                    </td>
                    <td colspan="3">${declDate}</td>
                </tr>

                <tr>
                    <td class="center">
                        <span class="block">展览会海关编号</span>
                    </td>
                    <td>${exbNo}</td>
                    <td class="center">
                        <span class="block">展览会名称</span>
                    </td>
                    <td colspan="6">${exbName}</td>
                </tr>

                <tr>
                    <td class="center">
                        <span class="block">主管海关</span>
                    </td>
                    <td>${masterCustom}</td>
                    <td class="center" width="120">
                        <span class="block">备案海关</span>
                    </td>
                    <td colspan="2">${recordCustom}</td>
                    <td class="center">
                        <span class="block">批准单位</span>
                    </td>
                    <td>${apprName}</td>
                    <td class="center">
                        <span class="block">批文号</span>
                    </td>
                    <td>${apprNo}</td>
                </tr>

                <tr>
                    <td class="center">
                        <span class="block">主办单位</span>
                    </td>
                    <td>${masterName}</td>
                    <td class="center">
                        <span class="block">主办单位负责人</span>
                    </td>
                    <td colspan="2">${masterPrin}</td>
                    <td class="center">
                        <span class="block">主办方联系电话</span>
                    </td>
                    <td colspan="3">${masterPrinpHone}</td>
                </tr>

                <tr>
                    <td class="center">
                        <span class="block">承办单位</span>
                    </td>
                    <td>${undertakerName}</td>
                    <td class="center">
                        <span class="block">资料审查负责人</span>
                    </td>
                    <td>${checkPrin}</td>
                    <td class="center">
                        <span class="block">开幕日期</span>
                    </td>
                    <td>${openDate}</td>
                    <td class="center">
                        <span class="block">闭幕日期</span>
                    </td>
                    <td colspan="2">${closeDate}</td>
                </tr>

                <tr>
                    <td class="center">
                        <span class="block">展览场馆</span>
                    </td>
                    <td>${exbRoom}</td>
                    <td class="center">
                        <span class="block">展出总面积</span>
                    </td>
                    <td colspan="2">${exbArea}</td>
                    <td class="center">
                        <span class="block">国际面积</span>
                    </td>
                    <td colspan="3">${exbIntlArea}</td>
                </tr>

                <tr>
                    <td class="center">
                        <span class="block">参展地区国家数量</span>
                    </td>
                    <td>${attendCountryNum}</td>
                    <td class="center">
                        <span class="block">境外展商数量</span>
                    </td>
                    <td colspan="2">${intlTraderNum}</td>
                    <td class="center">
                        <span class="block">台商批文</span>
                    </td>
                    <td colspan="3">${taiwanTraderAppr}</td>
                </tr>

                <tr>
                    <td class="center">
                        <span class="block">报关员</span>
                    </td>
                    <td>${decno}</td>
                    <td class="center">
                        <span class="block">报关员联系电话</span>
                    </td>
                    <td colspan="6">${decnoPhone}</td>
                </tr>
                <tr>
                    <td class="center">
                        <span class="block">申报单位代码</span>
                    </td>
                    <td>${agentCode}</td>
                    <td class="center">
                        <span class="block">申报单位名称</span>
                    </td>
                    <td colspan="6">${agentName}</td>
                </tr>
                <tr>
                    <td class="center">
                        <span class="block">变更原因</span>
                    </td>
                    <td colspan="8">${amentReason}</td>
                </tr>

                <tr>
                    <td class="center">
                        <span class="block">备注</span>
                    </td>
                    <td colspan="8">${notes}</td>
                </tr>
            </table>
        </form>
    </table>
</div>
<div style="margin-top: 25px;margin-bottom: 15px"><b>展商名录</b></div>

<!--<span style="margin-top: 25px;height: 13px">展商名录</span>-->
<div style="height: 150px;">
    <div style="width: 400px;float:left;">
        <table class="list-style Interlaced" align="center" id="entDetail">

            <tr>
                <td class="center" style="width: 150px">
                    展商编号
                </td>
                <td class="exbEntNo" style="text-align: center;"><span style="color: red;">请选择右边一个展商</span></td>
            </tr>
            <tr>
                <td class="center">
                    展商名称
                </td>
                <td class="entName" style="text-align: center;"></td>
            </tr>
            <tr>
                <td class="center">
                    展商国别
                </td>
                <td class="entCountry" style="text-align: center;"></td>
            </tr>
            <tr>
                <td class="center">
                    展馆号
                </td>
                <td class="roomNo" style="text-align: center;"></td>
            </tr>
            <tr>
                <td class="center">
                    座位号
                </td>
                <td class="placeNo" style="text-align: center;"></td>
            </tr>
        </table>

    </div>

    <div style="width: 700px;height: 150px;float: left;margin-left: 25px;">
        <!--easyui 实现页面-->
        <table class="easyui-datagrid list-style Interlaced" id="entList" align="center"
               data-options="fitColumns:true,singleSelect:true,rownumbers:true,fit: true">
            <thead>
            <tr>
                <th data-options="field:'exbEntNo',width:100">展商编号</th>
                <th data-options="field:'entName',width:100">展商名称</th>
                <th data-options="field:'entCountry',width:100">展商国别</th>
                <th data-options="field:'roomNo',width:100">展览馆</th>
                <th data-options="field:'placeNo',width:100">展位号</th>
            </tr>
            </thead>
            <tbody>
            <%--@elvariable id="entList" type="cn.itcast.pro.domain.TWinxExbEntList"--%>
            <c:forEach items="${tWinxExbEntLists}" var="entList">
                <tr>
                    <td>${entList.exbEntNo}</td>
                    <td>${entList.entName}</td>
                    <td>${entList.entCountry}</td>
                    <td>${entList.roomNo}</td>
                    <td>${entList.palceNo}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <input type="button" value="新增" class="tdBtn" style="margin-left: 25px;" onclick="addNewRow()"/>
</div>


<div style="margin-top: 25px;margin-bottom: 15px"><b>境内代理企业代表</b></div>
<div style="height: 90px;">
    <div style=" width: 400px;float:left;">
        <table class="list-style Interlaced" align="center">
            <tr>
                <td class="center" style="width: 135px">
                    序号
                </td>
                <td>1</td>
            </tr>
            <tr>
                <td class="center">
                    境内报关代理
                </td>
                <td>12313133</td>
            </tr>
            <tr>
                <td class="center">
                    报关代理名称
                </td>
                <td>上海国际展览运输有限公司</td>
            </tr>
        </table>
    </div>
    <div style="width: 700px;float: left; margin-left: 25px">

        <table class="list-style Interlaced" align="center">
            <tr>
                <td class="center">
                    序号
                </td>
                <td class="center">
                    境内报关代理
                </td>
                <td class="center">
                    报关代理名称
                </td>
            </tr>
            <!-- 垃圾数据 -->
            <tr>
                <td class="center">1</td>
                <td class="center">1231321</td>
                <td class="center">上海国际展览运输有限公司</td>
            </tr>
            <tr>
                <td class="center">1</td>
                <td class="center">1231321</td>
                <td class="center">上海国际展览运输有限公司</td>
            </tr>

            <!-- 占格子 -->
        </table>

    </div>

    <input type="button" value="新增" class="tdBtn" style="margin-left: 10px;"/>
    <input type="button" value="删除" class="tdBtn" style="margin-left: 10px;"/>

</div>

<div style="margin-top: 25px;margin-bottom: 15px"><b>展览会备案清单</b></div>
<div style="height: 30px">
    <div style="width: 800px; float: left;">
        <table class="list-style Interlaced" align="center" id="billDetail">
            <tr>
                <td class="center">序号</td>
                <td class="gNo" style="text-align: center;background-color:#666666"><span style="color: #CC2222">右边查询</span> </td>
                <td class="center">商品编码</td>
                <td class="codeTs" style="text-align: center;background-color:#666666"><span style="color: #CC2222">右边查询</span></td>
                <td class="center">商品名称</td>
                <td class="gName" style="text-align: center;background-color:#666666"><span style="color: #CC2222">右边查询</span></td>
            </tr>

        </table>
    </div>
    <div style="width: 200px;float: right;">
        <input type="button" value="新增" class="tdBtn"/>
        <input type="button" value="删除" class="tdBtn"/>
    </div>
</div>
<div style="height: 100px;width: 100%; margin-top: 15px">
    <table class="easyui-datagrid list-style Interlaced" id="billList" align="center"
           data-options="fitColumns:true,singleSelect:true,rownumbers:true,fit: true">
        <thead>
        <tr>
            <th data-options="field:'gNo',width:100">序号</th>
            <th data-options="field:'codeTs',width:100">商品编号</th>
            <th data-options="field:'gName',width:100">商品名称</th>
        </tr>
        </thead>
        <tbody>
        <%--@elvariable id="billList" type="cn.itcast.pro.domain.TWinxExbBillList"--%>
        <c:forEach items="${tWinxExbBillLists}" var="billList">
            <tr>
                <td>${billList.gNo }</td>
                <td>${billList.codeTs }</td>
                <td>${billList.gName }</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>