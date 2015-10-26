package demo.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String nombre;

    Date fechaNacimiento;

    private int canastasTotales;

    private int asistenciasTotales;

    private int rebotesTotales;

    private String posicion;

    @ManyToOne
    private Equipo equipo;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getCanastasTotales() {
        return canastasTotales;
    }

    public int getAsistenciasTotales() {
        return asistenciasTotales;
    }

    public int getRebotesTotales() {
        return rebotesTotales;
    }

    public String getPosicion() {
        return posicion;
    }

    public Equipo getEquipo() { return equipo;}


    public void setEquipo(Equipo equipo) {this.equipo = equipo; }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setRebotesTotales(int rebotesTotales) {
        this.rebotesTotales = rebotesTotales;
    }

    public void setAsistenciasTotales(int asistenciasTotales) {
        this.asistenciasTotales = asistenciasTotales;
    }

    public void setCanastasTotales(int canastasTotales) {
        this.canastasTotales = canastasTotales;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", canastasTotales=" + canastasTotales +
                ", asistenciasTotales=" + asistenciasTotales +
                ", rebotesTotales=" + rebotesTotales +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}