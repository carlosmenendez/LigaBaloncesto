package demo.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String nombre;

    @ManyToOne
    private Liga liga;

    @ManyToMany
    private Set<Equipo> equipos=new HashSet<>();

    public Long getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
