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
@Table(name="Proveedor")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Proveedor.obtenerTodos", query="select e from Proveedor e")
})
public class Proveedor {

	@Id
    //@Column(name = "Proveedor_id")
    @GeneratedValue(generator = "ProveedorGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ProveedorGen", sequenceName = "Proveedor_SEQ",allocationSize = 1)
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
    
    //@Column(name = "nombre")
    private String nombre;
    
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
    
    //@Column(name = "telefono")
    private String telefono;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "pais")
    private String pais;
    
    
    
    /**
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public String getPais() {
        return this.pais;
    }
    
    /**
    * @generated
    */
    public void setPais(String pais) {
        this.pais = pais;
    }
    
	
}
