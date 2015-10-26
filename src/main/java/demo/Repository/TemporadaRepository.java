package demo.Repository;

import demo.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Carlos on 14/10/2015.
 */
public interface TemporadaRepository extends PagingAndSortingRepository<Temporada, Long> {

    public Temporada findByNombre (String nombre);

}
