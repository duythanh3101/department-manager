/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.qlphongban.bus;

import com.sam.qlphongban.dao.DepartmentDAO;
import com.sam.qlphongban.dto.Department;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "DeleteDeptServlet", urlPatterns = {"/xoadept"})
public class DeleteDeptServlet extends HttpServlet {
  private DepartmentDAO departmentDao = new DepartmentDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/department/deletedept.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
            String removeID = request.getParameter("removeID");
            int departmentId = Integer.parseInt(removeID);
            departmentDao.delete(departmentId);
            response.sendRedirect(request.getContextPath() + "/trangchudept");
    }
  
}
