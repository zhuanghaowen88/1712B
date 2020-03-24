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
	<form action="add" method="post" enctype="multipart/form-data">
		编号：<input type="text" name="gid"><br>
		品牌：<input type="text" name="gname"><br>
		分类：<select name="tid">
				<c:forEach items="${typelist }" var="t">
					<option value="${t.tid }">${t.tname}</option>
				</c:forEach>
			</select><br>

		价格：<input type="text" name="gprice"><br>
		<input type="submit" value="保存">
		<input type="submit" value="关闭">
	</form>

</body>
</html>