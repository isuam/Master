
import herencia.Linea;
import herencia.circulo;
import herencia.cuadrado;
import herencia.formas;
import herencia.rectangulo;





public class Herencia {


  
    public static void main(String[] args) {
        
        cuadrado C= new cuadrado();
        circulo Circulo= new circulo();
        Linea linea= new Linea();
        rectangulo rectangulo= new rectangulo();
        formas Formas = new formas();
        
        System.out.println("formas1");
        C.imprimirinformacion();
        System.out.println("Su area es: "+C.Area());
        
        System.out.println("formas2");
        Circulo.imprimirinformacion();
        System.out.println("su radio es igual :"+Circulo.radio());
        
        System.out.println("formas3");
        linea.imprimirinformacion();
        System.out.println("Largo de la linea es: "+linea.Linea());
        
        
        System.out.println("formas4");
        rectangulo.imprimirinformacion();
       System.out.println("El area del rectangulo es: "+rectangulo.Area());
    
}
}