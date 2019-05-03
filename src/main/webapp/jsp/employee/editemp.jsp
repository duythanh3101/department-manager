<%-- 
    Document   : editemp
    Created on : May 2, 2019, 1:53:47 PM
    Author     : Admin
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Employee</title>
    </head>
    <body>
        <h1>Edit Employee</h1>
        <div style="width: 1200px; margin-left: auto; margin-right: auto;">
            <table cellpadding="10">
                <form action="" method="POST">
                  
                        Name:<br>
                        <input type="text" name="txtName" value="${requestScope.item.ename}" style="width: 200px"> </br>

                        Degree:<br>
                        <input type="text" name="txtDegree" value="${requestScope.item.deg}" style="width: 200px"> </br>
                   
                        Salary:<br>
                        <input type="text" name="txtSalary" value="${requestScope.item.salary}"  style="width: 200px"> </br>
                    
                        Department:<br>
                        <select name="txtDeptId" style="width: 200px">
                            <c:forEach var="item" items="${requestScope.listItem}">
                                <option value="${item.id}">
                                    <c:out value="${item.name}"/>
                                </option>
                            </c:forEach>
                        </select> </br>

                    <div>
                        <button type="Edit">Edit</button>
                    </div>
                </form>
            </table>
        </div>
    </body>
        <a href="trangchuemp">Employee List</a>
    </body>
</html>