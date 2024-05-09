<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<h2>Employee Information</h2>
<form action="saveEmployee" method="post" modelAttribute="employee">

    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br><br>

    <label for="age">Age:</label>
    <input type="number" id="age" name="age"><br><br>

    <label for="salary">Salary:</label>
    <input type="text" id="salary" name="salary"><br><br>

    <input type="submit" value="Save">
</form>
</body>
</html>