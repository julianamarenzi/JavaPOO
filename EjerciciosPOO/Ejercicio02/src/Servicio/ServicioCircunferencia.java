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
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        
        Circunferencia c1 = new Circunferencia();
        
        System.out.print("Radio de una circunferencia: ");
        c1.setRadio(leer.nextDouble());
        
        return c1;
        
    }
    
    public double area(Circunferencia c1){
        
        double area = Math.PI * (c1.getRadio() * c1.getRadio());       
        return area;
        
    }
    
    public double perimetro(Circunferencia c1){
        
        double perimetro = 2 * Math.PI * c1.getRadio();
        return perimetro;
        
    }
    
}
