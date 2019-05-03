/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.qlphongban.bus;

import com.sam.qlphongban.dao.DepartmentDAO;
import com.sam.qlphongban.dao.EmployeeDAO;
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
@WebServlet(name = "DeleteEmpServlet", urlPatterns = {"/xoaemp"})
public class DeleteEmpServlet extends HttpServlet {
      private EmployeeDAO objectDao = new EmployeeDAO();
    private DepartmentDAO objectObjectDao = new DepartmentDAO();
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/employee/deleteemp.jsp");
            rd.forward(request, response);
        }catch(Exception ex) {
            Logger.getLogger(DeleteEmpServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idTemp = request.getParameter("removeID");
        int id = Integer.parseInt(idTemp);
        try{      
            objectDao.delete(id);
            response.sendRedirect(request.getContextPath() + "/trangchuemp");
        }catch(Exception ex) {
            
        }
    }

}
