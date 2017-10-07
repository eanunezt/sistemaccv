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
@Path("/preventa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PreventaREST {
	@EJB
    private PreventaServicio servicio;

	
	/**
	* retorna una lista con los Preventa que se encuentran en la base de datos
	* @return retorna una lista de Preventa
	* @generated
	*/
	@GET
	public List<Preventa> obtenerTodosPreventas(){
		return servicio.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Preventa
	* @return Preventa del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public Preventa obtenerPreventa(@PathParam("id") Long id){
		return servicio.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Preventa
	 * @param entity Preventa a guardar
	 * @return Preventa con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public Preventa guardarPreventa(Preventa entity){
	    if(entity.getId()!=null){
	        servicio.actualizar(entity);
	        return entity;
	    }else{
	        return servicio.guardar(entity);
	    }
	}
	
	
	/**
	 * elimina el registro Preventa con el identificador dado
	 * @param id identificador del Preventa
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarPreventa(@PathParam("id") Long id){
		servicio.borrar(id);
	}
	
	
}
