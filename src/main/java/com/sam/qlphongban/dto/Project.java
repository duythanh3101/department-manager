/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.qlphongban.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name="projects")
public class Project implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="name", length=50)
    private String name;
    
    @Column(name="location", length=100)
    private String location;
    
    @Column(name="numberOfEmp")
    @Size(min=0, max=100)
    private int numOfEmp;
    
    @Column(name="cost")
    @Size(min=10000)
    private double cost;
    
    @Column(name="begin")
    private String begin;
    
    @Column(name="end")
    private String end;

    public Project(String name, String location, int numOfEmp, double cost, String begin, String end) {
        this.name = name;
        this.location = location;
        this.numOfEmp = numOfEmp;
        this.cost = cost;
        this.begin = begin;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumOfEmp() {
        return numOfEmp;
    }

    public void setNumOfEmp(int numOfEmp) {
        this.numOfEmp = numOfEmp;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    
}