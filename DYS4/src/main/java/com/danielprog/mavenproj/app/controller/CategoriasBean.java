/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielprog.mavenproj.app.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.danielprog.mavenproj.app.facadeimp.CategoriasIMP;
import com.danielprog.mavenproj.app.model.Categoria;

@ManagedBean(name = "CategoriasBean")
@RequestScoped
public class CategoriasBean {
	
	public String nuevo() {
		Categoria Categorias= new Categoria();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("Categorias", Categorias);
		return  "/faces/add.xhtml";
	}	
        
        public String guardar (Categoria Categoria) {
		
		CategoriasIMP CategoriasIMP= new CategoriasIMP();
		CategoriasIMP.guardar(Categoria);
		return  "/faces/index.xhtml";
	}

	public List<Categoria> obtenerCategorias() {
		CategoriasIMP CategoriasIMP = new CategoriasIMP();
		 /*List<Categoria> listCategorias = new ArrayList<>(); 
                 
                 Categoria C1 = new Categoria();
		 C1.setId_Categoria(1L); 
                 Date fechaActual= new Date();
                 C1.setFecha(new java.sql.Date(fechaActual.getTime())); 
                 C1.setDescripcion("Herramientas");
                 
		 Categoria C2 = new Categoria(); 
                 C2.setId_Categoria(1L); 
                 Date fechaActual2= new Date();
                 C2.setFecha(new java.sql.Date(fechaActual2.getTime()));
                 C2.setDescripcion("Bisturi");
                 
		 ListCategorias.add(C1);
		 ListCategorias.add(C2);*/
		 return CategoriasIMP.obtenerCategorias();
		 
	}

	public String editar(Long id) {
		CategoriasIMP CategoriasIMP = new CategoriasIMP();
		Categoria Categorias = new Categoria();
		Categorias = CategoriasIMP.buscar(id);
		System.out.println("******************************************");
		System.out.println(Categorias);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("Categorias", Categorias);
		return "/faces/editar.xhtml";
	}

	// eliminar un cliente
	public String eliminar(Long id) {
		CategoriasIMP CategoriasIMP = new CategoriasIMP();
		CategoriasIMP.eliminar(id);
		System.out.println("Categorias eliminado..");
		return "/faces/Categoria/list.xhtml";
	}

}
