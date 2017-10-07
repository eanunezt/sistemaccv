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
public class ImportacionDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Importacion> obtenerTodos(){
		return em.createNamedQuery("Importacion.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Importacion obtener(Long id){
		return em.find(Importacion.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Importacion guardar(Importacion entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Importacion.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Importacion entidad){
		em.merge(entidad);
	}
	
	
}
