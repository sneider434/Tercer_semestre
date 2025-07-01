import java.util.Scanner;

public class Numero_Capicua {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        System.out.println("Ingrese un numero entero");
        // verificacion de si es un numero entero
        do {
            numero= scanner.nextInt();
        } while (numero != 1 );
        

        scanner.close();

    }
}
