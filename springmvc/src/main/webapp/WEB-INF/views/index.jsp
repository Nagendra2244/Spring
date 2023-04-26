<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
    <%@ page isELIgnored = "false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>
<body>
<h2>Hello World!</h2>

<%
//  String name=(String)request.getAttribute("name");
  Integer id=(Integer)request.getAttribute("id");
  List<String> list=(List<String>)request.getAttribute("list");

%>
<h3>This is ${name}</h3>

<h3>This id is ${id}</h3>

<h3>This id is ${list}</h3>
</body>
</html>
