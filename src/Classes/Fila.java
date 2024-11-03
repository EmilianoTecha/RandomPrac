package Classes;
import java.util.ArrayList;
import java.util.Random;

public class Fila {
    private ArrayList<Persona> fila;
    private Random random;

    public Fila() {
        this.fila = new ArrayList<>();
        this.random = new Random();
        generarPersonas();
    }

    private void generarPersonas() {
        int numeroPersonas = random.nextInt(51); // Random number between 0 and 50
        for (int i = 0; i < numeroPersonas; i++) {
            int edad = random.nextInt(56) + 5; // Random age between 5 and 60
            fila.add(new Persona(edad));
        }
    }

    public void agregarPersona(Persona persona) {
        fila.add(persona);
    }

    public Persona removerPersona() {
        if (!fila.isEmpty()) {
            return fila.remove(0);
        }
        return null;
    }

    public boolean estaVacia() {
        return fila.isEmpty();
    }

    public int tamano() {
        return fila.size();
    }
}