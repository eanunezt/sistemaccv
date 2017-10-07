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
@Table(name="Ventas")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Ventas.obtenerTodos", query="select e from Ventas e")
})
public class Ventas {

	@Id
    //@Column(name = "Ventas_id")
    @GeneratedValue(generator = "VentasGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "VentasGen", sequenceName = "Ventas_SEQ",allocationSize = 1)
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
    
    //@Column(name = "idArticulo")
    private Integer idArticulo;
    
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
    
    //@Column(name = "idEmpleado")
    private Integer idEmpleado;
    
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
    
    //@Column(name = "valorVenta")
    private Long valorVenta;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "cantidad")
    private Integer cantidad;
    
    
    
    /**
    * @generated
    */
    public Integer getIdArticulo() {
        return this.idArticulo;
    }
    
    /**
    * @generated
    */
    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }
    
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
    public Long getValorVenta() {
        return this.valorVenta;
    }
    
    /**
    * @generated
    */
    public void setValorVenta(Long valorVenta) {
        this.valorVenta = valorVenta;
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
    
	
}
