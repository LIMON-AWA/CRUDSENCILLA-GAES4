/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielprog.mavenproj.app.facade;

import com.danielprog.mavenproj.app.model.Domicilio;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface IntDomicilio {
    
    public List<Domicilio> findAll();
    public Domicilio findById(long id);
    public void add(Domicilio Domicilio);
    public void update(Domicilio Domicilio);
    public void delete(Domicilio Domicilio);
    
}
