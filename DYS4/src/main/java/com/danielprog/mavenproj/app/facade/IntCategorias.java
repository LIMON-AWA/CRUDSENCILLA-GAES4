/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielprog.mavenproj.app.facade;

import java.util.List;
import com.danielprog.mavenproj.app.model.Categoria;

/**
 *
 * @author Administrator
 */
public interface IntCategorias {
    
    public List<Categoria> findAll();
    public Categoria findById(long id);
    public void add(Categoria Categorias);
    public void update(Categoria Categoria);
    public void delete(Categoria Categoria);
    
}

