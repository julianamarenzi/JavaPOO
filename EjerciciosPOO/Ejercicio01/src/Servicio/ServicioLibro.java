/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

public class ServicioLibro {
    
    Scanner leer = new Scanner(System.in);
    
    public Libro crearLibro(){
        
        Libro l1 = new Libro();
        
        System.out.print("ISBN: ");
        l1.setISBN(leer.nextInt());
        System.out.print("Título del libro: ");
        l1.setTitulo(leer.next());
        System.out.print("Autor del libro: ");
        l1.setAutor(leer.next());
        System.out.print("Número de páginas: ");
        l1.setNumPaginas(leer.nextInt());
        
        return l1;
        
    }
    
}
