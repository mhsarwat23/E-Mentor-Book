<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGPA</title>
</head>
<body>
<%@ page import="oxf.database.model.*" %>
<%
String usn=null;
		Cookie[] coo=request.getCookies();
		for(Cookie co:coo) {
			if(co.getName().equals("usn")) {
				usn=co.getValue();
				
			}
		}
		%>
<strong>SGPA:</strong><%out.print(request.getAttribute("sgpa")); %>

<a href="academic.jsp">Go back</a>
</body>
</html>