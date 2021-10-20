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
    <thead><td>nazwa</td><td>opcje</td></thead>

<c:forEach items="${symptoms}" var="symptom">
<tr>
    <td>${symptom.name}</td>
</tr>
</c:forEach>
</table>
</body>