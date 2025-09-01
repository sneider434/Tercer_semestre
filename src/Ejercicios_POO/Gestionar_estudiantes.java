import java.util.Scanner;

public class Gestionar_estudiantes {
    public static void main(String[] args) {
        Gestionar_estudiantes gE = new Gestionar_estudiantes();
        Scanner scanner = new Scanner(System.in);
        String [][] estudiantes = new String[3][7];
        int opt = -1;
        do{
            opt = gE.menu(scanner);
            switch (opt) {
                case 1 : 
                    gE.solicitarInformacion(scanner, estudiantes); break;
                case 5 :
                   
                    break;
                default:
                opt = -1;
                    
                  
            }
        }while ( opt != -1);
     }
    public void solicitarInformacion (Scanner sc , String [][] estudiantes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escriba el codigo del estudiante");
        int codigo = scanner.nextInt();
        System.out.println(" escriba el nombre del estudiante");
        String nombre = scanner.nextLine();
        System.out.println("escriba el programa del estudiante");
        String programa = scanner.nextLine();
        System.out.println(" escriba la nota uno del estudiante ");
        double n1 = scanner.nextDouble();
         System.out.println(" escriba la nota dos del estudiante ");
        double n2 = scanner.nextDouble();
         System.out.println(" escriba la nota tres del estudiante ");
        double n3 = scanner.nextDouble();
        System.out.println(" escriba la nota cuatro del estudiante ");
        double n4 = scanner.nextDouble();
        


        scanner.close(); 

    }
    public void imprimir (int codigo, String nombre , String programa , double n1, double n2 , double n3 , double n4){
        System.out.println("el codigo del estudiante es "+ codigo);
        System.out.println(" el nombre del estudiante es "+ nombre);
        System.out.println(" el programa del estudiante es "+ programa);
        System.out.println("la nota 1 del estudiante : " + nombre + " es : "+ n1);
        System.out.println("la nota 2 del estudiante : " + nombre + " es : "+ n2);
        System.out.println("la nota 3 del estudiante : " + nombre + " es : "+ n3);
        double def = (((n1+n2+n3)/3)*0.7) + (n4 * 0.3);
        System.out.println(" la definitiva del estudiante es : "+ def);
    }
    
    public void listar_Estudiantes(String[][] estudiantes){
        for(int f =0; f< estudiantes.length;f++){
            this.imprimir(Int.parseint(estudaintes[f][0])
            , estudiantes[f][1], estudaintes[f][2],
            estudiantes[f][3], estudiantes[f][4],
            estudiantes[f][5], estudiantes[f][6]);
        }
    }
    public int menu(Scanner sc) {
        int opt = 1;
        System.out.println("####### MENU PRINCIPAL #########");
        System.out.println("--------------------------------");
        System.out.println("#### Agregar estudiantes ####");
        System.out.println("#### Modificar estudiante ####");
        System.out.println("#### Eliminar estudiante ####");
        System.out.println("#### Consultar estudiante ####");
        System.out.println("#### Listar estudiante ####");
        System.out.println("#### Salir            Menu  ####");
        System.out.println("#################################");
        System.out.println("--------------------------------");
        return opt;
        


    }

}
