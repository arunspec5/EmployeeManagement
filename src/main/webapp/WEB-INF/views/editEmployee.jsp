<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Employee Management</title>
        <style type="text/css">
            .error {
                color: red;
            }
            table {
                width: 50%;
                border-collapse: collapse;
                border-spacing: 0px;
            }
            table td {
                border: 1px solid #565454;
                padding: 20px;
            }
            table td {
                border: 1px solid #565454;
                padding: 20px;
            }
        </style>
    </head>
    <body>
        <h1>Input Form</h1>
        <form:form action="addEmployee" method="post" modelAttribute="employee">
            <table>
                <tr>
                    <td>Name</td>
                    <td>
                        <form:input path="name" /> <br />
                        <form:errors path="name" cssClass="error" />
                    </td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>
                        <form:input path="address" /> <br />
                        <form:errors path="address" cssClass="error" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><button type="submit">Submit</button></td>
                </tr>
            </table>
        </form:form>
         
        <h2>Employees List</h2>
        <table>
            <tr>
                <td><strong>Id</strong></td>
                <td><strong>Name</strong></td>
                <td><strong>Address</strong></td>
            </tr>
            <c:forEach items="${employees}" var="employee">
                <tr>
                	<td>${employee.id}</td>
                    <td>${employee.name}</td>
                    <td>${employee.address}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>