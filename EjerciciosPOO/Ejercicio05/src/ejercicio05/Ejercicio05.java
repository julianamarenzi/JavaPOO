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
package ejercicio05;

import Entidad.Cuenta;
import Servicio.ServicioCuenta;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        ServicioCuenta sc = new ServicioCuenta();
        Cuenta c1 = sc.crearCuenta();
               
        int rta;
        do {
            System.out.println("¿Que desea realizar? \n 1. Ingreso \n 2. Retiro \n 3. Extracción Rápida \n 4. Consultar Saldo \n 5. Consultar Datos \n 6. Salir");
            rta = leer.nextInt();
            switch(rta){
                case 1:
                    sc.ingreso(c1);
                    break;
                case 2:
                    sc.retiro(c1);
                    break;
                case 3:
                    sc.extraccionRapida(c1);
                    break;
                case 4:
                    sc.consultarSaldo(c1);
                    break;
                case 5:
                    sc.consultarDatos(c1);
                    break;
            }
        } while (rta != 6);
        
        System.out.println("Vuelva pronto");
        
    }
    
}
