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
public class VehiculoDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Vehiculo> obtenerTodos(){
		return em.createNamedQuery("Vehiculo.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Vehiculo obtener(Long id){
		return em.find(Vehiculo.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Vehiculo guardar(Vehiculo entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Vehiculo.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Vehiculo entidad){
		em.merge(entidad);
	}
	
	
}
