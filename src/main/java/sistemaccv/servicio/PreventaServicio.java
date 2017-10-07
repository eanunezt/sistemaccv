package sistemaccv.servicio;


import sistemaccv.dao.*;
import sistemaccv.modelo.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
  *  @generated
  *  @author eanunezt
  */
@Stateless
public class PreventaServicio {
	@EJB
    private PreventaDAO dao;


	
	/**
	* retorna una lista con los Preventa que se encuentran en la base de datos
	* @return retorna una lista de Preventa
	* @generated
	*/
	public List<Preventa> obtenerTodos(){
		return dao.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Preventa
	* @return Preventa del id dado
	* @generated
	*/
	public Preventa obtener(Long id){
		return dao.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Preventa
	 * @param entity Preventa a guardar
	 * @return Preventa con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Preventa guardar(Preventa entity){
		return dao.guardar(entity);
	}
	
	
	/**
	 * Elimina el registro Preventa con el identificador dado
	 * @param id identificador del Preventa
	 * @generated 
	 */
	public void borrar(Long id){
		dao.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Preventa
	 * @param entity Preventa a guardar
	 * @return Preventa con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(Preventa entity){
		dao.actualizar(entity);
	}
	
	
}
