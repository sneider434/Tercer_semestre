package Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Sneider";
        p1.edad = 25;

        Persona p2 = new Persona();
        p2.nombre = "Darwin";
        p2.edad = 35;

        // Presentaciones
        p1.presentarse();
        p2.presentarse();
    }
}
