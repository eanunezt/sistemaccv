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
@Table(name="Repuesto")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Repuesto.obtenerTodos", query="select e from Repuesto e")
})
public class Repuesto {

	@Id
    //@Column(name = "Repuesto_id")
    @GeneratedValue(generator = "RepuestoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "RepuestoGen", sequenceName = "Repuesto_SEQ",allocationSize = 1)
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
    
    //@Column(name = "descripcion")
    private String descripcion;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "valor")
    private Long valor;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaIngreso")
    private Date fechaIngreso;
    
    
    
    /**
    * @generated
    */
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
    * @generated
    */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
    * @generated
    */
    public Long getValor() {
        return this.valor;
    }
    
    /**
    * @generated
    */
    public void setValor(Long valor) {
        this.valor = valor;
    }
    
    /**
    * @generated
    */
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    /**
    * @generated
    */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
	
}
