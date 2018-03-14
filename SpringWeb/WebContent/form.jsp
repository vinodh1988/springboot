<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<title>Insert title here</title>
</head>
<body>
<s:form action="add.htm" modelAttribute="person" method="post">
  <s:label path="sno">Sno</s:label>
   <s:input path="sno"></s:input> <br>
   <s:label path="name">Name</s:label>
   <s:input path="name"></s:input><br>
   <s:label path="city">City</s:label>
   <s:input path="city"></s:input> <br>
   <input type="submit" value="store">
   
</s:form>
</body>
</html>