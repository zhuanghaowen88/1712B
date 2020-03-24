<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
</head>
<body>

			<a href="toadd"><input type="button" value="添加"></a>
			<input type="button" value="批量删除" onclick="deleteAll()">
			<table>
  <tr>
    <th><input type="checkbox" id="qx"></th>
    <th>编号</th>
    <th>品牌</th>
    <th>分类</th>
    <th>发布时间</th>
    <th>操作</th>
   
  </tr>
  <c:forEach items="${page.list }" var="g">
  <tr>
    <td><input type="checkbox" value="${g.gid }" name="gid"></td>
    <td>${g.gid }</td>
    <td>${g.gname }</td>
    <td>${g.tid }</td>
    <td>${g.gdatea }</td>
    <td><input type="button" value="详情"></td>
    <td><input type="button" value="修改"></td>
  </tr>
  </c:forEach>
</table>

</body>

		<script type="text/javascript">
		$("qx").toggle(function(){
			$("[name='gid']").attr("checked",true);
		},function(){
			$("[name='gid']").attr("checked",false);
		})
		
		</script>
		<script type="text/javascript">
		function deleteAll(id){
			s.post("deleteGoods",{"ids":ids},function(date){
				if (date) {
					alert("删除成功")
					location.href="http://localhost:8080/list";
				}else{
					alert("删除失败")
				}
			})
		}
		
		</script>
</html>