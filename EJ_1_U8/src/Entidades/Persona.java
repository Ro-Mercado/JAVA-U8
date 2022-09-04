

package Entidades;


import java.util.ArrayList;
import java.util.List;



/**
 *
 * 
 */
public class Persona {
    //nombre, apellido, edad, documento y Perro.
    private String nom;
    private String ap;
    private int edad;
    private int dni;
    private List<Perro> p=new ArrayList<>();

    public Persona() {
    }

    public Persona(String nom, String ap, int edad, int dni, List<Perro> p) {
        this.nom = nom;
        this.ap = ap;
        this.edad = edad;
        this.dni = dni;
        this.p = p;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Perro> getP() {
        return p;
    }

    public void setP(Perro perrito) {
        p.add(perrito);
    }

    @Override
    public String toString() {
        return "Persona: " + nom +" "+ ap + ", Edad:" + edad + ", DNI:" + dni + "\nPerro/s de "+nom+ ": " + p;
    }
    
    
}
