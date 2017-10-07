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
@Path("/importacion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ImportacionREST {
	@EJB
    private ImportacionServicio servicio;

	
	/**
	* retorna una lista con los Importacion que se encuentran en la base de datos
	* @return retorna una lista de Importacion
	* @generated
	*/
	@GET
	public List<Importacion> obtenerTodosImportacions(){
		return servicio.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Importacion
	* @return Importacion del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public Importacion obtenerImportacion(@PathParam("id") Long id){
		return servicio.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Importacion
	 * @param entity Importacion a guardar
	 * @return Importacion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public Importacion guardarImportacion(Importacion entity){
	    if(entity.getId()!=null){
	        servicio.actualizar(entity);
	        return entity;
	    }else{
	        return servicio.guardar(entity);
	    }
	}
	
	
	/**
	 * elimina el registro Importacion con el identificador dado
	 * @param id identificador del Importacion
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarImportacion(@PathParam("id") Long id){
		servicio.borrar(id);
	}
	
	
}
