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
package Entidad;

public class Curso {
    
    private String nombreCurso;
    private int horasXDia;
    private int diasXSemana;
    private String turno;
    private double precioXHora;
    private String [] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int horasXDia, int diasXSemana, String turno, double precioXHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.horasXDia = horasXDia;
        this.diasXSemana = diasXSemana;
        this.turno = turno;
        this.precioXHora = precioXHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasXDia() {
        return horasXDia;
    }

    public void setHorasXDia(int horasXDia) {
        this.horasXDia = horasXDia;
    }

    public int getDiasXSemana() {
        return diasXSemana;
    }

    public void setDiasXSemana(int diasXSemana) {
        this.diasXSemana = diasXSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioXHora() {
        return precioXHora;
    }

    public void setPrecioXHora(double precioXHora) {
        this.precioXHora = precioXHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
}
