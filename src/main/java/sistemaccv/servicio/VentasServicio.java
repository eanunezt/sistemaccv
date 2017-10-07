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
public class VentasServicio {
	@EJB
    private VentasDAO dao;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* retorna una lista con los Ventas que se encuentran en la base de datos
	* @return retorna una lista de Ventas
	* @generated
	*/
	public List<Ventas> obtenerTodos(){
		return dao.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Ventas
	* @return Ventas del id dado
	* @generated
	*/
	public Ventas obtener(Long id){
		return dao.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Ventas
	 * @param entity Ventas a guardar
	 * @return Ventas con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Ventas guardar(Ventas entity){
		return dao.guardar(entity);
	}
	
	
	/**
	 * Elimina el registro Ventas con el identificador dado
	 * @param id identificador del Ventas
	 * @generated 
	 */
	public void borrar(Long id){
		dao.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Ventas
	 * @param entity Ventas a guardar
	 * @return Ventas con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(Ventas entity){
		dao.actualizar(entity);
	}
	
	
}
