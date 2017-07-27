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
	<form action="update" method="post">
		<input type="hidden" name = "id" value = "${user.id}"/>
		<div align="center">
			<table border="1px solid blue">
				<tr>
					<td>用户名</td>
					<td><input type="text" name = "userNo" value = "${user.userNo}"/></td>
					<td>密码</td>
					<td><input type="text" name = "password" value = "${user.password}"/></td>
				</tr>
				<tr>
					<td>姓名</td>
					<td><input type="text" name = "userName" value = "${user.userName}"/></td>
					<td>联系电话</td>
					<td><input type="text" name = "userPhone" value = "${user.userPhone}"/></td>
				</tr>
				<tr>
					<td>姓名拼音</td>
					<td><input type="text" name = "spellName" value = "${user.spellName}"/></td>
					<td>排序号</td>
					<td><input type="text" name = "sortCode" value = "${user.sortCode}"/></td>
				</tr>
				<tr>
					<td>性别</td>
					<td><input type="text" name = "userGender" value = "${user.userGender}"/></td>
					<td>职务</td>
					<td><input type="text" name = "userDuty" value = "${user.userDuty}"/></td>
				</tr>
				<tr>
					<td colspan="4" align="center">
						<input type="submit" value = "修改"/>
					</td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>