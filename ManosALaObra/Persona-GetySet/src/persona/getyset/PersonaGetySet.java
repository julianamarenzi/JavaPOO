/*
Continuaremos con nuestra clase Persona y vamos a primero crear los getter y setter y después
invocarlos desde el Main con alguno de los objetos que instanciaste.
*/
package persona.getyset;

import Entidad.Persona;

public class PersonaGetySet {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona("Marcos", 20, "Masculino");
        
        p1.setNombre("Carlos");
        p2.getNombre();
        
    }
    
}
