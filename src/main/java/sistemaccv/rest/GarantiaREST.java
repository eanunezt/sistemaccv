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
@Path("/garantia")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GarantiaREST {
	@EJB
    private GarantiaServicio servicio;

	
	/**
	* retorna una lista con los Garantia que se encuentran en la base de datos
	* @return retorna una lista de Garantia
	* @generated
	*/
	@GET
	public List<Garantia> obtenerTodosGarantias(){
		return servicio.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Garantia
	* @return Garantia del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public Garantia obtenerGarantia(@PathParam("id") Long id){
		return servicio.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Garantia
	 * @param entity Garantia a guardar
	 * @return Garantia con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public Garantia guardarGarantia(Garantia entity){
	    if(entity.getId()!=null){
	        servicio.actualizar(entity);
	        return entity;
	    }else{
	        return servicio.guardar(entity);
	    }
	}
	
	
	/**
	 * elimina el registro Garantia con el identificador dado
	 * @param id identificador del Garantia
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarGarantia(@PathParam("id") Long id){
		servicio.borrar(id);
	}
	
	
}
