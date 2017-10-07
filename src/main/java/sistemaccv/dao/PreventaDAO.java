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
public class PreventaDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Preventa> obtenerTodos(){
		return em.createNamedQuery("Preventa.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Preventa obtener(Long id){
		return em.find(Preventa.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Preventa guardar(Preventa entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Preventa.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Preventa entidad){
		em.merge(entidad);
	}
	
	
}
