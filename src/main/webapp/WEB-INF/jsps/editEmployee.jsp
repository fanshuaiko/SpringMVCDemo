<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Employee/saveEmployee" method="post">
	<label for="id">id:</label>
	<input type="text" name="id" >
	<br>
	<label for="name">name:</label>
	<input type="text" name="name" >
	<br>
	<label for="address">address:</label>
	<input type="text" name="address" >
	<br>
	<input type="submit" value="提交">
	</form>
</body>
</html>