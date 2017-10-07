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
@Table(name="Cliente")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Cliente.obtenerTodos", query="select e from Cliente e")
})
public class Cliente {

	@Id
    //@Column(name = "Cliente_id")
    @GeneratedValue(generator = "ClienteGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ClienteGen", sequenceName = "Cliente_SEQ",allocationSize = 1)
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
    
    //@Column(name = "nombreCompleto")
    private String nombreCompleto;
    
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
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }
    
    /**
    * @generated
    */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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
