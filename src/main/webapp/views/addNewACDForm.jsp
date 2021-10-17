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
<c:forEach items="${acd.symptomListOfACD}" var ="symptom" varStatus="s">
    ${symptom.symptomName}
    <input path="symptom.symptomName" value="${symptom.symptomName}" type="hidden"/>
    <select path="symptom.power">
                <options value="0"/>
                <options value="1"/>
                <options value="2"/>
                <options value="3"/>
            </select>
            <br>
</c:forEach>
    <input type="submit" value="dodaj kolejny dzień"/>
</form:form>