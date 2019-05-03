<%-- 
    Document   : indexdept
    Created on : May 1, 2019, 3:22:58 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;    charset=UTF-8" language="java" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Department List</h1>
        <div style="margin-left: 100">
            <form action="taomoidept">
                <button type="Create">Create Department</button>
            </form>
            <form action="xoadept">
                 <button type="Delete">Delete Department</button>
            </form>
        </div>
       
              
        <div style="width: 1200px; margin-left: auto; margin-right: auto;">
            <table cellpadding="10">
                <tr>
                    <th>Id</th>
                    <th>Name</th>          
                    <th></th>
                </tr>
                <c:forEach var="row" items="${requestScope.listItem}">
                    <tr>
                        <td><c:out value ="${row.id}"/></td>
                        <td><c:out value ="${row.name}"/></td>
                    
                        <td>
                            <a href="chitietdept?id=${row.id}">Details</a>
                            <a href="capnhatdept?id=${row.id}">Edit</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
<html
