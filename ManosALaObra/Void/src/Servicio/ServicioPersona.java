/*
Crea un método void que reciba un objeto tipo persona como parámetro y utilice el get para
mostrar sus atributos. Llama ese método desde el main.
*/
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class ServicioPersona {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona p1 = new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        
        return p1;
        
    }
    
}
