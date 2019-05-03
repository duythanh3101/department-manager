<%-- 
    Document   : indexproject
    Created on : May 2, 2019, 7:54:08 PM
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
        <h1>Project List</h1>
        <div style="margin-left: 100">
            <form action="taomoiproject">
                <button type="Create">Create Project</button>
            </form>
            <form action="xoaproject">
                 <button type="Delete">Delete Project</button>
            </form>
        </div>
       
              
        <div style="width: 1200px; margin-left: auto; margin-right: auto;">
            <table cellpadding="10">
                <tr>
                    <th>Id</th>
                    <th>Project Name</th>          
                    <th></th>
                </tr>
                <c:forEach var="row" items="${requestScope.listItem}">
                    <tr>
                        <td><c:out value ="${row.id}"/></td>
                        <td><c:out value ="${row.name}"/></td>
                    
                        <td>
                            <a href="capnhatproject?id=${row.id}">Edit</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
<html
