<%-- 
    Document   : createproject
    Created on : May 2, 2019, 7:54:38 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Project</title>
    </head>
    <body>
        <h1>Add Project</h1>
        <form action="" method="POST">
            <div>
                Project name: <input type="text" id="txtName" name="txtName">
            </div>
            <div>
                Location: <input type="text" id="txtLocation" name="txtLocation">
            </div>
            <div>
                Number Of Emp: <input type="number" id="txtNoE" name="txtCount">
            </div>
            <div>
                Cost: <input type="text" id="txtCost" name="txtCost">
            </div>
            <div>
                Begin: <input type="date" id="txtBegin" name="txtBegin">
            </div>
            <div>
                End: <input type="date" id="txtEnd" name="txtEnd">
            </div>
            <div>
                <button type="submit">Submit</button>
            </div>
        </form>
        <a href="/trangchudept">Project List</a>
    </body>
</html>
