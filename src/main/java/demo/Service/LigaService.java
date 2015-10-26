package demo.Service;

import demo.Model.Temporada;
import demo.Model.Liga;
import demo.Model.Equipo;
import demo.Repository.LigaRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class LigaService {

    @Autowired
    private LigaRepository ligaRepository;

    @Autowired
    private TemporadaRepository temporadaRepository;


    public void testLiga() {

        Liga liga1 = new Liga();
        liga1.setNombre("Liga ACB");
        ligaRepository.save(liga1);

        Temporada temporada1 = temporadaRepository.findByNombre("Temporada 12/13");
        Temporada temporada2 = temporadaRepository.findByNombre("Temporada 13/14");
        Temporada temporada3 = temporadaRepository.findByNombre("Temporada 14/15");
        Temporada temporada4 = temporadaRepository.findByNombre("Temporada 15/16");

        temporada1.setLiga(liga1);
        temporada2.setLiga(liga1);
        temporada3.setLiga(liga1);
        temporada4.setLiga(liga1);

        temporadaRepository.save(temporada1);
        temporadaRepository.save(temporada2);
        temporadaRepository.save(temporada3);
        temporadaRepository.save(temporada4);
    }
}
