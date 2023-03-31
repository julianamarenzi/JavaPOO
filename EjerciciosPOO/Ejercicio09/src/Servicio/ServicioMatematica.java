/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
package Servicio;

import Entidad.Matematica;

public class ServicioMatematica {
 
    public void devolverMayor(Matematica m){
        
        if (m.getNum1() > m.getNum2()) {
            System.out.println("El número mayor es: " + m.getNum1());
        } else {
            System.out.println("El número mayor es: " + m.getNum2());
        }
        
    }
    
    public void calcularPotencia(Matematica m){
        
        double num1, num2, potencia = 0;
        num1 = Math.round(m.getNum1());
        num2 = Math.round(m.getNum2());
        if (num1 > num2) {
            potencia = Math.pow(num1, num2);
        } else if (num2 > num1){
            potencia = Math.pow(num2, num1);
        }
        System.out.println("El número mayor elevado al número menor es: " + potencia);
        
    }
    
    public void calcularRaiz(Matematica m){
        
        double num1, num2, raiz = 0;
        num1 = Math.abs(m.getNum1());
        num2 = Math.abs(m.getNum2());
        if (num1 > num2) {
            raiz = Math.sqrt(num2);
        } else if (num2 > num1){
            raiz = Math.sqrt(num1);
        }
        System.out.println("La raiz del número menor es: " + raiz);
        
    }
    
}
