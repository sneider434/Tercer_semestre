package Ejercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        operaciones triangulo = new operaciones();
        System.out.println("Introduce la base del triangulo");
        triangulo.base= sc.nextInt();
        System.out.println("Introduce la altura del triangulo");
        triangulo.altura = sc.nextInt();

        // consola
        triangulo.operaciones();

    }
}

