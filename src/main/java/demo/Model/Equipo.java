package demo.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String nombre;

    Date fechaFundacion;

    private String localidad;

    @ManyToMany(mappedBy = "equipos")
    private Set<Temporada> temporadas = new HashSet<>();

    @OneToMany(mappedBy = "equipo")
    private Set<Jugador> jugadores = new HashSet<>();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public String getLocalidad() {
        return localidad;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}

