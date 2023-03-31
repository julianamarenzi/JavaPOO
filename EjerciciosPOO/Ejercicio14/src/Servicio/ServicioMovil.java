/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
*/
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

public class ServicioMovil {
    
    Scanner leer = new Scanner(System.in);
    
    public Movil cargarCelular(){
        
        Movil m = new Movil();
        
        System.out.println("----Celular----");
        System.out.print("Marca: ");
        m.setMarca(leer.next());
        System.out.print("Precio: $");
        m.setPrecio(leer.nextInt());
        System.out.print("Modelo: ");
        m.setModelo(leer.nextInt());
        System.out.print("Memoria Ram: ");
        m.setRam(leer.nextInt());
        System.out.print("Almacenamiento: ");
        m.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingrese el código de producto: ");
        int [] codigo = new int [7];
        ingresarCodigo(codigo);        
        System.out.print("Código de producto: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(codigo[i]);
        }      
        System.out.println("");
        
        return m;
        
    }
    
    public void ingresarCodigo(int [] codigo){

        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = leer.nextInt();
        }
        
    }
    
}
