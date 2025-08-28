import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese la cantidad de dolares");
        int leer_dolar = scanner.nextInt();
        int tasa_de_conversion = 4050;
        int resultado = leer_dolar*tasa_de_conversion;
        System.out.println(" la tasa es de : " + resultado);


        scanner.close();

    }
}
