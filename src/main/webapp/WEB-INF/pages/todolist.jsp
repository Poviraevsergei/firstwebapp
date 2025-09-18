<%@ page import="java.util.Random" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String[] names = new String[4];
    names[0] = "Natalia";
    names[1] = "Arseniy";
    names[2] = "Boris";

    request.setAttribute("names", names);

    request.setAttribute("randomNumber", new Random().nextInt(1,3));
%>
<html>
<head>
    <title>Todo list</title>
</head>
<body>

ForEach
<c:forEach var="name" items="${names}">
    <c:out value="${name}"/>
</c:forEach>

If
<c:if test="${show}">
    <h1>Hello world if statement</h1>
</c:if>

Switch
<c:choose>
    <c:when test="${randomNumber == 1}">
        <h1>This is one!</h1>
    </c:when>
    <c:when test="${randomNumber == 2}">
        <h1>This is two!</h1>
    </c:when>
    <c:when test="${randomNumber == 3}">
        <h1>This is three!</h1>
    </c:when>
    <c:otherwise>
        <c:redirect url="/login"/>
    </c:otherwise>
</c:choose>

<c:catch var="ex">
    <%out.println(10/0);%>
</c:catch>

<c:if test="${ex != null}">
    Oh Uh ...
</c:if>

</body>
</html>
