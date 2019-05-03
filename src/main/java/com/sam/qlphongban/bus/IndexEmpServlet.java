/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.qlphongban.bus;

import com.sam.qlphongban.dao.EmployeeDAO;
import com.sam.qlphongban.dto.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "IndexEmpServlet", urlPatterns = {"/trangchuemp"})
public class IndexEmpServlet extends HttpServlet {
      private EmployeeDAO employeeDao = new EmployeeDAO();
      
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<Employee> listItem = employeeDao.readAll();
            request.setAttribute("listItem", listItem);
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/employee/indexemp.jsp");
            rd.forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(IndexEmpServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
  
}
