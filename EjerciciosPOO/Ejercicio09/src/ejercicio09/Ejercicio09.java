/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
package ejercicio09;

import Entidad.Matematica;
import Servicio.ServicioMatematica;

public class Ejercicio09 {

    public static void main(String[] args) {

        Matematica m = new Matematica();
        ServicioMatematica sm = new ServicioMatematica();
        
        m.setNum1((int)(Math.random() * 10));
        m.setNum2((int)(Math.random() * 10));
        System.out.println("Número 1: " + m.getNum1());
        System.out.println("Número 2: " + m.getNum2());
        
        sm.devolverMayor(m);
        sm.calcularPotencia(m);
        sm.calcularRaiz(m);
        
    }
    
}
