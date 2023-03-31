/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
*/
package ejercicio07;

import Entidad.Persona;
import Servicio.ServicioPersona;

public class Ejercicio07 {

    public static void main(String[] args) {

        double [] vectorIMC = new double [4];
        boolean [] vectorEdad = new boolean [4];
        int pesoIdeal = 0, bajoPeso = 0, sobrePeso = 0;
        int mayor = 0, menor = 0;
        
        ServicioPersona sp = new ServicioPersona();
       
        System.out.println("Persona 1");
        Persona p1 = sp.crearPersona();
        vectorIMC[0] = sp.calcularIMC(p1);
        vectorEdad[0] = sp.esMayorDeEdad(p1);
       
        System.out.println("");
        System.out.println("Persona 2");
        Persona p2 = sp.crearPersona();
        vectorIMC[1] = sp.calcularIMC(p2);
        vectorEdad[1] = sp.esMayorDeEdad(p2);
       
        System.out.println("");
        System.out.println("Persona 3");
        Persona p3 = sp.crearPersona();
        vectorIMC[2] = sp.calcularIMC(p3);
        vectorEdad[2] = sp.esMayorDeEdad(p3);
       
        System.out.println("");
        System.out.println("Persona 4");
        Persona p4 = sp.crearPersona();
        vectorIMC[3] = sp.calcularIMC(p4);
        vectorEdad[3] = sp.esMayorDeEdad(p4);
       
        for (int i = 0; i < 4; i++) {
            if (vectorIMC[i] == -1) {
                bajoPeso++;
            } else if (vectorIMC[i] == 0){
                pesoIdeal++;
            } else if  (vectorIMC[i] == 1){
                sobrePeso++;
            }
        }
        
        System.out.println("");
        System.out.println("Porcentaje de IMC");
        System.out.println("Bajo Peso " + bajoPeso * 100 / 4 + "%");
        System.out.println("Peso Ideal " + pesoIdeal * 100 / 4 + "%");
        System.out.println("Sobre Peso " + sobrePeso * 100 / 4 + "%");
        
        for (int i = 0; i < 4; i++) {
            if (vectorEdad[i] == true) {
                mayor++;
            } else {
                menor++;
            }
        }
        
        System.out.println("");
        System.out.println("Porcentaje de mayores y menores de edad:");
        System.out.println("Mayor de edad " + mayor * 100 / 4 + "%");
        System.out.println("Menor de edad " + menor * 100 / 4 + "%");
        
    }
    
}
