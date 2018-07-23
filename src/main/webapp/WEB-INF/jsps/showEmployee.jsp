<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<label>id:</label><input type="text" name="id" value="${employee.id}"><br>
		<label>name:</label><input type="text" name="name" value="${employee.name}"><br>
		<label>address:</label><input type="text" name="address" value="${employee.address}"><br>
</body>
</html>