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
public class GarantiaServicio {
	@EJB
    private GarantiaDAO dao;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* retorna una lista con los Garantia que se encuentran en la base de datos
	* @return retorna una lista de Garantia
	* @generated
	*/
	public List<Garantia> obtenerTodos(){
		return dao.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Garantia
	* @return Garantia del id dado
	* @generated
	*/
	public Garantia obtener(Long id){
		return dao.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Garantia
	 * @param entity Garantia a guardar
	 * @return Garantia con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Garantia guardar(Garantia entity){
		return dao.guardar(entity);
	}
	
	
	/**
	 * Elimina el registro Garantia con el identificador dado
	 * @param id identificador del Garantia
	 * @generated 
	 */
	public void borrar(Long id){
		dao.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Garantia
	 * @param entity Garantia a guardar
	 * @return Garantia con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(Garantia entity){
		dao.actualizar(entity);
	}
	
	
}
