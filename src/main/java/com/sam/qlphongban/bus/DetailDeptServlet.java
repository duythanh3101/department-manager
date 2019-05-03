/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.qlphongban.bus;

import com.sam.qlphongban.dao.DepartmentDAO;
import com.sam.qlphongban.dao.EmployeeDAO;
import com.sam.qlphongban.dto.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "DetailDeptServlet", urlPatterns = {"/chitietdept"})
public class DetailDeptServlet extends HttpServlet {
    private EmployeeDAO employeeDao = new EmployeeDAO();
    private DepartmentDAO departmentDao = new DepartmentDAO();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idTemp = request.getParameter("id");
        int departmentId = Integer.parseInt(idTemp);
        List<Employee> lst = employeeDao.readAllByDepartmentID(departmentId);
        String departmentName = departmentDao.read(departmentId).getName();
        
        request.setAttribute("departmentName", departmentName);
        request.setAttribute("listItem", lst);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/department/detaildept.jsp");
        rd.forward(request, response);
    }

}
