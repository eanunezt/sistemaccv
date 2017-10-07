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
@Table(name="Preventa")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Preventa.obtenerTodos", query="select e from Preventa e")
})
public class Preventa {

	@Id
    //@Column(name = "Preventa_id")
    @GeneratedValue(generator = "PreventaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "PreventaGen", sequenceName = "Preventa_SEQ",allocationSize = 1)
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
    
    //@Column(name = "ideCliente")
    private Integer ideCliente;
    
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
    
    //@Column(name = "idEmpleado")
    private Integer idEmpleado;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "fechaCotizacion")
    private String fechaCotizacion;
    
    
    
    /**
    * @generated
    */
    public Integer getIdeCliente() {
        return this.ideCliente;
    }
    
    /**
    * @generated
    */
    public void setIdeCliente(Integer ideCliente) {
        this.ideCliente = ideCliente;
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
    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }
    
    /**
    * @generated
    */
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    /**
    * @generated
    */
    public String getFechaCotizacion() {
        return this.fechaCotizacion;
    }
    
    /**
    * @generated
    */
    public void setFechaCotizacion(String fechaCotizacion) {
        this.fechaCotizacion = fechaCotizacion;
    }
    
	
}
