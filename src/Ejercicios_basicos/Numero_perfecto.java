import java.util.Scanner;

public class Numero_perfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese un numero entero positivo");
        int numero = scanner.nextInt();
        int parte_entera = (int)Math.sqrt(numero);
        int[][] multiplos = new int[parte_entera][2];
        int i = 1;
        int x = 1;
        int posicion = 0 ;
        // este bucle encuentra los numeros que multipplicados den el numero ingresado 
        while (i <=  numero) {
            x=1;
            while (x<=numero) {
                if(i*x == numero && i<=x){
                    multiplos[posicion][0]= i;
                    multiplos[posicion][1] = x; 
                    posicion = posicion + 1;
                }
                x=x+1;
            }
            i=i+1;
        }
    
        int verificador_numero_perfecto = 0 ;

        for(int k =0;k<parte_entera;k++){
            for( int j = 0; j < 2;j++){
                if( multiplos[k][j]== numero){
                    multiplos[k][j]=0;
                }
                verificador_numero_perfecto += multiplos[k][j];
            }
        }
  
        if( verificador_numero_perfecto == numero){
            System.out.println("------------------------");
            System.out.println(" es un numero perfecto");
             System.out.println("-----------------------");
        }else {
             System.out.println("-------------------------");
            System.out.println(" no es un numero perfecto");
             System.out.println("-------------------------");
        }

        scanner.close();
    }
}
