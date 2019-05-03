<%-- 
    Document   : detaildept
    Created on : May 1, 2019, 3:23:27 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit</title>
    </head>
    <body>
        <h1>Department Detail</h1>
            <div>
                Department Name: 
                <span id="txtName" name="txtName" style='font-weight: bold'>${requestScope.departmentName}</span>
            </div>
        <p>Employee List: </p>
          
        <div style="width: 1200px; margin-left: auto; margin-right: auto;">
            <table cellpadding="10">
                <tr>
                    <th>Id</th>
                    <th>Name</th>     
                    <th>Salary</th>
                    <th>Degree</th>
                    <th></th>
                </tr>
                <c:forEach var="row" items="${requestScope.listItem}">
                    <tr>
                        <td><c:out value ="${row.eid}"/></td>
                        <td><c:out value ="${row.ename}"/></td>
                        <td><c:out value ="${row.salary}"/></td>
                        <td><c:out value ="${row.deg}"/></td>
                    
                        <td>
                            <a href="chitietemp?id=${row.eid}">Details</a>
                            <a href="capnhatemp?id=${row.eid}">Edit</a>
                            <a href="xoaemp?id=${row.eid}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <a href="trangchudept">Return Department List</a>
    </body>
</html>