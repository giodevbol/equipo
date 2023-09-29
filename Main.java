import java.util.ArrayList;

public public class Main {
    public static void main(String[] args) {
        // Crear jugadores
        Jugador jugador1 = new Jugador("Nombre1", "Apellido1", 25, 1, "Base");
        Jugador jugador2 = new Jugador("Nombre2", "Apellido2", 28, 2, "Escolta");
        Jugador jugador3 = new Jugador("Nombre3", "Apellido3", 23, 3, "Alero");
        Jugador jugador4 = new Jugador("Nombre4", "Apellido4", 27, 4, "Ala-Pivot");
        Jugador jugador5 = new Jugador("Nombre5", "Apellido5", 29, 5, "Pivot");

        // Crear equipo Lakers con constructor por defecto
        Equipo lakers = new Equipo();
        lakers.setNombreEquipo("Los Lakers");
        ArrayList<Jugador> jugadoresLakers = new ArrayList<>();
        jugadoresLakers.add(jugador1);
        jugadoresLakers.add(jugador2);
        jugadoresLakers.add(jugador3);
        jugadoresLakers.add(jugador4);
        jugadoresLakers.add(jugador5);
        lakers.setListaJugadores(jugadoresLakers);

        // Mostrar información del jugador número 2
        Jugador jugadorNumero2 = lakers.getJugador(1);
        if (jugadorNumero2 != null) {
            System.out.println("Información del jugador número 2 de Lakers:");
            System.out.println(jugadorNumero2);
        }

        // Agregar un nuevo jugador a los Lakers
        Jugador nuevoJugadorLakers = new Jugador("Nombre6", "Apellido6", 30, 6, "Base");
        lakers.setNuevoJugador(nuevoJugadorLakers);

        // Crear equipo Bulls con constructor sobrecargado
        ArrayList<Jugador> jugadoresBulls = new ArrayList<>();
        jugadoresBulls.add(jugador1);
        jugadoresBulls.add(jugador2);
        jugadoresBulls.add(jugador3);
        jugadoresBulls.add(jugador4);
        jugadoresBulls.add(jugador5);
        Jugador nuevoJugadorBulls = new Jugador("Nombre7", "Apellido7", 26, 7, "Pivot");
        jugadoresBulls.add(nuevoJugadorBulls);
        Equipo bulls = new Equipo("Chicago Bulls", 6, jugadoresBulls);

        // Mostrar información de los equipos
        System.out.println("\nInformación de Los Lakers:");
        System.out.println(lakers);
        System.out.println("\nInformación de Chicago Bulls:");
        System.out.println(bulls);
    }

    
}
