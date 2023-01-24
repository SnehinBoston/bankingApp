<!DOCTYPE html>
<html lang="en" xmlns:th = "http://www.thymeleaf.org">
<head>
    <meta charset="ISO-8859-1">
    <title>Account Details</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Account Details</h1>
    <hr>
    <table>
        <tr>
            <th>First name</th>
            <th>Last name</th>
            <th>Account type</th>
        </tr>
        <tr>
            <td th:text="${account.firstName}">First name:</td>
            <td th:text="${account.lastName}">Last name:</td>
            <td th:text="${account.accountType}">Account type:</td>
          </tr>
        </table>
</div>
</body>
</html>