/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielprog.mavenproj.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Administrator
 */
@Entity
@Table(name="Categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Idcategoria;
    @Column
    private String Descripcion;

    public int getIdcategoria() {
        return Idcategoria;
    }

    public void setIdcategoria(int Id_Categoria) {
        this.Idcategoria = Id_Categoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Categorias{" + "Id_Categoria=" + Idcategoria + ", Descripcion=" + Descripcion + '}';
    }
    
    
}
