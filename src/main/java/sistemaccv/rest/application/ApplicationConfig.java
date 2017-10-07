
package sistemaccv.rest.application;

import java.util.Set;
import javax.ws.rs.core.Application;
import sistemaccv.rest.*;

/**
 * Esta clase registra la informacion de las clases que van a ser utilizadas como servicios REST
 * @author eanunezt
 */
@javax.ws.rs.ApplicationPath("/rest")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(ImportacionREST.class);resources.add(VehiculoREST.class);resources.add(ProveedorREST.class);resources.add(VentasREST.class);resources.add(PreventaREST.class);resources.add(ClienteREST.class);resources.add(RepuestoREST.class);resources.add(EmpleadoREST.class);resources.add(GarantiaREST.class);
    }
    
}

