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
public class ClienteServicio {
	@EJB
    private ClienteDAO dao;


	
	/**
	* retorna una lista con los Cliente que se encuentran en la base de datos
	* @return retorna una lista de Cliente
	* @generated
	*/
	public List<Cliente> obtenerTodos(){
		return dao.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Cliente
	* @return Cliente del id dado
	* @generated
	*/
	public Cliente obtener(Long id){
		return dao.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Cliente
	 * @param entity Cliente a guardar
	 * @return Cliente con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Cliente guardar(Cliente entity){
		return dao.guardar(entity);
	}
	
	
	/**
	 * Elimina el registro Cliente con el identificador dado
	 * @param id identificador del Cliente
	 * @generated 
	 */
	public void borrar(Long id){
		dao.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Cliente
	 * @param entity Cliente a guardar
	 * @return Cliente con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(Cliente entity){
		dao.actualizar(entity);
	}
	
	
}
