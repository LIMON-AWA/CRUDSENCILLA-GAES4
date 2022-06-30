/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielprog.mavenproj.app.facade;

import com.danielprog.mavenproj.app.model.Producto;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface IntProducto {
    
    public List<Producto> findAll();
    public Producto findById(long id);
    public void add(Producto Producto);
    public void update(Producto Producto);
    public void delete(Producto Producto);
    
}
