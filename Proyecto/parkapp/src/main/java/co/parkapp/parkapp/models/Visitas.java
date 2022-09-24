/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.parkapp.parkapp.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carmo
 */
@Entity
@Table(name = "visitas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visitas.findAll", query = "SELECT v FROM Visitas v"),
    @NamedQuery(name = "Visitas.findByIdVisita", query = "SELECT v FROM Visitas v WHERE v.idVisita = :idVisita"),
    @NamedQuery(name = "Visitas.findByIdPropietario", query = "SELECT v FROM Visitas v WHERE v.idPropietario = :idPropietario"),
    @NamedQuery(name = "Visitas.findByPropietario", query = "SELECT v FROM Visitas v WHERE v.propietario = :propietario"),
    @NamedQuery(name = "Visitas.findByPlaca", query = "SELECT v FROM Visitas v WHERE v.placa = :placa"),
    @NamedQuery(name = "Visitas.findByTipovehiculo", query = "SELECT v FROM Visitas v WHERE v.tipovehiculo = :tipovehiculo"),
    @NamedQuery(name = "Visitas.findByHoraentrada", query = "SELECT v FROM Visitas v WHERE v.horaentrada = :horaentrada"),
    @NamedQuery(name = "Visitas.findByHorasalida", query = "SELECT v FROM Visitas v WHERE v.horasalida = :horasalida"),
    @NamedQuery(name = "Visitas.findByValorpagado", query = "SELECT v FROM Visitas v WHERE v.valorpagado = :valorpagado"),
    @NamedQuery(name = "Visitas.findByEstado", query = "SELECT v FROM Visitas v WHERE v.estado = :estado")})
public class Visitas implements Serializable {

    private static final long serialVersionUID = 1L;
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
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaentrada;
    @Basic(optional = false)
    @Column(name = "horasalida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horasalida;
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

    public Visitas(Integer idPropietario, int idVisita, String propietario, String placa, String tipovehiculo, Date horaentrada, Date horasalida, float valorpagado, String estado) {
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

    public Date getHoraentrada() {
        return horaentrada;
    }

    public void setHoraentrada(Date horaentrada) {
        this.horaentrada = horaentrada;
    }

    public Date getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(Date horasalida) {
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
