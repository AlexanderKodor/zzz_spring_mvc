<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: AlexNoutbook
  Date: 07.07.2024
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Запрос данных</title>
</head>
<body>
<%--<form action="showDetails" method="get">--%>
<%--    <input type="text" name="employeeName" placeholder="Введите своё имя"/>--%>
<%--    <input type="submit">--%>
<%--</form>--%>

<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/><form:errors path="name"/><br><br>
    Surname <form:input path="surname"/><form:errors path="surname"/><br><br>
    Salary <form:input path="salary"/><form:errors path="salary"/><br><br>
    Department <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select><br><br>
    Car:<br>
    <form:radiobuttons path="car" items="${employee.cars}"/>
<%--    BMW<form:radiobutton path="car" value="BMW"/><br>--%>
<%--    Audi<form:radiobutton path="car" value="Audi"/><br>--%>
<%--    VW<form:radiobutton path="car" value="VW"/><br>--%>
    <br><br>
    Знания языков:<br>
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Duetch"/>--%>
<%--    RU <form:checkbox path="languages" value="Russian"/>--%>
    <form:checkboxes path="languages" items="${employee.languagesList}"/>
    <br><br>
    Номер телефона <form:input path="phoneNumber"/><form:errors path="phoneNumber"/><br><br>
    <input type="submit" value="SEND">
</form:form>

</body>
</html>
