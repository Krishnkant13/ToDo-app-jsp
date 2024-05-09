<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.jspBoot.entity.Employee" %> <!-- Import your Employee class or use the fully qualified name -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
</head>
<body>
    <h2>Employee List</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Salary</th>
        </tr>
        <%
            List<Employee> employeeList = (List<Employee>) request.getAttribute("employeeList");
            for(Employee employee : employeeList) {
        %>
        <tr>
            <td><%= employee.getId() %></td>
            <td><%= employee.getName() %></td>
            <td><%= employee.getAge() %></td>
            <td><%= employee.getSalary() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
