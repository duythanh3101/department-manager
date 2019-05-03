/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.qlphongban.bus;

import com.sam.qlphongban.dao.DepartmentDAO;
import com.sam.qlphongban.dao.EmployeeDAO;
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
@WebServlet(name = "EditDeptServlet", urlPatterns = {"/capnhatdept"})
public class EditDeptServlet extends HttpServlet {
    private DepartmentDAO departmentDao = new DepartmentDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idTemp = request.getParameter("id");
        int id = Integer.parseInt(idTemp);
        request.setAttribute("department", departmentDao.read(id));
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/department/editdept.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
            String editedName = request.getParameter("editedName");
            String idTemp = request.getParameter("id");
            int departmentId = Integer.parseInt(idTemp);
            Department dep =  departmentDao.read(departmentId);
            dep.setName(editedName);
            departmentDao.update(dep);
            response.sendRedirect(request.getContextPath() + "/trangchudept");
    }

}
