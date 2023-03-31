/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {
    
    Scanner leer = new Scanner(System.in);
    
    public Cafetera agregarCafe(){
        
        Cafetera c1 = new Cafetera();
        System.out.println("Ingrese la cantidad de café para llenar la cafetera");
        c1.setCantidadActual(leer.nextInt());
        return c1;
        
    }
    
    public int llenarCafetera(Cafetera c1){
        
        c1.setCapacidadMax(c1.getCantidadActual());
        return c1.getCantidadActual();
        
    }
    
    public int servirTaza(Cafetera c1){
        
        int taza;
        System.out.println("Ingrese el tamaño de la taza vacía");
        taza = leer.nextInt();
        System.out.println("Sirviendo café...");
        if (taza < c1.getCantidadActual()) {
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("La taza está completamente servida.");
        } else if (taza > c1.getCantidadActual()){
            System.out.println("Taza tiene: " + c1.getCantidadActual() + " café");
        }
        return c1.getCantidadActual();
        
    }
    
    public void vaciarCafetera(Cafetera c1){
        c1.setCantidadActual(0);
    }
    
    
}
