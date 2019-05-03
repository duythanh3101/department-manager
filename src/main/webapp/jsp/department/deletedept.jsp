<%-- 
    Document   : deletedept
    Created on : May 2, 2019, 1:29:15 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Department</title>
    </head>
    <body>
        <h1>Delete Department</h1>
        <form action="" method="POST">
            <div>
                Department ID:
                <input type="text" name="removeID" value="">
            </div>
            <div>
                <button type="Delete">Delete</button>
            </div>
        </form>
        <a href="trangchudept">Department List</a>
    </body>
</html>
