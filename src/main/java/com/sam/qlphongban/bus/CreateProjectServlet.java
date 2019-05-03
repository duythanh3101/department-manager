/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.qlphongban.bus;

import com.sam.qlphongban.dao.DepartmentDAO;
import com.sam.qlphongban.dao.ProjectDAO;
import com.sam.qlphongban.dto.Department;
import com.sam.qlphongban.dto.Project;
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
@WebServlet(name = "CreateProjectServlet", urlPatterns = {"/taomoiproject"})
public class CreateProjectServlet extends HttpServlet {
    private ProjectDAO objectDao = new ProjectDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/project/createproject.jsp");
           rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      try{
           String name = request.getParameter("txtName");
           String location = request.getParameter("txtLocation");
           int numOfEmp = Integer.parseInt(request.getParameter("txtCount"));
           double cost = Double.parseDouble(request.getParameter("txtCost"));
           String begin = request.getParameter("txtBegin");
           String end = request.getParameter("txtEnd");
           Project item = new Project(name, location, numOfEmp, cost, begin, end);
           objectDao.create(item);
           response.sendRedirect(request.getContextPath() + "/trangchuproject");
       } catch(Exception ex){
           Logger.getLogger(CreateProjectServlet.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
