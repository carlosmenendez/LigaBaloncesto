package demo.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Liga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    String nombre;

    @OneToMany(mappedBy = "liga")
    private Set<Temporada> temporadas = new HashSet<>();

    public Long getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
