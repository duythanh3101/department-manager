/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.qlphongban.dao;

import com.sam.qlphongban.dto.Project;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ProjectDAO {
    private EntityManager em;
    private EntityManagerFactory emf;
    
    public ProjectDAO()
    {
        emf = Persistence.createEntityManagerFactory("QLPhongBanService");
        em = emf.createEntityManager();
    }

    public List<Project> readAll()
    {
        em.clear();
        if (!em.getTransaction().isActive()){
            em.getTransaction().begin();
        }
        List<Project> result = em.createQuery("from Project", Project.class).getResultList();
        em.getTransaction().commit();
        return result;
    }

    public void create(Project project)
    {
        em.getTransaction().begin();
        em.persist(project);
        em.getTransaction().commit();
    }

    public Project read(int id)
    {
        return em.find(Project.class, id);
    }
   
    
    public void update(Project project)
    {
        Project curr = em.find(Project.class, project.getId());
        em.getTransaction().begin();
        
        curr.setName(project.getName());
        curr.setLocation(project.getLocation());
        curr.setNumOfEmp(project.getNumOfEmp());
        curr.setCost(project.getCost());
        curr.setBegin(project.getBegin());
        curr.setEnd(project.getEnd());
        
        em.getTransaction().commit();
    }

    public void delete(int id)
    {
        Project curr = em.find(Project.class, id);
        em.getTransaction().begin();
        em.remove(curr);
        em.getTransaction().commit();
    }
}
