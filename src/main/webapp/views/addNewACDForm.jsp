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
    <c:forEach items="${userSymptomList}" var ="symptom" varStatus="s">
        ${symptom.symptomName}<br>
<%--    <form:input path="acd.symptomPowerMap.key" value="${symptom.symptomName}" />--%>
        <input path="acd.symptomPowerMap.key" value="${symptom}" type="hidden"/>
        <select path="acd.symptomPowerMap.value">
            <options value="0">0</options>
            <options value="1">1</options>
            <options value="2">2</options>
            <options value="3">3</options>

        </select>
        <br>
    </c:forEach>
    <input type="submit" value="dodaj kolejny dzień"/>
</form:form>