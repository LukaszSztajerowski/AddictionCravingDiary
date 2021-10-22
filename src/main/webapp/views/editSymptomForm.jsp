<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="pl">


<head>
    <meta charset="utf-8">
    <title>Dzienniczek głodu w uzależnieniu - edycja symptomu</title>

</head>
<h1>edycja objawu objawu głodu</h1>
<form:form method="post" action="/user/editSymptom/{id}" modelAttribute="symptom">
    nazwa objawu:
    <form:hidden path="id" value="${id}"/>
    <form:input path="name"/><br/>
    <form:errors path="name"/><br/>

    <input type="submit" value="edytuj Objaw">

</form:form>
</html>