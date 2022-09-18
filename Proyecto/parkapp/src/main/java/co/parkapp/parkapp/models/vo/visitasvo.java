package co.parkapp.parkapp.models.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="visitas")
public class visitasvo {
    
    @Id
    private Integer id_propietario;
    private Integer id_visita;
    private String propietario;
    private String placa;
    private String tipovehiculo;
    private String horaentrada;
    private String horasalida;
    private Float valorpagado;
    private String estado;
    
    public Integer getId_visita() {
        return id_visita;
    }
    public void setId_visita(Integer id_visita) {
        this.id_visita = id_visita;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public String getTipovehiculo() {
        return tipovehiculo;
    }
    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }
    public String getHoraentrada() {
        return horaentrada;
    }
    public void setHoraentrada(String horaentrada) {
        this.horaentrada = horaentrada;
    }
    public String getHorasalida() {
        return horasalida;
    }
    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }
    public Float getValorpagado() {
        return valorpagado;
    }
    public void setValorpagado(Float valorpagado) {
        this.valorpagado = valorpagado;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Integer getId_propietario() {
        return id_propietario;
    }
    public void setId_propietario(Integer id_propietario) {
        this.id_propietario = id_propietario;
    }

    @Override
    public String toString() {
        return "visitas []";
    }
    
}
