/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.qlphongban.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="employees")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="eid")
    private int eid;
    @Column(name="name")
    private String ename;
    @Column(name="salary")
    private double salary;
    @Column(name="deg")
    private String deg;
    @ManyToOne
    @JoinColumn(name="did")
    private Department department;

    public Employee(String ename, double salary, String deg, Department department) {
        this.ename = ename;
        this.salary = salary;
        this.deg = deg;
        this.department = department;
    }

    public Employee(){}
    
    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public double getSalary() {
        return salary;
    }

    public String getDeg() {
        return deg;
    }

    public Department getDepartment() {
        return department;
    }


    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}