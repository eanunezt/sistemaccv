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
@Path("/vehiculo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VehiculoREST {
	@EJB
    private VehiculoServicio servicio;

	
	/**
	* retorna una lista con los Vehiculo que se encuentran en la base de datos
	* @return retorna una lista de Vehiculo
	* @generated
	*/
	@GET
	public List<Vehiculo> obtenerTodosVehiculos(){
		return servicio.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Vehiculo
	* @return Vehiculo del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public Vehiculo obtenerVehiculo(@PathParam("id") Long id){
		return servicio.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Vehiculo
	 * @param entity Vehiculo a guardar
	 * @return Vehiculo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public Vehiculo guardarVehiculo(Vehiculo entity){
	    if(entity.getId()!=null){
	        servicio.actualizar(entity);
	        return entity;
	    }else{
	        return servicio.guardar(entity);
	    }
	}
	
	
	/**
	 * elimina el registro Vehiculo con el identificador dado
	 * @param id identificador del Vehiculo
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarVehiculo(@PathParam("id") Long id){
		servicio.borrar(id);
	}
	
	
}
