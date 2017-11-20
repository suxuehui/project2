<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>左侧导航</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.js"></script>
<script src="js/public.js"></script>
</head>
<body style="background:#313131">
<div class="menu-list">
 <a href="main.html" target="mainCont" class="block menu-list-title center" style="border:none;margin-bottom:8px;color:#fff;">首页</a>
 <ul>
   <ul class="menu-children">
    <li><a href="${pageContext.request.contextPath}/exbAction_tolist" title="" target="mainCont">展览会备案</a></li>
   </ul>
 
  <li>
   <ul class="menu-children">
    <li><a href="wrnt.jsp" title="" target="mainCont">行政许可清单</a></li>
   </ul>
  </li>
  
  <li class="menu-list-title">
   <span>申报清单</span>
   <i>◢</i>
  </li>
  <li>
   <ul class="menu-children">
    <li><a href="entryDeclaration.html" title="" target="mainCont">进境申报清单</a></li>
   </ul>
  </li>
  
  <li class="menu-list-title">
   <span>复运出境</span>
   <i>◢</i>
  </li>
  <li>
   <ul class="menu-children">
    <li><a href="order_header.html" title="" target="mainCont">表头信息</a></li>
    <li><a href="order_list.html" title="" target="mainCont">商品信息</a></li>
   </ul>
  </li>
  
 <!--  <li class="menu-list-title">
   <span>查询</span>
   <i>◢</i>
  </li>
  <li>
   <ul class="menu-children">
    <li><a href="record.html" title="" target="mainCont">展览会备案查询</a></li>
    <li><a href="wrnt.jsp" title="" target="mainCont">进境行政许可清单查询</a></li>
    <li><a href="entryDeclaration.html" title="" target="mainCont">进境申报清单查询</a></li>
    <li><a href="order_list.html" title="" target="mainCont">核销清单查询</a></li>
   </ul>
  </li> -->
    
 </ul>
</div>
</body>
</html>