<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" integrity="sha256-PI8n5gCcz9cQqQXm3PEtDuPG8qx9oFsFctPg0S5zb8g=" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
</head>
<body>

<header class="header">
    <div class="container d-flex align-items-center">
        <img src="${pageContext.request.contextPath}/img/cf-logo.png" alt="CF-Logo" class="header-logo">
    </div>
</header>

<main class="container text-center my-5 main-content">
    <h1 class="mb-5">Κεντρική Υπηρεσία Coding Factory</h1>
    <a class="custom-button-green" href="">Συνέχεια</a>
</main>

<footer>
    <div class="footer">
        <span>&copy; 2024 Coding Factory. All rights reserved.</span>
    </div>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha256-3gQJhtmj7YnV1fmtbVcnAV6eI4ws0Tr48bVZCThtCGQ=" crossorigin="anonymous"></script>
</body>
</html>