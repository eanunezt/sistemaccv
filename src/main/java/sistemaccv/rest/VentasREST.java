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
@Path("/ventas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VentasREST {
	@EJB
    private VentasServicio servicio;

	
	/**
	* retorna una lista con los Ventas que se encuentran en la base de datos
	* @return retorna una lista de Ventas
	* @generated
	*/
	@GET
	public List<Ventas> obtenerTodosVentass(){
		return servicio.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Ventas
	* @return Ventas del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public Ventas obtenerVentas(@PathParam("id") Long id){
		return servicio.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Ventas
	 * @param entity Ventas a guardar
	 * @return Ventas con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public Ventas guardarVentas(Ventas entity){
	    if(entity.getId()!=null){
	        servicio.actualizar(entity);
	        return entity;
	    }else{
	        return servicio.guardar(entity);
	    }
	}
	
	
	/**
	 * elimina el registro Ventas con el identificador dado
	 * @param id identificador del Ventas
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarVentas(@PathParam("id") Long id){
		servicio.borrar(id);
	}
	
	
}
