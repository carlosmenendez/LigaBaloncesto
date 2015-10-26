package demo.Service;

import demo.Model.Equipo;
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
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private JugadorRepository jugadorRepository;


    public void testEquipo() {

        Calendar cal = Calendar.getInstance();

        Equipo equipo1 = new Equipo();
        equipo1.setNombre("Real Madrid");
        cal.set(1932, Calendar.MARCH, 22);
        Date fechaEquipo1 = cal.getTime();
        equipo1.setFechaFundacion(fechaEquipo1);
        equipo1.setLocalidad("Madrid");
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Barça");
        cal.set(1926, Calendar.AUGUST, 24);
        Date fechaEquipo2 = cal.getTime();
        equipo2.setFechaFundacion(fechaEquipo2);
        equipo2.setLocalidad("Barcelona");
        equipoRepository.save(equipo2);

        Equipo equipo3 = new Equipo();
        equipo3.setNombre("Saski Baskonia");
        cal.set(1959, Calendar.NOVEMBER, 28);
        Date fechaEquipo3 = cal.getTime();
        equipo3.setFechaFundacion(fechaEquipo3);
        equipo3.setLocalidad("Vitoria-Gasteiz");
        equipoRepository.save(equipo3);

        Equipo equipo4 = new Equipo();
        equipo4.setNombre("Club Joventut de Badalona");
        cal.set(1930, Calendar.FEBRUARY, 12);
        Date fechaEquipo4 = cal.getTime();
        equipo4.setFechaFundacion(fechaEquipo4);
        equipo4.setLocalidad("Badalona");
        equipoRepository.save(equipo4);

        Equipo equipo5 = new Equipo();
        equipo5.setNombre("Herbalife Gran Canaria");
        cal.set(1963, Calendar.JULY, 15);
        Date fechaEquipo5 = cal.getTime();
        equipo5.setFechaFundacion(fechaEquipo5);
        equipo5.setLocalidad("Las Palmas");
        equipoRepository.save(equipo5);

        Jugador jugador1 = jugadorRepository.findByNombre("Carlos Menendez");
        jugador1.setEquipo(equipo1);
        jugadorRepository.save(jugador1);

        Jugador jugador2 = jugadorRepository.findByNombre("Xavi Pandis");
        jugador2.setEquipo(equipo1);
        jugadorRepository.save(jugador2);

        Jugador jugador3 = jugadorRepository.findByNombre("Javi Bono");
        jugador3.setEquipo(equipo1);
        jugadorRepository.save(jugador3);

        Jugador jugador4 = jugadorRepository.findByNombre("Nil Panés");
        jugador4.setEquipo(equipo1);
        jugadorRepository.save(jugador4);

        Jugador jugador5 = jugadorRepository.findByNombre("Edu Bena");
        jugador5.setEquipo(equipo1);
        jugadorRepository.save(jugador5);

        Jugador jugador6 = jugadorRepository.findByNombre("Lander Sanahujes");
        jugador6.setEquipo(equipo2);
        jugadorRepository.save(jugador6);

        Jugador jugador7 = jugadorRepository.findByNombre("Joel Parada");
        jugador7.setEquipo(equipo2);
        jugadorRepository.save(jugador7);

        Jugador jugador8 = jugadorRepository.findByNombre("Xavi Vidal");
        jugador8.setEquipo(equipo2);
        jugadorRepository.save(jugador8);

        Jugador jugador9 = jugadorRepository.findByNombre("Roger Sánchez");
        jugador9.setEquipo(equipo2);
        jugadorRepository.save(jugador9);

        Jugador jugador10 = jugadorRepository.findByNombre("Clepper Castillo");
        jugador10.setEquipo(equipo2);
        jugadorRepository.save(jugador10);

        Jugador jugador11 = jugadorRepository.findByNombre("Joel Visiana");
        jugador11.setEquipo(equipo3);
        jugadorRepository.save(jugador11);

        Jugador jugador12 = jugadorRepository.findByNombre("Adrià Bonsoms");
        jugador12.setEquipo(equipo3);
        jugadorRepository.save(jugador12);

        Jugador jugador13 = jugadorRepository.findByNombre("Manuel Ayuste");
        jugador13.setEquipo(equipo3);
        jugadorRepository.save(jugador13);

        Jugador jugador14 = jugadorRepository.findByNombre("Miquel Catalán");
        jugador14.setEquipo(equipo3);
        jugadorRepository.save(jugador14);

        Jugador jugador15 = jugadorRepository.findByNombre("Anne Marou");
        jugador15.setEquipo(equipo3);
        jugadorRepository.save(jugador15);

        Jugador jugador16 = jugadorRepository.findByNombre("Guillem Martínez");
        jugador16.setEquipo(equipo4);
        jugadorRepository.save(jugador16);

        Jugador jugador17 = jugadorRepository.findByNombre("Joel Miralles");
        jugador17.setEquipo(equipo4);
        jugadorRepository.save(jugador17);

        Jugador jugador18 = jugadorRepository.findByNombre("Carles Vilarnau");
        jugador18.setEquipo(equipo4);
        jugadorRepository.save(jugador18);

        Jugador jugador19 = jugadorRepository.findByNombre("Marc Castro");
        jugador19.setEquipo(equipo4);
        jugadorRepository.save(jugador19);

        Jugador jugador20 = jugadorRepository.findByNombre("Benito Camela");
        jugador20.setEquipo(equipo4);
        jugadorRepository.save(jugador20);

        Jugador jugador21 = jugadorRepository.findByNombre("Minabo Dekiev");
        jugador21.setEquipo(equipo5);
        jugadorRepository.save(jugador21);

        Jugador jugador22 = jugadorRepository.findByNombre("Schalke Temeto");
        jugador22.setEquipo(equipo5);
        jugadorRepository.save(jugador22);

        Jugador jugador23 = jugadorRepository.findByNombre("Esfínter de Milán");
        jugador23.setEquipo(equipo5);
        jugadorRepository.save(jugador23);

        Jugador jugador24 = jugadorRepository.findByNombre("AC Frío");
        jugador24.setEquipo(equipo5);
        jugadorRepository.save(jugador24);

        Jugador jugador25 = jugadorRepository.findByNombre("Paco Porras");
        jugador25.setEquipo(equipo5);
        jugadorRepository.save(jugador25);

        System.out.println("Equipo de Barcelona" + equipoRepository.findByLocalidad("Barcelona"));
        System.out.println("Jugadores Real Madrid" + jugadorRepository.findByEquipoNombre("Real Madrid"));
        System.out.println("Jugadores Barça Bases" +jugadorRepository.findByEquipoNombreAndPosicionIs("Barça", "Base"));
        System.out.println("Máximo anotador" +jugadorRepository.findTopByOrderByCanastasTotalesDesc());
        System.out.println("5 maximos asistentes" +jugadorRepository.findFirst5ByOrderByAsistenciasTotalesDesc());
        System.out.println("Máximo anotador de un equipo" +jugadorRepository.findJugadorOrderByCanastasTotalesFromEquipo("Herbalife Gran Canaria").get(0));

    }
}
