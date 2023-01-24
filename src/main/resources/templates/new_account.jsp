<!DOCTYPE html>
<html lang="en" xmlns:th = "http://www.thymeleaf.org">
<head>
    <meta charset="ISO-8859-1">
    <title>Account Creation System</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Account Creation System</h1>
    <hr>
    <h2>Account Creation</h2>
    <form action="#" th:action="@{/saveAccount}" th:object="${Accounts}" method="POST">
            <input type="text" th:field="*{firstName}" placeholder="Account First Name" class="form-control mb-4 col-4">
            <input type="text" th:field="*{lastName}" placeholder="Account Last Name" class="form-control mb-4 col-4">

            <input type="text" th:field="*{accountType}" placeholder="Account Type" class="form-control mb-4 col-4">
            <button type="submit" class="btn btn-info col-2"> Create Account</button>
    </form>
</div>
</body>
</html>