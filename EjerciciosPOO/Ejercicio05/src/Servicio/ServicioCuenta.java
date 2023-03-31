/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
*/
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        
        Cuenta c1 = new Cuenta();
        
        System.out.print("Ingrese su número de cuenta: ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.print("Ingrese su DNI: ");
        c1.setDni(leer.nextLong());
        System.out.print("Ingrese su saldo actual: ");
        c1.setSaldoActual(leer.nextInt());
        
        return c1;
        
    }
    
    public double ingreso(Cuenta c1){
        
        System.out.print("¿Cuánto dinero desea ingresar?: $");
        double ingreso = leer.nextDouble();
        c1.setSaldoActual(c1.getSaldoActual() + ingreso);
        return c1.getSaldoActual();
        
    }
    
    public double retiro(Cuenta c1){
        
        System.out.print("¿Cuánto dinero desea retirar?: $");
        double retiro = leer.nextDouble();
        if (retiro > c1.getSaldoActual()) {
            c1.setSaldoActual(0);
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - retiro);
        }       
        return c1.getSaldoActual();
        
    }
    
    public double extraccionRapida(Cuenta c1){
        
        System.out.println("¿Cuánto dinero desea retirar con la Extracción Rápida?");
        double rapida = leer.nextDouble();
        if (rapida > c1.getSaldoActual() * 0.2) {
            System.out.println("Solo puede retirar un 20% o menos en una Extracción Rápida");
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - rapida);
        }
        return rapida;
        
    }
    
    public void consultarSaldo(Cuenta c1){
        
        System.out.println("Saldo Actual: $" + c1.getSaldoActual());
        
    }
    
    public void consultarDatos(Cuenta c1){
        
        System.out.println("Datos de la Cuenta: ");
        System.out.println("Número de Cuenta: " + c1.getNumeroCuenta());
        System.out.println("DNI: " + c1.getDni());
        
    }
    
}
