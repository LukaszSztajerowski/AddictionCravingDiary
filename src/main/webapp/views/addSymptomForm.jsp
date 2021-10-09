<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html lang="pl">


<head>
    <meta charset="utf-8">
    <title>Dzienniczek głodu w uzależnieniu - dodawanie symptomu</title>
</head>
<h1>Dodawanie objawu głodu</h1>
<form:form method="post" action="/add/symptom" modelAttribute="symptom">
    nazwa objawu: <form:input path="symptomName"/><br/>
    <form:errors path="symptomName"/><br/>

    opis objawu: <form:input path="syptomDescription"/><br/>
    <form:errors path="syptomDescription"/><br/>
    <input type="submit" value="Dodaj Objaw">

</form:form>
</html>