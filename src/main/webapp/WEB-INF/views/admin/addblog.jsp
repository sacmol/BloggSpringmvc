<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h1>Add new Blogpost</h1>

<form:form action="prepost" method="POST">
Title: <input type="text" name="title" value="${pretitle}"/>
<textarea id="text_add_money" rows="15"  cols="70" name="txt" >${preblog}</textarea>
			 		<input type="submit" value="Förhandsgranska">
</form:form>			 		
</body>
</html>