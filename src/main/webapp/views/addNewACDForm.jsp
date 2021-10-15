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
<form:form method="post" action="/user/addNewACDForm" modelAttribute="userSymptomList">
    <c:forEach items="${userSymptomList}" var="symptom">

        ${symptom.symptomName}
        <form:select path="symptomsPower">
            <form:options itemValue="-" itemLabel="-- Wybierz siłę objawu --"/>
            <form:options itemValue="0"/>
            <form:options itemValue="1"/>
            <form:options itemValue="2"/>
            <form:options itemValue="3"/>
        </form:select>
        <br/>

    </c:forEach>
</form:form>
</body>
