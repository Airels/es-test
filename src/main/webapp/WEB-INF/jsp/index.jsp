<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Index</title>
    </head>

    <body>
        <h1>Hello, world!</h1>

        <c:forEach var="i" begin="1" end="10">
            <p>Iteration <c:out value="${i}"/></p>
        </c:forEach>
    </body>
</html>
