
package ejercicio.pkginterface;

public class EjercicioInterface {

    public static void main(String[] args) {
      
        Persona p=new Persona("tayron","jirafin",31454515); 
        
        p.setNombre("pepito");
        hacerCantar(p);
    }
    
    
    public static void hacerCantar(Cantante c){
        
        c.cantar();
        
        System.out.println(c.toString());
        
    }
}
