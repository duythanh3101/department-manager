<%-- 
    Document   : editdept
    Created on : May 1, 2019, 3:23:17 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Department</title>
    </head>
    <body>
        <h1>Edit Department</h1>
        <form action="" method="POST">
            <div>
                Department name:
                <input type="text" name="editedName" value="${requestScope.department.name}">
            </div>
            <div>
                <button type="Edit">Edit</button>
            </div>
        </form>
        <a href="trangchudept">Department List</a>
    </body>
</html>
