package demo.Service;

import demo.Model.Jugador;
import demo.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;

@Service
@Transactional
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;


    public void testJugador() {

        Calendar cal = Calendar.getInstance();


        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Xavi Pandis");
        cal.set(1994, Calendar.NOVEMBER, 24);
        Date fechaJugador1 = cal.getTime();
        jugador1.setFechaNacimiento(fechaJugador1);
        jugador1.setCanastasTotales(15);
        jugador1.setAsistenciasTotales(19);
        jugador1.setRebotesTotales(0);
        jugador1.setPosicion("Base");
        jugadorRepository.save(jugador1);


        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Carlos Menéndez");
        cal.set(1994, Calendar.AUGUST, 17);
        Date fechaJugador2 = cal.getTime();
        jugador2.setFechaNacimiento(fechaJugador2);
        jugador2.setCanastasTotales(24);
        jugador2.setAsistenciasTotales(8);
        jugador2.setRebotesTotales(6);
        jugador2.setPosicion("Escolta");
        jugadorRepository.save(jugador2);


        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Javi Bono");
        cal.set(1992, Calendar.AUGUST, 24);
        Date fechaJugador3 = cal.getTime();
        jugador3.setFechaNacimiento(fechaJugador3);
        jugador3.setCanastasTotales(27);
        jugador3.setAsistenciasTotales(13);
        jugador3.setRebotesTotales(18);
        jugador3.setPosicion("Pívot");
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Nil Panés");
        cal.set(1994, Calendar.FEBRUARY, 15);
        Date fechaJugador4 = cal.getTime();
        jugador4.setFechaNacimiento(fechaJugador4);
        jugador4.setCanastasTotales(17);
        jugador4.setAsistenciasTotales(14);
        jugador4.setRebotesTotales(4);
        jugador4.setPosicion("Alero");
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Edu Bena");
        cal.set(1992, Calendar.OCTOBER, 21);
        Date fechaJugador5 = cal.getTime();
        jugador5.setFechaNacimiento(fechaJugador5);
        jugador5.setCanastasTotales(21);
        jugador5.setAsistenciasTotales(16);
        jugador5.setRebotesTotales(14);
        jugador5.setPosicion("Ala-Pívot");
        jugadorRepository.save(jugador5);

        System.out.println(jugadorRepository.findByNombreContaining("Carlos"));
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqual(20));
        System.out.println(jugadorRepository.findByAsistenciasTotalesBetween(10, 20));
        System.out.println(jugadorRepository.findByPosicionContaining("Base"));

            cal.set(1993, Calendar.NOVEMBER, 24);
            Date fechaConsulta = cal.getTime();

        System.out.println(jugadorRepository.findByFechaNacimientoBefore(fechaConsulta));

            cal.set(1993, Calendar.NOVEMBER, 24);
            Date fechaConsulta2 = cal.getTime();

        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqualAndFechaNacimientoBefore(27, fechaConsulta2));

    }
}
