/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
*/
package Entidad;

public class Cancion {
    
    private String titulo;
    private String autos;

    public Cancion() {
        this.titulo = " ";
        this.autos = " ";
    }

    public Cancion(String titulo, String autos) {
        this.titulo = titulo;
        this.autos = autos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutos() {
        return autos;
    }

    public void setAutos(String autos) {
        this.autos = autos;
    }
    
}
