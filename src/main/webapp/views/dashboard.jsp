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
<div>
    <p> Dzienniczek głodu jest jedna z najprostszych metod rozpoznawana wzrostu napięcia emocjonalnego, a co za tym idzie także głodu alkoholowego.</p>
    <p>Aby moc właściwie wykorzystać jego możliwości zacznij od dodania objawów głodu alkoholowego.</p>
    <p>Całą postawę człowieka możnaby określi spoglądając na jego:
    <li>zachowanie </li>
    <li>uczucia </li>
    <li>myśli </li>
    <li>reakcje organizmu </li>

    Zastanów sie przez chwilę i dodaj po około 5 objawów z każdej kategorii.
    Nie ma zbytniego znaczenia, czy będzie ich łącznie koniecznie 20.
    Po paru dniach odkryjesz, jaki jest Twój standardowy poziom napięcie i zaczniesz łączyć zwiększoną ilość punków z pojawiającym sie przymusem picia/brania narkotyków
    </p>
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
</div>
</body>
</html>


