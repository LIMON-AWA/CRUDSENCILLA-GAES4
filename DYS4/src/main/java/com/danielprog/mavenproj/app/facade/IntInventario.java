/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielprog.mavenproj.app.facade;

import com.danielprog.mavenproj.app.model.Inventario;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface IntInventario {
    
    public List<Inventario> findAll();
    public Inventario findById(long id);
    public void add(Inventario Inventario);
    public void update(Inventario Inventario);
    public void delete(Inventario Inventario);
    
}
