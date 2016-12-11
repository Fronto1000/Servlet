<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<h1>Users</h1>
<c:forEach items="${requestScope.users_list}" var="currentUser">
    <tr>
        <td>
            <c:out value="${currentUser.id}" />
            <c:out value="${currentUser.name}"/>
            <c:out value="${currentUser.age}"/>
            <c:out value="${currentUser.city}"/>
            <br>
        </td>
    </tr>
</c:forEach>

</body>
</html>