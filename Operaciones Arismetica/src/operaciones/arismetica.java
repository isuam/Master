/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;



import java.util.Scanner;
public class arismetica {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        	int i  ;
		int j  ;
		int suma   = 0;
		int resta  = 0;
		int mult   = 0;
		int div    = 0;
		int modulo = 0;
    System.out.print("Ingrese el primer numero : ");
    i=teclado.nextInt();
    System.out.print("ingrese el segundo numero : ");
    j=teclado.nextInt();
                suma = i + j;
                resta = i - j; 
                mult = i * j; 
                div = i / j;
                modulo = i % j;
		System.out.print("Suma :");
		System.out.println(suma );
		System.out.print("Resta :");
		System.out.println(resta);
		System.out.print("Multiplicacion :");
		System.out.println(mult);
		System.out.print("Division :");
		System.out.println(div);
		System.out.print("Modulo :");
		System.out.println(modulo);
    }
    
}
