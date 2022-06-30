/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielprog.mavenproj.app.facadeimp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.danielprog.mavenproj.app.model.Categoria;
import com.danielprog.mavenproj.app.utilities.JPAUtil;

public class CategoriasIMP {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	// guardar Categoria
	public void guardar(Categoria Categoria) {
		entity.getTransaction().begin();
		entity.persist(Categoria);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}

	// editar Categoria
	public void editar(Categoria Categoria) {
		entity.getTransaction().begin();
		entity.merge(Categoria);
		entity.getTransaction().commit();
		/// JPAUtil.shutdown();
	}

	// buscar Categoria
	public Categoria buscar(Long id) {
		Categoria C = new Categoria();
		C = entity.find(Categoria.class, id);
		// JPAUtil.shutdown();
		return C;
	}

	/// eliminar Categoria
	public void eliminar(Long id) {
		Categoria C = new Categoria();
		C = entity.find(Categoria.class, id);
		entity.getTransaction().begin();
		entity.remove(C);
		entity.getTransaction().commit();
	}

	// obtener todos los Categoria
	public List<Categoria> obtenerCategorias() {
		List<Categoria> listCategorias = new ArrayList<>();
		Query q = entity.createQuery("SELECT c FROM Categoria c");
		listCategorias= q.getResultList();
		return listCategorias;
	}

}
