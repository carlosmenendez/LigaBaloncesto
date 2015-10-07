package demo.Repository;


import demo.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long>{

    public List <Jugador> findByNombreContaining (String Nombre);
    public List <Jugador> findByCanastasTotalesGreaterThanEqual (int CanastasTotales);
    public List <Jugador> findByAsistenciasTotalesBetween (int min, int max);
    public List <Jugador> findByPosicionContaining (String Posicion);
    public List <Jugador> findByFechaNacimientoBefore (Date FechaNacimiento);
    public List <Jugador> findByCanastasTotalesGreaterThanEqualAndFechaNacimientoBefore (int CanastasTotales, Date FechaNacimiento);

}
