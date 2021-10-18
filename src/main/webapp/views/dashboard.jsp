<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">

<head>
    <meta charset="utf-8">
    <title>Dzienniczek Głodu - strona główna </title>
</head>

<body>
<div>
    <jsp:include page="header.jsp"/>
</div>
<div>
    <jsp:include page="appSideMenu.jsp"/>
</div>
<div>

    <hr/>
    <c:forEach items="${acd}" var="acdItem">
        <b>Data: ${acdItem.date}</b> <br/>
        <c:forEach items="${acdItem.symptomPowerMap}" var="acdItemEntry">
             ${acdItemEntry.key.name} - ${acdItemEntry.value} <br/>
        </c:forEach>
        <b>Suma wartości siły napięcia: ${acdItem.powerSum} </b>
        <br/>
        <br/>
    </c:forEach>


</div>
</body>
</html>


