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
    <table>
        <thead>
            <th>nazwa objawu</th>
            <c:forEach items="${acd}" var="acd">
                <th>${acd.date}</th>
            </c:forEach>
        </thead>
        <tbody>
        <c:forEach items="${acd}" begin="0" end="0" var="acd">
            <c:forEach items="${acd.symptomPowerMap}" var="map">
                <tr>${map.key.symptomName}</tr>
            </c:forEach>

        </c:forEach>
        </tbody>
    </table>



</div>
</body>
</html>


