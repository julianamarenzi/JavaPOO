/*
Volveremos a usar la clase Persona y vamos a crear objetos en tu Main utilizando los
constructores.
*/
package Entidad;

public class Persona {
    
    public String nombre;
    public int edad;
    public String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
}
