package demo.Service;

import demo.Model.Temporada;
import demo.Model.Liga;
import demo.Model.Equipo;
import demo.Repository.EquipoRepository;
import demo.Repository.LigaRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class TemporadaService {

    @Autowired
    private TemporadaRepository temporadaRepository;

    @Autowired
    private LigaRepository ligaRepository;

    @Autowired
    private EquipoRepository equipoRepository;


    public void testTemporada() {

        Temporada temporada1 = new Temporada();
        temporada1.setNombre("Temporada 12/13");
        temporadaRepository.save(temporada1);

        Temporada temporada2 = new Temporada();
        temporada2.setNombre("Temporada 13/14");
        temporadaRepository.save(temporada2);

        Temporada temporada3 = new Temporada();
        temporada3.setNombre("Temporada 14/15");
        temporadaRepository.save(temporada3);

        Temporada temporada4 = new Temporada();
        temporada4.setNombre("Temporada 15/16");
        temporadaRepository.save(temporada4);

        temporada1.getEquipos().add(equipoRepository.findByNombre("Real Madrid"));
        temporadaRepository.save(temporada1);

        temporada1.getEquipos().add(equipoRepository.findByNombre("Barça"));
        temporadaRepository.save(temporada1);

        temporada2.getEquipos().add(equipoRepository.findByNombre("Saski Baskonia"));
        temporadaRepository.save(temporada2);

        temporada3.getEquipos().add(equipoRepository.findByNombre("Club Joventut de Badalona"));
        temporadaRepository.save(temporada3);

        temporada4.getEquipos().add(equipoRepository.findByNombre("Herbalife Gran Canaria"));
        temporadaRepository.save(temporada4);
    }
}

