/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.qlphongban.dao;

import com.sam.qlphongban.dto.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Admin
 */
public class EmployeeDAO {
    private EntityManager em;
    private EntityManagerFactory emf;
    public EmployeeDAO()
    {
        emf = Persistence.createEntityManagerFactory("QLPhongBanService");
        em = emf.createEntityManager();
    }

    public List<Employee> readAll()
    {
        em.clear();
        if (!em.getTransaction().isActive()){
            em.getTransaction().begin();
        }
        List<Employee> result = em.createQuery("from Employee", Employee.class).getResultList();
        em.getTransaction().commit();
        return result;
    }

    public void create(Employee employee)
    {
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
    }

    public Employee read(int eid)
    {
        return em.find(Employee.class, eid);
    }
    
    public List<Employee> readAllByDepartmentID(int id)
    {
        em.clear();
        em.getTransaction().begin();
        Query query = em.createQuery("select e from Employee e where e.department.id = " + id );
        //query.setParameter(1, id);
        List<Employee> result = query.getResultList();
        //List<Employee> result = em.createNativeQuery("Select * from Employee where did = " + id, Employee.class).getResultList();
        em.getTransaction().commit();
        return result;
    }
    
    public void update(Employee employee)
    {
        Employee curr = em.find(Employee.class, employee.getEid());
        em.getTransaction().begin();
        curr.setEname(employee.getEname());
        curr.setDeg(employee.getDeg());
        curr.setDepartment(employee.getDepartment());
        curr.setSalary(employee.getSalary());
        em.getTransaction().commit();
    }

    public void delete(int eid)
    {
        Employee curr = em.find(Employee.class, eid);
        if (curr != null){
            em.getTransaction().begin();
            em.remove(curr);
            em.getTransaction().commit();
        }
     
    }
}
