/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
*/
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

public class ServicioPuntos {
    
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        
        Puntos p = new Puntos();
        
        System.out.println("Ingrese las coordenadas del primer punto");
        p.setX1(leer.nextInt());
        p.setY1(leer.nextInt());
        System.out.println("Ingrese las coordenadas del segundo punto");
        p.setX2(leer.nextInt());
        p.setY2(leer.nextInt());
        
        return p;
        
    }
    
    public void calcularDistancia(Puntos p){

        double distancia = Math.sqrt(Math.pow((p.getX2() - p.getX1()), 2) + Math.pow((p.getY2()-p.getY1()), 2));
        System.out.println("La distancia entre ambos puntos es de: " + distancia);
        
    }
    
}
