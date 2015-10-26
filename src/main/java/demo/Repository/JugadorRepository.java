package demo.Repository;


import demo.Model.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long>{

    public List <Jugador> findByNombreContaining (String Nombre);
    public Jugador findByNombre (String Nombre);
    public List <Jugador> findByCanastasTotalesGreaterThanEqual (int CanastasTotales);
    public List <Jugador> findByAsistenciasTotalesBetween (int min, int max);
    public List <Jugador> findByPosicionContaining (String Posicion);
    public List <Jugador> findByFechaNacimientoBefore (Date FechaNacimiento);
    public List <Jugador> findByCanastasTotalesGreaterThanEqualAndFechaNacimientoBefore (int CanastasTotales, Date FechaNacimiento);
    public List <Jugador> findByEquipoNombre(String nombre);
    public List <Jugador> findByEquipoNombreAndPosicionIs(String nombre, String posicion);
    public Jugador findTopByOrderByCanastasTotalesDesc();
    public List <Jugador> findFirst5ByOrderByAsistenciasTotalesDesc();

    @Query("SELECT j FROM Jugador j where j.equipo.nombre = :equipoNombre order by j.canastasTotales desc ")
    List<Jugador> findJugadorOrderByCanastasTotalesFromEquipo(@Param("equipoNombre") String equipoNombre);

}
