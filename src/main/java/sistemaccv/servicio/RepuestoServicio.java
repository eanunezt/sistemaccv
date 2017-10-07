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
public class RepuestoServicio {
	@EJB
    private RepuestoDAO dao;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* retorna una lista con los Repuesto que se encuentran en la base de datos
	* @return retorna una lista de Repuesto
	* @generated
	*/
	public List<Repuesto> obtenerTodos(){
		return dao.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Repuesto
	* @return Repuesto del id dado
	* @generated
	*/
	public Repuesto obtener(Long id){
		return dao.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Repuesto
	 * @param entity Repuesto a guardar
	 * @return Repuesto con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Repuesto guardar(Repuesto entity){
		return dao.guardar(entity);
	}
	
	
	/**
	 * Elimina el registro Repuesto con el identificador dado
	 * @param id identificador del Repuesto
	 * @generated 
	 */
	public void borrar(Long id){
		dao.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Repuesto
	 * @param entity Repuesto a guardar
	 * @return Repuesto con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(Repuesto entity){
		dao.actualizar(entity);
	}
	
	
}
