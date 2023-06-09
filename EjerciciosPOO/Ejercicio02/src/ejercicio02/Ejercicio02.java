/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/
package ejercicio02;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;

public class Ejercicio02 {

    public static void main(String[] args) {

        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia c1 = sc.crearCircunferencia();
        
        System.out.println("Área: " + sc.area(c1));
        System.out.println("Perímetro: " + sc.perimetro(c1));
        
    }
    
}
