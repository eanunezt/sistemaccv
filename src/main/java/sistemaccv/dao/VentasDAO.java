package sistemaccv.dao;

import sistemaccv.modelo.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
  *  @generated
  *  @author eanunezt
  */
@Stateless
public class VentasDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Ventas> obtenerTodos(){
		return em.createNamedQuery("Ventas.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Ventas obtener(Long id){
		return em.find(Ventas.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Ventas guardar(Ventas entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Ventas.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Ventas entidad){
		em.merge(entidad);
	}
	
	
}
