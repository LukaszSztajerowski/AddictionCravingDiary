<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html lang="pl">

<head>
    <meta charset="utf-8">
    <title>Dzienniczek Głodu - edycja Objawu </title>
</head>

<body>
<div>
    <jsp:include page="header.jsp"/>
</div>
<div>
    <jsp:include page="appSideMenu.jsp"/>
</div>

<form:form method="post" action="/user/edit/symptom" modelAttribute="symptom">
    nazwa : <form:input path="symptomName"/><br/>
    <form:errors path="symptomName"/><br/>

    opis <form:input path="symptomDescription"/><br/>
    <form:errors path="symptomDescription"/><br/>

    <input type="submit" value="edytuj">
</form:form>

</body>