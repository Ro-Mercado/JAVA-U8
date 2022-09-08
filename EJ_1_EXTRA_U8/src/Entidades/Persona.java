

package Entidades;

import java.util.ArrayList;
/**
 *
 * 
 */
public class Persona {
    private String nom;
    private String ap;
    private int edad;
    private int dni;
    private Perro p=new Perro();

    public Persona() {
    }

    public Persona(String nom, String ap, int edad, int dni) {
        this.nom = nom;
        this.ap = ap;
        this.edad = edad;
        this.dni = dni;
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

    public Perro getP() {
        return p;
    }

    public void setP(Perro p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "\n\nNombre y Apellido: " + nom +" "+ ap + "\nEdad: " + edad + "\nDNI: " + dni + "\nPerro Adoptado: " + p ;
    }

   
    
}
