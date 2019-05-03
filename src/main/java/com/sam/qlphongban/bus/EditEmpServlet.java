/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.qlphongban.bus;

import com.sam.qlphongban.dao.DepartmentDAO;
import com.sam.qlphongban.dao.EmployeeDAO;
import com.sam.qlphongban.dto.Department;
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
@WebServlet(name = "EditEmpServlet", urlPatterns = {"/capnhatemp"})
public class EditEmpServlet extends HttpServlet {
 private EmployeeDAO objectDao = new EmployeeDAO();
    private DepartmentDAO objectObjectDao = new DepartmentDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String idTemp = request.getParameter("id");
            int id = Integer.parseInt(idTemp);
            Employee item = objectDao.read(id);
            List<Department> listItem = objectObjectDao.readAll();
            
            request.setAttribute("item", item);   
            request.setAttribute("listItem", listItem);
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/employee/editemp.jsp");
            rd.forward(request, response);
        }catch(Exception ex) {
            Logger.getLogger(EditEmpServlet.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("txtName");
        double salary = Double.parseDouble(request.getParameter("txtSalary"));
        String deg = request.getParameter("txtDegree");
        int deptId = Integer.parseInt(request.getParameter("txtDeptId"));
        Department dept = objectObjectDao.read(deptId);
        try{
            Employee item = new Employee(name, salary, deg, dept);
            item.setEid(id);
            objectDao.update(item);
            response.sendRedirect(request.getContextPath() + "/trangchuemp");
        }catch(Exception ex)  {
            
        }
    }
}
