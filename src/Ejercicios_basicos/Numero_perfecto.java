import java.util.Scanner;

public class Numero_perfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese un numero entero positivo");
        int numero = scanner.nextInt();
        int parte_entera = (int)Math.sqrt(numero);// esta variable es para saber la cantidad de posibles multiplos del numero x
        int[][] multiplos = new int[parte_entera][2]; // arreglo para almacenar los numeros que multiplicados son el numero x
        int i = 1;
        int x = 1;
        int posicion = 0 ; // variable bandera para almecenar el arreglo 
        // este bucle encuentra los numeros que multipplicados den el numero ingresado 
        while (i <=  numero) {
            x=1;
            while (x<=numero) {
                if(i*x == numero && i<=x){ // aqui se veifica si el numero es igual al numero x y verifica que no se repitan numeros
                    multiplos[posicion][0]= i;
                    multiplos[posicion][1] = x; 
                    posicion = posicion + 1;
                }
                x=x+1;
            }
            i=i+1;
        }
    
        int verificador_numero_perfecto = 0 ; // variable de suma para saber si es numero perfecto

        for(int k =0;k<parte_entera;k++){
            for( int j = 0; j < 2;j++){
                if( multiplos[k][j]== numero){ // este if elimina de los numeros eliminados es el numero x ya que este no es valido
                    multiplos[k][j]=0;
                }
                verificador_numero_perfecto += multiplos[k][j];// sumador de los numeros almacenados
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
