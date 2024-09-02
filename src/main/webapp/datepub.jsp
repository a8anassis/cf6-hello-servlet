<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Current Date</title>
</head>
<body>
    <%
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNow = now.format(formatter);

        pageContext.setAttribute("now", formattedNow);
    %>

    <h1>
        <%= pageContext.getAttribute("now") %>
    </h1>

    <h1>${pageScope.now}</h1>

</body>
</html>
