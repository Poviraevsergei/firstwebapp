<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Todo list</title>
    <link rel="stylesheet" href="../../css/styles.css">
</head>
<body class="body-todo">
<div class="header-buttons-todo">
    <form action="about-me" method="get">
        <button type="submit" id="button-about-me">About me</button>
    </form>
    <form action="logout" method="post">
        <button type="submit" id="button-logout">Logout</button>
    </form>
</div>

<c:if test="${username != null}">
    <h1> Hello ${username}</h1>
</c:if>

<div class="form-task-todo">
    <form action="todo" method="post">
        <input type="text" id="input-task" name="task" placeholder="Enter your task" required>
        <button type="submit" id="task-button">Add task</button>
    </form>
</div>

<div class="task-list-todo">
    <h2>Task list:</h2>

    <c:if test="${tasks == null || tasks.isEmpty()}">
        <h4>There are no active tasks!</h4>
    </c:if>

    <ol>
        <c:forEach var="task" items="${tasks}">
            <li>
                <span class="task-text">${task}</span>
                <form action="todo" method="post" class="delete-form">
                    <input type="hidden" name="deleteTask" value="${task}">
                    <input type="submit" id="delete-button" value="Remove"/>
                </form>
            </li>
        </c:forEach>
    </ol>
</div>
</body>
</html>
