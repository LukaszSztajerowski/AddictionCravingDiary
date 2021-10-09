<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">

<head>
    <meta charset="utf-8">
    <title>Dzienniczek Głodu </title>
</head>

<body>

<jsp:include page="appSideMenu.jsp"/>
<div>
    <div>
        <a href="/add/symptom">dodaj objaw</a>
    </div>
    <div>
        <a href="/app/day">dodaj kolejny dzien </a>
    </div>
    <div>
        <a href="/app/plan/add">dodaj sposoby radzenia sobie</a>
    </div>
</div>
</body>
</html>

