package co.parkapp.parkapp.models.vo;

public class visitasvo {
    
    private String placa;
    private Integer id_propietario;
    private String propietario;
    private String tipovehiculo;
    private String horaentrada;
    private String horasalidad;
    private Float valorpagado;
    private String estado;
    
    
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
    public String getHorasalidad() {
        return horasalidad;
    }
    public void setHorasalidad(String horasalidad) {
        this.horasalidad = horasalidad;
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
