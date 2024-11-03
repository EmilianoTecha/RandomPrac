import Classes.*;

public class Main {
    public static void main(String[] args) {
    Fila fila = new Fila();

    System.out.println("Cantidad de personas en la fila: " + fila.tamano());
    int totalRecaudado = 0;
    while (!fila.estaVacia()) {
        Persona persona = fila.removerPersona();
        System.out.println("Atendiendo a persona con edad: " + persona.getEdad());
        int edad = persona.getEdad();
        if (edad >= 5 && edad <= 10) {
        totalRecaudado += 25;
        } else if (edad >= 11 && edad <= 17) {
        totalRecaudado += 30;
        } else if (edad >= 18) {
        totalRecaudado += 45;
        }
    }

    System.out.println("Cantidad total recaudada: " + totalRecaudado + " pesos");
    System.out.println("Faltan personas por atender: " + !fila.estaVacia());
    }
}
