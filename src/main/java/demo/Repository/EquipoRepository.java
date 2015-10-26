package demo.Repository;

import demo.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long>{

    public Equipo findByNombre(String nombre);
    public Equipo findByLocalidad(String localidad);

}
