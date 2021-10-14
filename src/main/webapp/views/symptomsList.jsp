<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pl">

<head>
    <meta charset="utf-8">
    <title>Dzienniczek Głodu - objawy głodu</title>
</head>

<body>
<div>
    <jsp:include page="header.jsp"/>
</div>
<div>
    <jsp:include page="appSideMenu.jsp"/>
</div>
<table>
    <thead><td>nazwa</td><td>opis</td></thead>

<c:forEach items="${symptoms}" var="symptom">
<tr>
    <td>${symptom.symptomName}</td>
    <td>${symptom.symptomDescription}</td>
    <td><a href="/user/delete/symptom/${symptom.id}">usuń</a> </td>
    <td><a href="/user/edit/symptom/${symptom.id}">edytuj</a> </td>
</tr>
</c:forEach>
</table>
</body>