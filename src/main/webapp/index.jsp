<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<%=request.getContextPath()%>/Employee/helloSpringMVC">访问HelloController中的helloSpringMVC</a><br>
	<a href="<%=request.getContextPath()%>/Employee/findEmployeeById?id=123">访问HelloController中的findEmployeeById?id=123</a><br>
	<a href="<%=request.getContextPath()%>/Employee/findEmployeeById2/123/456">访问HelloController中的findEmployeeById2/{id}/{idd}</a><br>
	<a href="<%=request.getContextPath()%>/Employee/findEmployeeById3">访问HelloController中的findEmployeeById3</a><br>
	<a href="<%=request.getContextPath()%>/Employee/editEmployee">访问HelloController中的editEmployee</a><br>
	<a href="<%=request.getContextPath()%>/Employee/file">访问HelloController中的file</a><br>
</body>
</html>