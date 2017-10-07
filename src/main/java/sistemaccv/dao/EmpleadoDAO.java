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
public class EmpleadoDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Empleado> obtenerTodos(){
		return em.createNamedQuery("Empleado.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Empleado obtener(Long id){
		return em.find(Empleado.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Empleado guardar(Empleado entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Empleado.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Empleado entidad){
		em.merge(entidad);
	}
	
	
}
