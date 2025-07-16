import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingrese un numero");
        System.out.println("------------------");
        System.out.println(" Que desee saber su factorial");
        int numero = scanner.nextInt();// numnero ingresado
        int nume_a = numero; // variable para guardar el numero original
        int nume_b  =0 ; // variable de cambio
        int nume_c = 0; // variable de cambio
        numero = numero - 1; // se resta 1 al numero ingresado ya que seran los multiplos hasta 1
        for(int i = numero;i>0;i--){ // va desde el numero menor al ingresado hasta 1 
            nume_b= nume_a * i ; // variable de multiplicacion 
            nume_c=  nume_b; // aqui se guarda el resultado de la multipliacion 
            nume_a= nume_c; // aqui se guarda de nuevo el resultado de la multiplicacion para usar en la variable de multiplicacion
        }
        System.out.println(" el factorial de : "+ ( numero +1) + " es : "+ nume_c);
        scanner.close();
    }
}