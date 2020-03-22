/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CLARISSA FLORES
 */
public class Recursos {
      
String msj="";
    String nota="";
    int num1=0,num2=0;
    
    
 public String mostrarMensaje()
 {
     String msj="Estoy Aprendiendo,Pero sere el mejor Programador del mundo";
     return msj ;
 }
 
    public String nota()
    {
       int n=80;
       String msj = "";
       if(n>=70)
       {
msj="Aprobado";
       }else if(n<70)
       {
msj="Reprobado";
       }
        return msj;
    }
    
 public int division(int nota1,int nota2)        
 {
     int division=0;
     
     if(nota1>0 && nota2>0)
     {
         division=nota1/nota2;
     }else if(nota1==0 || nota2==0){
         System.out.println("Los Datos No Son validos");
     }
   return division;  
 }
 
 
 public int numero(int mum)
 {
     int k=1;
 
 for(k=1;k<= 1;k++)
 {
     System.out.println(k);
 
 }
return k ;    
}
 
 
}