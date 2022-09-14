

package Entidades;

/**
 *
 * 
 */
public class Alumno {
    private String nomap;
    private int dni;
    private int cant_votos;

    public Alumno() {
    }

    public Alumno(String nomap, int dni, int cant_votos) {
        this.nomap = nomap;
        this.dni = dni;
        this.cant_votos = cant_votos;
    }

    public String getNomap() {
        return nomap;
    }

    public void setNomap(String nomap) {
        this.nomap = nomap;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCant_votos() {
        return cant_votos;
    }

    public void setCant_votos(int cant_votos) {
        this.cant_votos = cant_votos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nomap=" + nomap + ", dni=" + dni + ", cant_votos=" + cant_votos + '}';
    }
    
    
}
