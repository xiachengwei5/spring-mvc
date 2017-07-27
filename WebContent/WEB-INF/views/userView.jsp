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
		<table border="1px solid blue">
			<tr>
				<td>姓名</td>
				<td>${user.userName}</td>
				<td>联系电话</td>
				<td>${user.userPhone}</td>
			</tr>
			<tr>
				<td>性别</td>
				<td>${ user.userGender == 0 ? '女' : '男' }</td>
				<td>职务</td>
				<td>${ user.userDuty }</td>
			</tr>
		</table>
	</div>
</body>
</html>