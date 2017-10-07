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
public class ImportacionServicio {
	@EJB
    private ImportacionDAO dao;


	
	/**
	* retorna una lista con los Importacion que se encuentran en la base de datos
	* @return retorna una lista de Importacion
	* @generated
	*/
	public List<Importacion> obtenerTodos(){
		return dao.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Importacion
	* @return Importacion del id dado
	* @generated
	*/
	public Importacion obtener(Long id){
		return dao.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Importacion
	 * @param entity Importacion a guardar
	 * @return Importacion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Importacion guardar(Importacion entity){
		return dao.guardar(entity);
	}
	
	
	/**
	 * Elimina el registro Importacion con el identificador dado
	 * @param id identificador del Importacion
	 * @generated 
	 */
	public void borrar(Long id){
		dao.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Importacion
	 * @param entity Importacion a guardar
	 * @return Importacion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(Importacion entity){
		dao.actualizar(entity);
	}
	
	
}
