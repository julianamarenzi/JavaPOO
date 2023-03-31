/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        
        Rectangulo r1 = new Rectangulo();
        
        System.out.println("Creación de un Rectángulo");
        System.out.print("Base: ");
        r1.setBase(leer.nextInt());
        System.out.print("Altura: ");
        r1.setAltura(leer.nextInt());
        
        return r1;
        
    }
    
    public int superficie(Rectangulo r1){
        
        int superficie = r1.getBase() * r1.getAltura();
        return superficie;
        
    }
    
    public int perimetro(Rectangulo r1){
        
        int perimetro = (r1.getBase() + r1.getAltura()) * 2;
        return perimetro;
        
    }
    
    public void dibujo(Rectangulo r1){
        
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if (i == 0 || i == r1.getAltura() - 1) {
                    System.out.print("* ");
                } else if (j == 0 || j == r1.getBase() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } 
            System.out.println("");
        }
       
    }
        
}
    
