
package herencia;


public class rectangulo extends formas {
    
     int base=30;
     int altura=2;
     int area;

    public rectangulo() {
       setDibujar("rectangulo");
      setColor("morado");
       
    }

   
    public int Area()
    {
        area=base*altura/2;
        
    return area;
       
    }
     
    
}
