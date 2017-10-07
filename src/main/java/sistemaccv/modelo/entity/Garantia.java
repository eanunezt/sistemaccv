package sistemaccv.modelo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import sistemaccv.modelo.*;
import java.util.Date;
import javax.persistence.*;

/**
  *  @generated
  *  @author eanunezt
  */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="Garantia")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Garantia.obtenerTodos", query="select e from Garantia e")
})
public class Garantia {

	@Id
    //@Column(name = "Garantia_id")
    @GeneratedValue(generator = "GarantiaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "GarantiaGen", sequenceName = "Garantia_SEQ",allocationSize = 1)
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
    
    //@Column(name = "idCliente")
    private Integer idCliente;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaVenta")
    private Date fechaVenta;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "motivoGarantia")
    private String motivoGarantia;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "solucionGarantia")
    private String solucionGarantia;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaGarantia")
    private Date fechaGarantia;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaSolucion")
    private Date fechaSolucion;
    
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
    
    //@Column(name = "estado")
    private String estado;
    
    
    
    /**
    * @generated
    */
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    /**
    * @generated
    */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    
    /**
    * @generated
    */
    public Date getFechaVenta() {
        return this.fechaVenta;
    }
    
    /**
    * @generated
    */
    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    /**
    * @generated
    */
    public String getMotivoGarantia() {
        return this.motivoGarantia;
    }
    
    /**
    * @generated
    */
    public void setMotivoGarantia(String motivoGarantia) {
        this.motivoGarantia = motivoGarantia;
    }
    
    /**
    * @generated
    */
    public String getSolucionGarantia() {
        return this.solucionGarantia;
    }
    
    /**
    * @generated
    */
    public void setSolucionGarantia(String solucionGarantia) {
        this.solucionGarantia = solucionGarantia;
    }
    
    /**
    * @generated
    */
    public Date getFechaGarantia() {
        return this.fechaGarantia;
    }
    
    /**
    * @generated
    */
    public void setFechaGarantia(Date fechaGarantia) {
        this.fechaGarantia = fechaGarantia;
    }
    
    /**
    * @generated
    */
    public Date getFechaSolucion() {
        return this.fechaSolucion;
    }
    
    /**
    * @generated
    */
    public void setFechaSolucion(Date fechaSolucion) {
        this.fechaSolucion = fechaSolucion;
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
    public String getEstado() {
        return this.estado;
    }
    
    /**
    * @generated
    */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
	
}
