import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private int numeroJugadores;
    private ArrayList<Jugador> listaJugadores;

    // Constructor por defecto
    public Equipo() {
        nombreEquipo = "";
        numeroJugadores = 0;
        listaJugadores = new ArrayList<>();
    }

    // Constructor sobrecargado
    public Equipo(String nombre, int numJugadores, ArrayList<Jugador> jugadores) {
        if (numJugadores >= 5 && numJugadores <= 15) {
            nombreEquipo = nombre;
            numeroJugadores = numJugadores;
            listaJugadores = jugadores;
        } else {
            System.out.println("El número de jugadores debe estar entre 5 y 15. Se utilizarán valores por defecto.");
            nombreEquipo = "";
            numeroJugadores = 0;
            listaJugadores = new ArrayList<>();
        }
    }

    // Métodos set

    public void setNombreEquipo(String nombre) {
        if (nombre.length() <= 20) {
            nombreEquipo = nombre;
        } else {
            System.out.println("El nombre del equipo no puede tener más de 20 caracteres.");
        }
    }

    public void setNumeroJugadores(int numJugadores) {
        if (numJugadores >= 5 && numJugadores <= 15) {
            numeroJugadores = numJugadores;
        } else {
            System.out.println("El número de jugadores debe estar entre 5 y 15.");
        }
    }

    public void setListaJugadores(ArrayList<Jugador> jugadores) {
        // Agregar validaciones aquí
    }

    public void setNuevoJugador(Jugador jugador) {
        // Agregar validaciones aquí
    }

    // Observadores

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public Jugador getJugador(int indice) {
        // Implementar este método
    }

    public Jugador getJugador(String nombreJugador) {
        // Implementar este método
    }

    public Jugador getJugador(int numeroCamiseta) {
        // Implementar este método
    }

    // Función de lectura o escritura

    @Override
    public String toString() {
        // Implementar este método para mostrar los datos del equipo y sus jugadores
    }

    

}
