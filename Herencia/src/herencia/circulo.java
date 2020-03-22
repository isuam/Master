
package herencia;


public class circulo extends formas {
   
   double diametro=42;
    double radio;

    public circulo() {
        
        setDibujar("circulo");
        setColor("azul");
       
        
       
       

    }   
    public double radio(){
        radio = diametro/2;
        
        return radio;
    }


    
}
    
    
    

