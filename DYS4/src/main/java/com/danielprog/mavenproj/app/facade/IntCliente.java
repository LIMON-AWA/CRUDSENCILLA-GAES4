/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielprog.mavenproj.app.facade;

import com.danielprog.mavenproj.app.model.Cliente;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface IntCliente {
    
    public List<Cliente> findAll();
    public Cliente findById(long id);
    public void add(Cliente Cliente);
    public void update(Cliente Cliente);
    public void delete(Cliente Cliente);
    
}
