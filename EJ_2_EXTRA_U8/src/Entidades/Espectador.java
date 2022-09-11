

package Entidades;

/**
 *
 * 
 */
public class Espectador {
    private String nom;
    private int edad;
    private float dinero;

    public Espectador() {
    }

    public Espectador(String nom, int edad, float dinero) {
        this.nom = nom;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nom=" + nom + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
    
    
}
