

package Entidades;


/**
 *
 * 
 */
public class Perro {
    private String nom;
    private String raza;
    private int edad;
    private Float tam;

    public Perro() {
    }

    public Perro(String nom, String raza, int edad, float tam) {
        this.nom = nom;
        this.raza = raza;
        this.edad = edad;
        this.tam = tam;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getTam() {
        return tam;
    }

    public void setTam(Float tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "Perro: " + nom + ", Raza:" + raza + ", Edad:" + edad + ", Tamaño:" + tam ;
    }
    
}
