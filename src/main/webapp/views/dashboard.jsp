<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page isELIgnored="false" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="pl">--%>

<%--<head>--%>
<%--    <meta charset="utf-8">--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">--%>
<%--    <title>Dzienniczek Głodu </title>--%>
<%--    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"--%>
<%--          crossorigin="anonymous">--%>
<%--    <link href="https://fonts.googleapis.com/css?family=Charmonman:400,700|Open+Sans:400,600,700&amp;subset=latin-ext"--%>
<%--          rel="stylesheet">--%>
<%--    <link rel="stylesheet" href="./css/style.css">--%>
<%--    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">--%>
<%--</head>--%>

<%--<body>--%>

<%--&lt;%&ndash;<jsp:include page="/viwes/appSideMenu.jsp"/>&ndash;%&gt;--%>

<%--<div class="m-4 p-4 width-medium">--%>
<%--    <div class="dashboard-header m-4">--%>
<%--        <div class="dashboard-menu">--%>
<%--            <div class="menu-item border-dashed">--%>
<%--                <a href="/add/symptom">--%>
<%--                    <i class="far fa-plus-square icon-plus-square"></i>--%>
<%--                    <span class="title">dodaj objaw</span>--%>
<%--                </a>--%>
<%--            </div>--%>
<%--            <div class="menu-item border-dashed">--%>
<%--                <a href="/app/day"> // zmiana adrsu na liste sposobów radzenia sobie--%>
<%--                    <i class="far fa-plus-square icon-plus-square"></i>--%>
<%--                    <span class="title">dodaj kolejny dzien </span>--%>
<%--                </a>--%>
<%--            </div>--%>
<%--            <div class="menu-item border-dashed">--%>
<%--                <a href="/app/plan/add"> // zmiana adrsu na liste sposobów radzenia sobie--%>
<%--                    <i class="far fa-plus-square icon-plus-square"></i>--%>
<%--                    <span class="title">dodaj sposoby radzenia sobie</span>--%>
<%--                </a>--%>
<%--            </div>--%>

<%--        </div>--%>

<%--&lt;%&ndash;        <div class="dashboard-alerts">&ndash;%&gt;--%>
<%--&lt;%&ndash;            <div class="alert-item alert-info">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <i class="fas icon-circle fa-info-circle"></i>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <span class="font-weight-bold">Liczba objawów: ${numberOfRecipes}</span>&ndash;%&gt;--%>
<%--&lt;%&ndash;            </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;            <div class="alert-item alert-light">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <i class="far icon-calendar fa-calendar-alt"></i>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <span class="font-weight-bold">Liczba punktów : ${numberOfPlans}</span>&ndash;%&gt;--%>
<%--&lt;%&ndash;            </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <div class="m-4 p-4 border-dashed">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <h2 class="dashboard-content-title">&ndash;%&gt;--%>
<%--&lt;%&ndash;            <span>Ostatnio dodany plan:</span> ${planName}&ndash;%&gt;--%>
<%--&lt;%&ndash;        </h2>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <c:forEach items="${planDetailsList}" var="plan">&ndash;%&gt;--%>
<%--&lt;%&ndash;            <table class="table">&ndash;%&gt;--%>

<%--&lt;%&ndash;                <thead>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <tr class="d-flex">&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <th class="col-2">${plan.dayName}</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <th class="col-8"></th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <th class="col-2"></th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </thead>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <tbody>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <tr class="d-flex">&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td class="col-2">${plan.mealName}</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td class="col-8">${plan.recipeName}</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td class="col-2"><button type="button" class="btn btn-primary rounded-0">Szczegóły</button></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tbody>&ndash;%&gt;--%>
<%--&lt;%&ndash;            </table>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </c:forEach>&ndash;%&gt;--%>

<%--&lt;%&ndash;    </div>&ndash;%&gt; // zamienic tą tabele na widok tabeli objawów głodu--%>
<%--</div>--%>
<%--</div>--%>
<%--</section>--%>


<%--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--</body>--%>
<%--</html>--%>
web dash