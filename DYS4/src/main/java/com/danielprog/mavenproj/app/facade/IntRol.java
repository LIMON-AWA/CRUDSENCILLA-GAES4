/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielprog.mavenproj.app.facade;

import com.danielprog.mavenproj.app.model.Rol;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface IntRol {
    
    public List<Rol> findAll();
    public Rol findById(long id);
    public void add(Rol Roles);
    public void update(Rol Rol);
    public void delete(Rol Rol);
    
}
