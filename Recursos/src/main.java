
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
       Recursos rec=new Recursos();
        System.out.println(rec.mostrarMensaje());
        System.out.println("");
          System.out.println(rec.nota());
          
       System.out.println("ingrese numero"); 
       int n1;
        n1 = entrada.nextInt();
       System.out.println("ingrese numero"); 
       int n2=entrada.nextInt();
       
        int division = rec.division(n1,n2);
        System.out.println("El resulado de la divion es:"+ rec.division(n1,n2));
        
             System.out.println("ingrese  numero"); 
       int n3;
        n3 = entrada.nextInt();
        System.out.println(" ");
        rec.numero(n3);
 
    }

    private static class recursos {

        public recursos() {
        }
    }
    
}
