

package Entidades;

import java.util.ArrayList;

/**
 *Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 * 
 */
public class Voto {
    private Alumno alu;
    private ArrayList<Alumno> alumnos=new ArrayList<>();

    public Voto() {
    }

    public Voto(Alumno alu) {
        this.alu = alu;
    }

    public Alumno getAlu() {
        return alu;
    }

    public void setAlu(Alumno alu) {
        this.alu = alu;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Voto{" + "alu=" + alu + ", alumnos=" + alumnos + '}';
    }
    
    
    
}
