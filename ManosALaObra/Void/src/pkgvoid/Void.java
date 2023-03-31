/*
Crea un método void que reciba un objeto tipo persona como parámetro y utilice el get para
mostrar sus atributos. Llama ese método desde el main.
*/
package pkgvoid;

import Entidad.Persona;
import Servicio.ServicioPersona;

public class Void {

    public static void main(String[] args) {

        ServicioPersona ps = new ServicioPersona();
        Persona p1 = ps.crearPersona();
        
        
    }
    
}
