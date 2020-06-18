<%@ page import="net.ifao.ibetms.model.User" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Page</title>
</head>
<body>
<% User user = (User) request.getAttribute("user"); %>
<h2>Hello, ${user.name}!</h2>
</body>
</html>

