

public class Numero_Lychrel  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Ingrese un numero ");
        int numero_ingresado = scanner.nextInt();
        int numero_inverso =0;
        int numero_sumador =numero_ingresado;
        while(numero_sumador != numero_inverso){

            int numero_guardar = numero_sumador;
            numero_inverso= 0;
            while(numero_sumador>0){
                int digito  = numero_sumador % 10;
                numero_inverso = (numero_inverso * 10 ) + digito;
                numero_sumador = numero_sumador / 10 ; 
            }
            numero_sumador= numero_guardar;
            System.out.println(numero_guardar);
            if(numero_sumador==numero_inverso){
                System.out.println("---------------------------------------");
                System.out.println(" no es un numero de Lychrel");
                System.out.println("---------------------------------------");
                break;
            }else{
                 numero_sumador+=numero_inverso;
            }
            
        }

        scanner.close();
    }
}
