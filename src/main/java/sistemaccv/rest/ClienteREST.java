package sistemaccv.rest;

import sistemaccv.modelo.entity.*;
import sistemaccv.servicio.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
  *  @author eanunezt
  *  @generated
  */
@Stateless
@Path("/cliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteREST {
	@EJB
    private ClienteServicio servicio;

	
	/**
	* retorna una lista con los Cliente que se encuentran en la base de datos
	* @return retorna una lista de Cliente
	* @generated
	*/
	@GET
	public List<Cliente> obtenerTodosClientes(){
		return servicio.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Cliente
	* @return Cliente del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public Cliente obtenerCliente(@PathParam("id") Long id){
		return servicio.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Cliente
	 * @param entity Cliente a guardar
	 * @return Cliente con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public Cliente guardarCliente(Cliente entity){
	    if(entity.getId()!=null){
	        servicio.actualizar(entity);
	        return entity;
	    }else{
	        return servicio.guardar(entity);
	    }
	}
	
	
	/**
	 * elimina el registro Cliente con el identificador dado
	 * @param id identificador del Cliente
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarCliente(@PathParam("id") Long id){
		servicio.borrar(id);
	}
	
	
}
