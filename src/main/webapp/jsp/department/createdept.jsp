<%-- 
    Document   : createdept
    Created on : May 1, 2019, 3:23:09 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Department</title>
    </head>
    <body>
        <h1>Add Department</h1>
        <form action="" method="POST">
            <div>
                Department name:
                <input type="text" name="txtName">
            </div>
            <div>
                <button type="submit">Submit</button>
            </div>
        </form>
        <a href="/trangchudept">Department List</a>
    </body>
</html>
