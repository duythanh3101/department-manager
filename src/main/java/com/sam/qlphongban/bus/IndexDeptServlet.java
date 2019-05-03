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
@WebServlet(name = "IndexDeptServlet", urlPatterns = {"/trangchudept"})
public class IndexDeptServlet extends HttpServlet {

    private DepartmentDAO objectDao = new DepartmentDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<Department> listItem = objectDao.readAll();
            request.setAttribute("listItem", listItem);
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/department/indexdept.jsp");
            rd.forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(IndexDeptServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
