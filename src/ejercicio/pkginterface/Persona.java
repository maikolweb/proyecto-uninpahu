package ejercicio.pkginterface;

public class Persona implements Cantante{

    private String nombre;
    private String apellido;
    private int telefono;

    public Persona(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public void cantar() {
    
        System.out.println("cantar pio pio");
        
    }

    @Override
    public void gritar() {
        System.out.println("grito po que no se cantar");
    }

    @Override
    public String toString() {
        
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + '}';
    }

    
    
    
}
