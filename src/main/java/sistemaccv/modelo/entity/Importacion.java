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
@Table(name="Importacion")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Importacion.obtenerTodos", query="select e from Importacion e")
})
public class Importacion {

	@Id
    //@Column(name = "Importacion_id")
    @GeneratedValue(generator = "ImportacionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ImportacionGen", sequenceName = "Importacion_SEQ",allocationSize = 1)
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
    
    //@Column(name = "idProveedor")
    private Integer idProveedor;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "idVehiculo")
    private Integer idVehiculo;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "cantidad")
    private Integer cantidad;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "fecha")
    private Integer fecha;
    
    
    
    /**
    * @generated
    */
    public Integer getIdProveedor() {
        return this.idProveedor;
    }
    
    /**
    * @generated
    */
    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    /**
    * @generated
    */
    public Integer getIdVehiculo() {
        return this.idVehiculo;
    }
    
    /**
    * @generated
    */
    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    
    /**
    * @generated
    */
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    /**
    * @generated
    */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
    * @generated
    */
    public Integer getFecha() {
        return this.fecha;
    }
    
    /**
    * @generated
    */
    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }
    
	
}
