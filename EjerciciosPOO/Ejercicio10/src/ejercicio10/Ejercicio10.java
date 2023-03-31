/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
*/
package ejercicio10;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {

        double [] arregloA = new double [50];
        double [] arregloB = new double [20];
        
        System.out.println("-----Arreglo A-----");
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (int) (Math.random() * 50);
            System.out.print("[" + arregloA[i] + "]");
        }
        System.out.println("");
                
        System.out.println("-----Arreglo A ordenado-----");
        Arrays.sort(arregloA);
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print("[" + arregloA[i] + "]");
        }
        
        System.out.println("");
        System.out.println("-----Arreglo B-----");
        for (int i = 0; i < arregloB.length; i++) {
            if (i >= 0 && i <= 9) {
                arregloB[i] = arregloA[i];
            } else {
                arregloB[i] = 0.5;
            }
            System.out.print("[" + arregloB[i] + "]");
        }
        System.out.println("");
        
    }
    
}
