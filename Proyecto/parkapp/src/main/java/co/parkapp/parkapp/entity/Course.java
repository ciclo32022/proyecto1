package co.parkapp.parkapp.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String nombre;

    public Course() {
    }

    public Course(long id, String nombre) {
        Id = id;
        this.nombre = nombre;
    }
    
    @ManyToMany(mappedBy = "courses",fetch = FetchType.LAZY)
    private Set<Visitantes> visitantes=new HashSet<>();

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Visitantes> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(Set<Visitantes> visitantes) {
        this.visitantes = visitantes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.Id);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Course [Id=" + Id + ", nombre=" + nombre + ", visitantes=" + visitantes + "]";
    }
    
}
