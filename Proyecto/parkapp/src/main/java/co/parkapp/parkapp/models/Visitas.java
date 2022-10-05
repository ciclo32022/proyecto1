/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.parkapp.parkapp.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author carmo
 */
@Entity
@Table(name = "visitas")
public class Visitas implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_visita")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVisita;
    @Id
    @Basic(optional = false)
    @Column(name = "id_propietario")
    private Integer idPropietario;
    @Basic(optional = false)
    @Column(name = "propietario")
    private String propietario;
    @Basic(optional = false)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @Column(name = "tipovehiculo")
    private String tipovehiculo;
    @Basic(optional = false)
    @Column(name = "horaentrada")
    private String horaentrada;
    @Basic(optional = false)
    @Column(name = "horasalida")
    private String horasalida;
    @Basic(optional = false)
    @Column(name = "valorpagado")
    private float valorpagado;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;

    public Visitas() {
    }

    public Visitas(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public Visitas(Integer idPropietario, int idVisita, String propietario, String placa, String tipovehiculo, String horaentrada, String horasalida, float valorpagado, String estado) {
        this.idPropietario = idPropietario;
        this.idVisita = idVisita;
        this.propietario = propietario;
        this.placa = placa;
        this.tipovehiculo = tipovehiculo;
        this.horaentrada = horaentrada;
        this.horasalida = horasalida;
        this.valorpagado = valorpagado;
        this.estado = estado;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public float getValorpagado() {
        return valorpagado;
    }

    public void setValorpagado(float valorpagado) {
        this.valorpagado = valorpagado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "co.parkapp.parkapp.models.Visitas[ idPropietario=" + idPropietario + " ]";
    }
    
}
