

package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *>>Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList< Jugador >jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.

 * 
 */
public class Juego {
     private List<Jugador> jugadores=new ArrayList();
     private RevolverDeAgua revol;

    public Juego() {
    }

    public Juego(RevolverDeAgua revol) {
        this.revol = revol;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevol() {
        return revol;
    }

    public void setRevol(RevolverDeAgua revol) {
        this.revol = revol;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revol=" + revol + '}';
    }
     

     public void llenarJuego(ArrayList< Jugador >jug, RevolverDeAgua r){
         jugadores=jug;
         revol=r;
     }
     
     public void ronda(){
         for (int i = 0; i < jugadores.size(); i++) {
            Jugador j=jugadores.get(i);
             if (j.isMojado()==true) {
                 System.out.println("PARTIDA TERMINADA");
                 System.out.println(""+j.getNom()+j.getId()+" se mojó.");
                 break;
             }
         }
     }
 
}
