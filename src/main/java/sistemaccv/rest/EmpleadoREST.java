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
@Path("/empleado")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmpleadoREST {
	@EJB
    private EmpleadoServicio servicio;

	
	/**
	* retorna una lista con los Empleado que se encuentran en la base de datos
	* @return retorna una lista de Empleado
	* @generated
	*/
	@GET
	public List<Empleado> obtenerTodosEmpleados(){
		return servicio.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Empleado
	* @return Empleado del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public Empleado obtenerEmpleado(@PathParam("id") Long id){
		return servicio.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Empleado
	 * @param entity Empleado a guardar
	 * @return Empleado con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public Empleado guardarEmpleado(Empleado entity){
	    if(entity.getId()!=null){
	        servicio.actualizar(entity);
	        return entity;
	    }else{
	        return servicio.guardar(entity);
	    }
	}
	
	
	/**
	 * elimina el registro Empleado con el identificador dado
	 * @param id identificador del Empleado
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarEmpleado(@PathParam("id") Long id){
		servicio.borrar(id);
	}
	
	
}
