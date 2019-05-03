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
@WebServlet(name = "CreateDeptServlet", urlPatterns = {"/taomoidept"})
public class CreateDeptServlet extends HttpServlet {
    private DepartmentDAO objectDao = new DepartmentDAO();
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/department/createdept.jsp");
           rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try{
           String name = request.getParameter("txtName");
           Department item = new Department(name);
           objectDao.create(item);
           response.sendRedirect(request.getContextPath() + "/trangchudept");
       } catch(Exception ex) {
           Logger.getLogger(CreateDeptServlet.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

   
}
