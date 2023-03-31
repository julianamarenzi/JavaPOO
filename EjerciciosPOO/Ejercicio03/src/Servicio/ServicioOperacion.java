/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
*/
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

public class ServicioOperacion {
    
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        
        Operacion o1 = new Operacion();
        
        System.out.println("Ingrese dos números: ");
        o1.setNum1(leer.nextInt());
        o1.setNum2(leer.nextInt());
        
        return o1;
        
    }
    
    public int sumar(Operacion o1){
        
        int suma = o1.getNum1() + o1.getNum2();
        return suma;
        
    }
    
    public int resta(Operacion o1){
        
        int resta = o1.getNum1() - o1.getNum2();
        return resta;
        
    }
    
    public int multiplicar(Operacion o1){
        
        int multi;
        if (o1.getNum1() == 0 || o1.getNum2() == 0) {
            multi = 0;
            System.out.println("Error! Está multiplicando por 0");
        } else {
            multi = o1.getNum1() * o1.getNum2(); 
        }
        return multi;
        
    }
    
    public int division(Operacion o1){
        
        int dividir;
        if (o1.getNum1() == 0 || o1.getNum2() == 0) {
            dividir = 0;
            System.out.println("Error! Está dividiendo por 0");
        } else {
            dividir = o1.getNum1() / o1.getNum2(); 
        }
        return dividir;
        
    }
    
}
