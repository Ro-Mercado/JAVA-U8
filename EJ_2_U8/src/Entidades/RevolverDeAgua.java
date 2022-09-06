

package Entidades;

/**
 *>>Clase Revolver de agua: 
esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 * 
 */
public class RevolverDeAgua {
    private int posActual;
    private int posAgua;

    public RevolverDeAgua() {
       
    }

    public RevolverDeAgua(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua " + "Posición actual del tambor: " + posActual + ", Posición del agua: " + posAgua ;
    }
    
    public void llenarRevolver(){
       posActual=(int)(Math.random()*6);
       posAgua=(int)(Math.random()*6);
    }
    public boolean mojar(){
        return posActual==posAgua;
    }
    public void siguienteChorro(){
        if (posActual>6) {
            posActual=0;
        }
        else{
            posActual++;
        }
    }
}
