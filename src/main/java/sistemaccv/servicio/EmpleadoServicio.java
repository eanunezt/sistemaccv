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
public class EmpleadoServicio {
	@EJB
    private EmpleadoDAO dao;


	
	/**
	* retorna una lista con los Empleado que se encuentran en la base de datos
	* @return retorna una lista de Empleado
	* @generated
	*/
	public List<Empleado> obtenerTodos(){
		return dao.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Empleado
	* @return Empleado del id dado
	* @generated
	*/
	public Empleado obtener(Long id){
		return dao.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Empleado
	 * @param entity Empleado a guardar
	 * @return Empleado con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Empleado guardar(Empleado entity){
		return dao.guardar(entity);
	}
	
	
	/**
	 * Elimina el registro Empleado con el identificador dado
	 * @param id identificador del Empleado
	 * @generated 
	 */
	public void borrar(Long id){
		dao.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Empleado
	 * @param entity Empleado a guardar
	 * @return Empleado con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(Empleado entity){
		dao.actualizar(entity);
	}
	
	
}
