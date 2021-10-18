<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="pl">


<head>
    <meta charset="utf-8">
    <title>Dzienniczek głodu w uzależnieniu - rejestracja</title>
</head>
<h1>Rejestracja</h1>
<form:form method="post" action="/register" modelAttribute="user">
    user name: <form:input path="name"/><br/>
    <form:errors path="name"/><br/>

    email: <form:input path="email"/><br/>
    <form:errors path="email"/><br/>

    hasło: <form:input path="password"/>
    <input type="submit" value="register">
</form:form>
</html>