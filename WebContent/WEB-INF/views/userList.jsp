<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<a href="../userAdd.jsp">新增</a>
		<table border="1px solid blue">
			<tr>
				<td>序号</td>
				<td>姓名</td>
				<td>联系电话</td>
				<td>性别</td>
				<td>职务</td>
				<td>操作</td>
			</tr>
			
			<c:forEach var="user" items="${ userList }" varStatus="status">
				<tr>
					<td>${ status.count } </td>
					<td>${ user.userName }</td>
					<td>${ user.userPhone }</td>
					<td>${ user.userGender == 0 ? '女' : '男' }</td>
					<td>${ user.userDuty }</td>
					<td>
						<a href="selectById?id=${user.id}&type=view">查看</a>
						<a href="selectById?id=${user.id}&type=update">修改</a>
						<a href="deleteById?id=${user.id}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>