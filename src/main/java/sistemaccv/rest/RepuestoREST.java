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
@Path("/repuesto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RepuestoREST {
	@EJB
    private RepuestoServicio servicio;

	
	/**
	* retorna una lista con los Repuesto que se encuentran en la base de datos
	* @return retorna una lista de Repuesto
	* @generated
	*/
	@GET
	public List<Repuesto> obtenerTodosRepuestos(){
		return servicio.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Repuesto
	* @return Repuesto del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public Repuesto obtenerRepuesto(@PathParam("id") Long id){
		return servicio.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Repuesto
	 * @param entity Repuesto a guardar
	 * @return Repuesto con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public Repuesto guardarRepuesto(Repuesto entity){
	    if(entity.getId()!=null){
	        servicio.actualizar(entity);
	        return entity;
	    }else{
	        return servicio.guardar(entity);
	    }
	}
	
	
	/**
	 * elimina el registro Repuesto con el identificador dado
	 * @param id identificador del Repuesto
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarRepuesto(@PathParam("id") Long id){
		servicio.borrar(id);
	}
	
	
}
