

package Entidades;

import java.util.ArrayList;

/**
 *
 * 
 */
public class Cine {
    private Pelicula peli_rep;
    private ArrayList<Espectador> sala= new ArrayList<>();
    private float precio;

    public Cine() {
    }

    public Cine(Pelicula peli_rep, float precio) {
        this.peli_rep = peli_rep;
        this.precio = precio;
    }

    public Pelicula getPeli_rep() {
        return peli_rep;
    }

    public void setPeli_rep(Pelicula peli_rep) {
        this.peli_rep = peli_rep;
    }

    public ArrayList<Espectador> getSala() {
        return sala;
    }

    public void setSala(ArrayList<Espectador> sala) {
        this.sala = sala;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "peli_rep=" + peli_rep + ", sala=" + sala + ", precio=" + precio + '}';
    }
    
    
}
