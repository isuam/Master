
package encapsulamiento;

class ciudadano {
    
    private int edad;
    private String nombre;
    private int experiencia;
    
    
    public void setEdad(int edad){
        this.edad = edad;
        
    }
    public int getedad(){
        return edad;
    }
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

}