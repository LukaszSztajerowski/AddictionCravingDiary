<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<header class="page-header">
    <nav class="navbar navbar-expand-lg justify-content-between">
        <a href="/app" class="navbar-brand main-logo main-logo-smaller"> //link do zmiany
           Dzienniczek Głodu
        </a>
        <div class="d-flex justify-content-around">
            <h4 class="text-light mr-3">${User.login}</h4> // sprawdzić
            <div class="circle-div text-center"><i class="fas fa-user icon-user"></i></div>
        </div>
    </nav>
</header>

<section class="dashboard-section">
    <div class="row dashboard-nowrap">
        <ul class="nav flex-column long-bg">
            <li class="nav-item">
                <a class="nav-link" href="/app">
                    <span>Pulpit</span>
                    <i class="fas fa-angle-right"></i>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/app/recipe/list">//adres do zmiany na pokazujący listę objawów
                    <span>Objawy</span>
                    <i class="fas fa-angle-right"></i>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/app/plan/list"> // adres do dodania kolejnego dnia
                    <span>wypłnij dzienniczek</span>
                    <i class="fas fa-angle-right"></i>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/app/admins/edit"> // adres do pokazania ACD -> wykres
                    <span>pokaż wykres</span>
                    <i class="fas fa-angle-right"></i>
                </a>
            </li>
<%--            <li class="nav-item">--%>
<%--                <a class="nav-link" href="/app/admins/edit"> // adres do pokazania ACD -> wykres--%>
<%--                    <span>pokaż sposoby radzenia sobie</span>--%>
<%--                    <i class="fas fa-angle-right"></i>--%>
<%--                </a>--%>
<%--            </li>--%>                                   w przyszłości
        </ul>
    </div>
</section>