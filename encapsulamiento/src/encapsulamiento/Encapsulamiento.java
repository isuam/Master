
package encapsulamiento;


public class Encapsulamiento {


    public static void main(String[] args) {
     ciudadano clase1 = new ciudadano();
     
      clase1.setNombre("paola fajardo");
     System.out.println("el nombre del ciudadano es: "+clase1.getNombre());
     
     clase1.setEdad(23);
     System.out.println("la edad es: "+clase1.getedad());
     
     clase1.setExperiencia(7);
     System.out.println("su experiencia laboral es de: "+clase1.getExperiencia());
    }
    
}
