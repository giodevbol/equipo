import org.junit.Test;
import static org.junit.Assert.*;

public class EquipoTest {

    @Test
    public void testSetNombreEquipo() {
        Equipo equipo = new Equipo();
        equipo.setNombreEquipo("Los Lakers");
        assertEquals("Los Lakers", equipo.getNombreEquipo());
    }

    @Test
    public void testSetNumeroJugadores() {
        Equipo equipo = new Equipo();
        equipo.setNumeroJugadores(10);
        assertEquals(10, equipo.getNumeroJugadores());
    }

    @Test
    public void testSetNuevoJugador() {
        Equipo equipo = new Equipo();
        Jugador jugador1 = new Jugador("Nombre1", "Apellido1", 25, 1, "Base");
        assertTrue(equipo.setNuevoJugador(jugador1));
    }
    
    // Agrega más pruebas aquí para otros métodos
}
