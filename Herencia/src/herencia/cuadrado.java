
package herencia;

public class cuadrado extends formas{
  double lado=10;
  double res1;  
  
    public cuadrado()
    {
      setDibujar("cuadrado");
      setColor("rojo");
    }
    public double Area()
    {
       res1= lado*lado;
    return res1;
    }

  
    }

