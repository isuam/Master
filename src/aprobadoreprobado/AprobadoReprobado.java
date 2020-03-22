/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprobadoreprobado;

import java.util.Scanner;

/**
 *
 * @author CLARISSA FLORES
 */
public class AprobadoReprobado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
        	 int nota; 
		 String nombre;
                 
    
    System.out.print("ingrese el Nombre del Alumno : ");
    nombre = teclado.nextLine(); 
    
    System.out.print("Ingrese Nota del Alumno : ");
    nota = teclado.nextInt();
         
 
   
     if (nota < 70)
     {
         System.out.println(" Su Nombre es: " + nombre + " Su Nota es: "+ nota + " = Reprobado");
     } else {
         System.out.println(" Su Nombre es: " + nombre + " Su Nota es: "+ nota + " = AprobNado");
     }
    }
    
}
