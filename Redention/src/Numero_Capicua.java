import java.util.Scanner;

public class Numero_Capicua {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String entrada ;
        int numero ;
        System.out.println("Ingrese un numero entero"); // verificacion de si es un numero entero
        while (true) {
            entrada = scanner.nextLine();
            try{
                numero = Integer.parseInt(entrada);
                break;// si lo puede convertir a entero entonces rompe
            }catch(NumberFormatException e){
                System.out.println(" ERROR ");
                System.out.println("---------------------------------------");
                System.out.println("Ingreso No Valido");
                System.out.println("----------------------------------------");
                System.out.println("Intente De Nuevo");

            }
            
        }
        
        int longitud ;
        longitud = String.valueOf(Math.abs(numero)).length();

        int[] cantidad_entero = new int[longitud];
        for(int i=0;i<longitud;i++){
            
        }
        scanner.close();

    }
}
