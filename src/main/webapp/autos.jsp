<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Autos</title>
</head>
<body>
<h1>Autos</h1>
<c:forEach items="${requestScope.autos_list}" var="currentAuto">
    <tr>
        <td>
            <c:out value="${currentAuto.id}" />
            <c:out value="${currentAuto.model}"/>
            <c:out value="${currentAuto.mileage}"/>
            <c:out value="${currentAuto.memberId}"/>
            <br>
        </td>
    </tr>
</c:forEach>

</body>
</html>