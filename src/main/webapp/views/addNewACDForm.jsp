<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="pl">

<head>
    <meta charset="utf-8">
    <title>Dzienniczek Głodu - dodawanie kolejnego dnia </title>
</head>

<body>
<div>
    <jsp:include page="header.jsp"/>
</div>
<div>
    <jsp:include page="appSideMenu.jsp"/>
</div>

<form:form method="post" action="/user/addNewACDForm" modelAttribute="acd">

    <c:forEach items="${map}" var ="entry">

        <form:input path="entry.key.symptomName" value="${entry.key.symptomName}"/><br>
        <form:hidden path="entry.key.symptomDescription" value="${entry.key.symptomDescription}"/><br>

        <form:select path="entry.value">
            <form:options itemValue="0"/>
            <form:options itemValue="1"/>
            <form:options itemValue="2"/>
            <form:options itemValue="3"/>
        </form:select>
        <br>
    </c:forEach>

<input type="submit" value="dodaj kolejny dzień"/>
</form:form>
</body>
