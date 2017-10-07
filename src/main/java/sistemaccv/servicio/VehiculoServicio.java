package sistemaccv.servicio;


import sistemaccv.dao.*;
import sistemaccv.modelo.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
  *  @generated
  *  @author eanunezt
  */
@Stateless
public class VehiculoServicio {
	@EJB
    private VehiculoDAO dao;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* retorna una lista con los Vehiculo que se encuentran en la base de datos
	* @return retorna una lista de Vehiculo
	* @generated
	*/
	public List<Vehiculo> obtenerTodos(){
		return dao.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Vehiculo
	* @return Vehiculo del id dado
	* @generated
	*/
	public Vehiculo obtener(Long id){
		return dao.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Vehiculo
	 * @param entity Vehiculo a guardar
	 * @return Vehiculo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Vehiculo guardar(Vehiculo entity){
		return dao.guardar(entity);
	}
	
	
	/**
	 * Elimina el registro Vehiculo con el identificador dado
	 * @param id identificador del Vehiculo
	 * @generated 
	 */
	public void borrar(Long id){
		dao.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Vehiculo
	 * @param entity Vehiculo a guardar
	 * @return Vehiculo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(Vehiculo entity){
		dao.actualizar(entity);
	}
	
	
}
