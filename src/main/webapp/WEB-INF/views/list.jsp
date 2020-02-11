<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resource/index2.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resource/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-1.8.3.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table">
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>价格</td>
			<td>状态</td>
		</tr>
		<c:forEach items="${goods }" var="g" varStatus="i">
			<tr>
				<td>${i.index }</td>
				<td>${g.name }</td>
				<td>${g.price }</td>
				<td>${g.status.name }</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>