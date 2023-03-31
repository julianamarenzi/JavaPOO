/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class ServicioCadena {
    
    Scanner leer = new Scanner(System.in);
    
    public void mostrarVocales(Cadena c1){
        
        int cont = 0;        
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equals("a") ||
                    c1.getFrase().substring(i, i + 1).equals("e") ||
                    c1.getFrase().substring(i, i + 1).equals("i") ||
                    c1.getFrase().substring(i, i + 1).equals("o") ||
                    c1.getFrase().substring(i, i + 1).equals("u")) {
                cont++;
            }
        }
        System.out.println("Cantidad de vocales: " + cont);
        
    }
    
    public void invertirFrase(Cadena c1){
        
        System.out.print("Palabra invertida: ");
        for (int i = c1.getLongitud(); i > 0; i--) {
            System.out.print(c1.getFrase().substring(i - 1, i));
        }
        System.out.println("");
        
    }
    
    public void vecesRepetido(Cadena c1){

        System.out.print("Ingrese una letra: ");
        String letra = leer.next();
        int cont = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equals(letra)) {
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("La letra no se encuentra en la palabra ingresada");
        } else {
            System.out.println("La letra " + letra + " se repite " + cont + " veces");
        }
        
    }
    
    public void compararLongitud(Cadena c1){
        
        System.out.print("Ingrese una nueva palabra: ");
        String palabra = leer.next();
        int diferencia;
        if (palabra.length() > c1.getLongitud()) {
            diferencia = palabra.length() - c1.getLongitud();
            System.out.println("La palabra '" + c1.getFrase() + "' tiene " + diferencia
            + " letras menos que '" + palabra + "'");
        } else if (palabra.length() < c1.getLongitud()){
            diferencia = c1.getLongitud() - palabra.length();
            System.out.println("La palabra '" + c1.getFrase() + "' tiene " + diferencia
            + " letras más que '" + palabra + "'");
        } else if (palabra.length() == c1.getLongitud()) {
            System.out.println("Ambas palabras tienen la misma cantidad de letras");
        }
        
    }
    
    public void unirFrases(Cadena c1){
        
        System.out.print("Ingrese una nueva palabra: ");
        String palabra = leer.next();
        System.out.print("Palabras unidas: ");
        System.out.println(c1.getFrase().concat(palabra));
        
    }
    
    public void reemplazar(Cadena c1){
        
        System.out.print("Ingrese un caracter: ");
        String carac = leer.next();
        System.out.print("Letra 'A' reemplazada por caracter " + carac + ": ");
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + 1).equals("a")) {
                System.out.print(carac);
            } else {
                System.out.print(c1.getFrase().substring(i, i + 1));
            }
        }
        System.out.println("");
        
    }
    
    //No funciona no se por que :(
    public void contiene(Cadena c1){
        
        System.out.print("Ingrese una letra: ");
        String letra = leer.next();
        boolean contiene = false;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().substring(i, i + i).equals(letra)) {
                contiene = true;
                break;
            }
        }
        System.out.println(contiene);
        
    }
    
}
