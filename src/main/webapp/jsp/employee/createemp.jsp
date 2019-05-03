<%-- 
    Document   : createemp
    Created on : May 2, 2019, 1:53:38 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Employee</title>
    </head>
    <body>
        <h1>Add Employee</h1>
        <div style="width: 1200px; margin-left: auto; margin-right: auto;">
            <table cellpadding="10">
                <form action="" method="POST">
                  
                        Name:<br>
                        <input type="text" name="txtName" style="width: 200px"> </br>

                  
                        Degree:<br>
                        <input type="text" name="txtDegree" style="width: 200px"> </br>
                   
                        Salary:<br>
                        <input type="text" name="txtSalary" style="width: 200px"> </br>
                    
                        Department:<br>
                        <select name="txtDepartId" style="width: 200px">
                            <c:forEach var="item" items="${requestScope.listItem}">
                                <option value="${item.id}">
                                    <c:out value="${item.name}"/>
                                </option>
                            </c:forEach>
                        </select> </br>
                    

                    <div>
                        <button type="submit">Submit</button>
                    </div>
                </form>
            </table>
        </div>
    </body>
        <a href="trangchuemp">Employee List</a>
    </body>
</html>