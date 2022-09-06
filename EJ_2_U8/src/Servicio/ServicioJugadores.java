

package Servicio;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 
 */
public class ServicioJugadores {
    Scanner leer= new Scanner(System.in);
        Juego j= new Juego();
        
    public void crearJugadores(){
        Jugador jug;
        ArrayList<Jugador> listaJ= new ArrayList<>();
        RevolverDeAgua revol=new RevolverDeAgua();
        //-----------------------------------------------------------
        System.out.print("Ingrese la cantidad de jugadores: ");
        int num=leer.nextInt();
        while(num>6 || num<1){
            System.out.print("Por favor ingrese una cantidad válida (Entre 1 y 6):  ");
            num=leer.nextInt();
        }
        while(listaJ.size()<num){
            System.out.print("Ingrese un número del 1 al "+num+" para su id de jugadores: ");
            int n=leer.nextInt();
            while(n>num || n<1){
                System.out.print("Por favor ingrese un número de jugador válido - Entre 1 y "+ num+ ":  ");
                n=leer.nextInt();}
            jug= new Jugador(n, "Jugador ", false);
            listaJ.add(jug);
        }
       j.setJugadores(listaJ);
       j.setRevol(revol);
       j.llenarJuego(listaJ, revol);
    
    }
    
    public void mostrar(){
        //  j.toString();
        System.out.println("JUGADORES: ");
        for (Jugador jugador : j.getJugadores()) {
            System.out.println(jugador+"\n");
        }
        
        System.out.println("REVOLVER: "+j.getRevol());
        System.out.println("------------------------------------------------");
    }
    
    public void inicioJuego(){
        System.out.println("\n\b¡COMIENZA EL JUEGO!");
        j.ronda();
    }
}
