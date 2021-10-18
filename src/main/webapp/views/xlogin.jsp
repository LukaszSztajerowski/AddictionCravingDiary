<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">

<head>
    <meta charset="utf-8">
    <title>Dzienniczek głodu w uzależnieniu - logowanie</title>
</head>
<body>
<form method="post" action="/login">
    <h1>Logowanie</h1>
    login <input type="text" name="userName" placeholder="Podaj nazwę użytkownika"><br/>
    hasło <input type="password" name="password" placeholder="Podaj hasło"><br/>
    <button type="submit"> Zaloguj</button>
</form>
</body>