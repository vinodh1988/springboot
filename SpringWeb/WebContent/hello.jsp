<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link  href="resources/style.css" rel="stylesheet">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
  <h1>Flow is working!!!! ${data}</h1>
  <h3>The names are</h3>
  <hr>
  <ul>
  <c:forEach items="${person}" var="x">
     <li>${x.name}</li>
  </c:forEach>
  </ul>
</body>
</html>