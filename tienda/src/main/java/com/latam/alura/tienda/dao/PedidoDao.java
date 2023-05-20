package com.latam.alura.tienda.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.modelo.pedido;

public class PedidoDao {
	
	private EntityManager em;

	public PedidoDao(EntityManager em) {
		this.em = em;
	}
	
	public void guardar(pedido pedido) {
		this.em.persist(pedido);
	}
	
	
	public void actualizar(pedido pedido) {
		this.em.merge(pedido);
	}
	
	public void remover(pedido pedido) {
		pedido=this.em.merge(pedido);
		this.em.remove(pedido);
	}
	
	public pedido consultaPorId(Long id) {
		return em.find(pedido.class, id);
	}
	
	public List<pedido> consultarTodos(){
		String jqpl= "SELECT P FROM pedido AS P";
		return em.createQuery(jqpl,pedido.class).getResultList();
	}
	
	public List<pedido> consultaPorNombre(String nombre){
		String jpql =" SELECT P FROM pedido AS P WHERE P.nombre=:nombre ";
		return em.createQuery(jpql,pedido.class).setParameter("nombre", nombre).getResultList();
	}
	
	public List<pedido> consultaPorNombreDeCategoria(String nombre){
		String jpql="SELECT p FROM pedido AS p WHERE p.categoria.nombre=:nombre";
		return em.createQuery(jpql,pedido.class).setParameter("nombre", nombre).getResultList();
	}
	 
	public BigDecimal consultarPrecioPorNombreDepedido(String nombre) {
		String jpql="SELECT P.precio FROM pedido AS P WHERE P.nombre=:nombre";
		return em.createQuery(jpql,BigDecimal.class).setParameter("nombre", nombre).getSingleResult();
	}

}
