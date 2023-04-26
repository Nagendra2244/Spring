<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
<html>
<body>
<h2>This is help page</h2>

<%
  String name=(String)request.getAttribute("name");
  Integer id=(Integer)request.getAttribute("id");
  

%>
<h3>This is <%=name %></h3>
<h3>This id is <%=id %></h3>

</body>
</html>
