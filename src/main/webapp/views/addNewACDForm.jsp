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
WYswietlam
<form:form method="post" action="/user/addNewACDForm" modelAttribute="acd">
    <c:forEach items="${acd.symptomPowerMap}" var="acdEntry" varStatus="vs">
        ${acdEntry.key.name}<br>

        <form:select path="symptomPowerMap[${acdEntry.key.id}]">
            <form:option value="0">0</form:option>
            <form:option value="1">1</form:option>
            <form:option value="2">2</form:option>
            <form:option value="3">3</form:option>
        </form:select>
        <br>
    </c:forEach>
    <input type="submit" value="dodaj kolejny dzień"/>
</form:form>