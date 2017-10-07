package sistemaccv.modelo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import sistemaccv.modelo.*;
import javax.persistence.*;

/**
  *  @generated
  *  @author eanunezt
  */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="Empleado")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Empleado.obtenerTodos", query="select e from Empleado e")
})
public class Empleado {

	@Id
    //@Column(name = "Empleado_id")
    @GeneratedValue(generator = "EmpleadoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "EmpleadoGen", sequenceName = "Empleado_SEQ",allocationSize = 1)
	private Long id;

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id=id;
	}
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "nombresCompletos")
    private String nombresCompletos;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "direccion")
    private String direccion;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "ciudad")
    private String ciudad;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "telefono")
    private String telefono;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "correoElect")
    private String correoElect;
    
    
    
    /**
    * @generated
    */
    public String getNombresCompletos() {
        return this.nombresCompletos;
    }
    
    /**
    * @generated
    */
    public void setNombresCompletos(String nombresCompletos) {
        this.nombresCompletos = nombresCompletos;
    }
    
    /**
    * @generated
    */
    public String getDireccion() {
        return this.direccion;
    }
    
    /**
    * @generated
    */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /**
    * @generated
    */
    public String getCiudad() {
        return this.ciudad;
    }
    
    /**
    * @generated
    */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    /**
    * @generated
    */
    public String getTelefono() {
        return this.telefono;
    }
    
    /**
    * @generated
    */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
    * @generated
    */
    public String getCorreoElect() {
        return this.correoElect;
    }
    
    /**
    * @generated
    */
    public void setCorreoElect(String correoElect) {
        this.correoElect = correoElect;
    }
    
	
}
