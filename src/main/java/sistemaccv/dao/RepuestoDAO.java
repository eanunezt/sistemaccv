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
public class RepuestoDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Repuesto> obtenerTodos(){
		return em.createNamedQuery("Repuesto.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Repuesto obtener(Long id){
		return em.find(Repuesto.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Repuesto guardar(Repuesto entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Repuesto.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Repuesto entidad){
		em.merge(entidad);
	}
	
	
}
