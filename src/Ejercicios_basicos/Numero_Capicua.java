import java.util.Scanner;

public class Numero_Capicua {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int entrada_numero = scanner.nextInt();// entrada del usuario
        int numero_original = entrada_numero;
        int numero_invertido = 0;
        while(entrada_numero>0){
            int digito = entrada_numero % 10;
            numero_invertido = (numero_invertido * 10 )+ digito;
            entrada_numero = entrada_numero / 10;
        }
        if( numero_invertido == numero_original){
            System.out.println(" es un numero capicua");
        }else {
            System.out.println(" no es un numero capicua");
        }
        
        scanner.close();
    }
}
