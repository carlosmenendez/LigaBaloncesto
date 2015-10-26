package demo.Service;

import demo.Model.Jugador;
import demo.Repository.EquipoRepository;
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

    @Autowired
    private EquipoRepository equipoRepository;


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

        Jugador jugador6 = new Jugador();
        jugador6.setNombre("Lander Sanahujes");
        cal.set(1994, Calendar.JULY, 25);
        Date fechaJugador6 = cal.getTime();
        jugador6.setFechaNacimiento(fechaJugador6);
        jugador6.setCanastasTotales(18);
        jugador6.setAsistenciasTotales(11);
        jugador6.setRebotesTotales(7);
        jugador6.setPosicion("Base");
        jugadorRepository.save(jugador6);

        Jugador jugador7 = new Jugador();
        jugador7.setNombre("Joel Parada");
        cal.set(1993, Calendar.NOVEMBER, 15);
        Date fechaJugador7 = cal.getTime();
        jugador7.setFechaNacimiento(fechaJugador7);
        jugador7.setCanastasTotales(25);
        jugador7.setAsistenciasTotales(16);
        jugador7.setRebotesTotales(10);
        jugador7.setPosicion("Pívot");
        jugadorRepository.save(jugador7);

        Jugador jugador8 = new Jugador();
        jugador8.setNombre("Xavi Vidal");
        cal.set(1995, Calendar.FEBRUARY, 8);
        Date fechaJugador8 = cal.getTime();
        jugador8.setFechaNacimiento(fechaJugador8);
        jugador8.setCanastasTotales(20);
        jugador8.setAsistenciasTotales(17);
        jugador8.setRebotesTotales(18);
        jugador8.setPosicion("Escolta");
        jugadorRepository.save(jugador8);

        Jugador jugador9 = new Jugador();
        jugador9.setNombre("Roger Sánchez");
        cal.set(1994, Calendar.DECEMBER, 15);
        Date fechaJugador9 = cal.getTime();
        jugador9.setFechaNacimiento(fechaJugador9);
        jugador9.setCanastasTotales(27);
        jugador9.setAsistenciasTotales(19);
        jugador9.setRebotesTotales(4);
        jugador9.setPosicion("Base");
        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador();
        jugador10.setNombre("Clepper Castillo");
        cal.set(1994, Calendar.OCTOBER, 21);
        Date fechaJugador10 = cal.getTime();
        jugador10.setFechaNacimiento(fechaJugador10);
        jugador10.setCanastasTotales(22);
        jugador10.setAsistenciasTotales(12);
        jugador10.setRebotesTotales(21);
        jugador10.setPosicion("Pívot");
        jugadorRepository.save(jugador10);

        Jugador jugador11 = new Jugador();
        jugador11.setNombre("Joel Visiana");
        cal.set(1994, Calendar.AUGUST, 2);
        Date fechaJugador11 = cal.getTime();
        jugador11.setFechaNacimiento(fechaJugador11);
        jugador11.setCanastasTotales(16);
        jugador11.setAsistenciasTotales(13);
        jugador11.setRebotesTotales(12);
        jugador11.setPosicion("Escolta");
        jugadorRepository.save(jugador11);

        Jugador jugador12 = new Jugador();
        jugador12.setNombre("Adrià Bonsoms");
        cal.set(1995, Calendar.AUGUST, 13);
        Date fechaJugador12 = cal.getTime();
        jugador12.setFechaNacimiento(fechaJugador12);
        jugador12.setCanastasTotales(24);
        jugador12.setAsistenciasTotales(17);
        jugador12.setRebotesTotales(11);
        jugador12.setPosicion("Base");
        jugadorRepository.save(jugador12);

        Jugador jugador13 = new Jugador();
        jugador13.setNombre("Manuel Ayuste");
        cal.set(1993, Calendar.SEPTEMBER, 30);
        Date fechaJugador13 = cal.getTime();
        jugador13.setFechaNacimiento(fechaJugador13);
        jugador13.setCanastasTotales(12);
        jugador13.setAsistenciasTotales(15);
        jugador13.setRebotesTotales(16);
        jugador13.setPosicion("Ala-Pívot");
        jugadorRepository.save(jugador13);

        Jugador jugador14 = new Jugador();
        jugador14.setNombre("Miquel Catalán");
        cal.set(1995, Calendar.OCTOBER, 21);
        Date fechaJugador14 = cal.getTime();
        jugador14.setFechaNacimiento(fechaJugador14);
        jugador14.setCanastasTotales(1);
        jugador14.setAsistenciasTotales(0);
        jugador14.setRebotesTotales(0);
        jugador14.setPosicion("Ala-Pívot");
        jugadorRepository.save(jugador14);

        Jugador jugador15 = new Jugador();
        jugador15.setNombre("Anne Marou");
        cal.set(1992, Calendar.OCTOBER, 21);
        Date fechaJugador15 = cal.getTime();
        jugador15.setFechaNacimiento(fechaJugador15);
        jugador15.setCanastasTotales(40);
        jugador15.setAsistenciasTotales(30);
        jugador15.setRebotesTotales(20);
        jugador15.setPosicion("Alero");
        jugadorRepository.save(jugador15);

        Jugador jugador16 = new Jugador();
        jugador16.setNombre("Guillem Martínez");
        cal.set(1994, Calendar.OCTOBER, 19);
        Date fechaJugador16 = cal.getTime();
        jugador16.setFechaNacimiento(fechaJugador16);
        jugador16.setCanastasTotales(22);
        jugador16.setAsistenciasTotales(17);
        jugador16.setRebotesTotales(15);
        jugador16.setPosicion("Pívot");
        jugadorRepository.save(jugador16);

        Jugador jugador17 = new Jugador();
        jugador17.setNombre("Joel Miralles");
        cal.set(1993, Calendar.NOVEMBER, 24);
        Date fechaJugador17 = cal.getTime();
        jugador17.setFechaNacimiento(fechaJugador17);
        jugador17.setCanastasTotales(20);
        jugador17.setAsistenciasTotales(11);
        jugador17.setRebotesTotales(9);
        jugador17.setPosicion("Alero");
        jugadorRepository.save(jugador17);

        Jugador jugador18 = new Jugador();
        jugador18.setNombre("Carles Vilarnau");
        cal.set(1986, Calendar.MARCH, 18);
        Date fechaJugador18 = cal.getTime();
        jugador18.setFechaNacimiento(fechaJugador18);
        jugador18.setCanastasTotales(23);
        jugador18.setAsistenciasTotales(12);
        jugador18.setRebotesTotales(28);
        jugador18.setPosicion("Pívot");
        jugadorRepository.save(jugador18);

        Jugador jugador19 = new Jugador();
        jugador19.setNombre("Marc Castro");
        cal.set(1994, Calendar.NOVEMBER, 221);
        Date fechaJugador19 = cal.getTime();
        jugador19.setFechaNacimiento(fechaJugador19);
        jugador19.setCanastasTotales(21);
        jugador19.setAsistenciasTotales(16);
        jugador19.setRebotesTotales(14);
        jugador19.setPosicion("Base");
        jugadorRepository.save(jugador19);

        Jugador jugador20 = new Jugador();
        jugador20.setNombre("Benito Camela");
        cal.set(1992, Calendar.OCTOBER, 21);
        Date fechaJugador20 = cal.getTime();
        jugador20.setFechaNacimiento(fechaJugador20);
        jugador20.setCanastasTotales(28);
        jugador20.setAsistenciasTotales(15);
        jugador20.setRebotesTotales(13);
        jugador20.setPosicion("Escolta");
        jugadorRepository.save(jugador20);

        Jugador jugador21 = new Jugador();
        jugador21.setNombre("Minabo Dekiev");
        cal.set(1994, Calendar.MAY, 4);
        Date fechaJugador21 = cal.getTime();
        jugador21.setFechaNacimiento(fechaJugador21);
        jugador21.setCanastasTotales(12);
        jugador21.setAsistenciasTotales(24);
        jugador21.setRebotesTotales(10);
        jugador21.setPosicion("Escolta");
        jugadorRepository.save(jugador21);

        Jugador jugador22 = new Jugador();
        jugador22.setNombre("Schalke Temeto");
        cal.set(1994, Calendar.APRIL, 16);
        Date fechaJugador22 = cal.getTime();
        jugador22.setFechaNacimiento(fechaJugador22);
        jugador22.setCanastasTotales(50);
        jugador22.setAsistenciasTotales(13);
        jugador22.setRebotesTotales(31);
        jugador22.setPosicion("Escolta");
        jugadorRepository.save(jugador22);

        Jugador jugador23 = new Jugador();
        jugador23.setNombre("Esfínter de Milán");
        cal.set(1992, Calendar.OCTOBER, 21);
        Date fechaJugador23 = cal.getTime();
        jugador23.setFechaNacimiento(fechaJugador23);
        jugador23.setCanastasTotales(23);
        jugador23.setAsistenciasTotales(18);
        jugador23.setRebotesTotales(12);
        jugador23.setPosicion("Ala-Pívot");
        jugadorRepository.save(jugador23);

        Jugador jugador24 = new Jugador();
        jugador24.setNombre("AC Frío");
        cal.set(1992, Calendar.OCTOBER, 21);
        Date fechaJugador24 = cal.getTime();
        jugador24.setFechaNacimiento(fechaJugador24);
        jugador24.setCanastasTotales(19);
        jugador24.setAsistenciasTotales(19);
        jugador24.setRebotesTotales(18);
        jugador24.setPosicion("Alero");
        jugadorRepository.save(jugador24);

        Jugador jugador25 = new Jugador();
        jugador25.setNombre("Paco Porras");
        cal.set(1990, Calendar.AUGUST, 23);
        Date fechaJugador25 = cal.getTime();
        jugador25.setFechaNacimiento(fechaJugador25);
        jugador25.setCanastasTotales(25);
        jugador25.setAsistenciasTotales(23);
        jugador25.setRebotesTotales(17);
        jugador25.setPosicion("Base");
        jugadorRepository.save(jugador25);

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
