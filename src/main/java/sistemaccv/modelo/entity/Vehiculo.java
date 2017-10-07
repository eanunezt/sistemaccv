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
@Table(name="Vehiculo")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Vehiculo.obtenerTodos", query="select e from Vehiculo e")
})
public class Vehiculo {

	@Id
    //@Column(name = "Vehiculo_id")
    @GeneratedValue(generator = "VehiculoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "VehiculoGen", sequenceName = "Vehiculo_SEQ",allocationSize = 1)
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
    
    //@Column(name = "numMotor")
    private Integer numMotor;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "numChasis")
    private Integer numChasis;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "marca")
    private String marca;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "modelo")
    private String modelo;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "annio")
    private Integer annio;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "cilindraje")
    private Integer cilindraje;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "caja")
    private String caja;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "color")
    private String color;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "precio")
    private Long precio;
    
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
    public Integer getNumMotor() {
        return this.numMotor;
    }
    
    /**
    * @generated
    */
    public void setNumMotor(Integer numMotor) {
        this.numMotor = numMotor;
    }
    
    /**
    * @generated
    */
    public Integer getNumChasis() {
        return this.numChasis;
    }
    
    /**
    * @generated
    */
    public void setNumChasis(Integer numChasis) {
        this.numChasis = numChasis;
    }
    
    /**
    * @generated
    */
    public String getMarca() {
        return this.marca;
    }
    
    /**
    * @generated
    */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
    * @generated
    */
    public String getModelo() {
        return this.modelo;
    }
    
    /**
    * @generated
    */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
    * @generated
    */
    public Integer getAnnio() {
        return this.annio;
    }
    
    /**
    * @generated
    */
    public void setAnnio(Integer annio) {
        this.annio = annio;
    }
    
    /**
    * @generated
    */
    public Integer getCilindraje() {
        return this.cilindraje;
    }
    
    /**
    * @generated
    */
    public void setCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    /**
    * @generated
    */
    public String getCaja() {
        return this.caja;
    }
    
    /**
    * @generated
    */
    public void setCaja(String caja) {
        this.caja = caja;
    }
    
    /**
    * @generated
    */
    public String getColor() {
        return this.color;
    }
    
    /**
    * @generated
    */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
    * @generated
    */
    public Long getPrecio() {
        return this.precio;
    }
    
    /**
    * @generated
    */
    public void setPrecio(Long precio) {
        this.precio = precio;
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
