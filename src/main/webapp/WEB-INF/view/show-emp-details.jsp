<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: AlexNoutbook
  Date: 07.07.2024
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Введённые данные</title>
</head>
<body>
<h2>Приветствую тебя работник!</h2>
<br><br>
<%--Твоё имя: ${param.employeeName}--%>
Твоё имя: ${employee.name}<br><br>
Фамилия: ${employee.surname}<br><br>
Зарплата: ${employee.salary}<br><br>
Департамент: ${employee.department}<br><br>
Машина: ${employee.car}<br><br>
Знания языков:
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>

    </c:forEach>
</ul>

</body>
</html>
