<%-- 
    Document   : indexemp
    Created on : May 2, 2019, 1:53:11 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;    charset=UTF-8" language="java" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Home</title>
    </head>
    <body>
        <h1>Employee List</h1>
        <div style="margin-left: 100">
            <form action="taomoiemp">
                <button type="Create">Create Employee</button>
            </form>
            <form action="xoaemp">
                 <button type="Delete">Delete Employee</button>
            </form>
        </div>           
        <div style="width: 1300px; margin-left: auto; margin-right: auto;">
            <table cellpadding="10">
                <tr>
                    <th>Id</th>
                    <th>Name</th>      
                    <th>Salary</th>   
                    <th>Degree</th>
                    <th>Department Name</th>   
                    <th></th>
                </tr>
                <c:forEach var="row" items="${requestScope.listItem}">
                    <tr>
                        <td><c:out value ="${row.eid}"/></td>
                        <td><c:out value ="${row.ename}"/></td>
                        <td><c:out value ="${row.salary}"/></td>
                        <td><c:out value ="${row.deg}"/></td>
                        <td><c:out value ="${row.department.name}"/></td>
                        
                        <td>
                            <a href="chitietemp?id=${row.eid}">Details</a>
                            <a href="capnhatemp?id=${row.eid}">Edit</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
<html

