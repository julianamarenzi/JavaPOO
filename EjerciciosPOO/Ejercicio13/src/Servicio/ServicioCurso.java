/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
*/
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

public class ServicioCurso {
    
    Scanner leer = new Scanner(System.in);
    
    public void cargarAlumnos(String [] alumnos){

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del Alumno N°" + (i + 1));
            alumnos[i] = leer.next();
         }
        
    }
    
    public Curso crearCurso(){
        
        Curso c = new Curso();
        
        System.out.print("Nombre del curso: ");
        c.setNombreCurso(leer.next());
        System.out.print("Cantidad de horas por día: ");
        c.setHorasXDia(leer.nextInt());
        System.out.print("Cantidad de días por semana: ");
        c.setDiasXSemana(leer.nextInt());
        System.out.print("Turno: ");
        c.setTurno(leer.next());
        System.out.print("Precio por hora: ");
        c.setPrecioXHora(leer.nextInt());
        String[] alumnos = new String [5];
        cargarAlumnos(alumnos);
        
        return c;
        
    }
    
    public void gananciaSemanal(Curso c){
        
        double ganancia = c.getDiasXSemana() * c.getHorasXDia() * c.getPrecioXHora() * 5;
        System.out.println("Ganancia semanal: $" + ganancia);
        
    }
    
}
