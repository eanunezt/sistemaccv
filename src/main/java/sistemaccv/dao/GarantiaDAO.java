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
public class GarantiaDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Garantia> obtenerTodos(){
		return em.createNamedQuery("Garantia.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Garantia obtener(Long id){
		return em.find(Garantia.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Garantia guardar(Garantia entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Garantia.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Garantia entidad){
		em.merge(entidad);
	}
	
	
}
