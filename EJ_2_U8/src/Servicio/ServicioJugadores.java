

package Servicio;

import Entidades.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 
 */
public class ServicioJugadores {
    Scanner leer= new Scanner(System.in);
    public void crearJugadores(){
        List<Jugador> j= new ArrayList<>();
        Jugador jug;
        System.out.print("Ingrese un número del 1 al 6 para su id de jugadores: ");
        int n=leer.nextInt();
        while(n>6 && n<1){
            System.out.println("Por favor ingrese un número de jugador válido - Entre 1 y 6");
            n=leer.nextInt();
       
        }
        jug= new Jugador(n, "Jugador ", false);
        j.add(jug);
        
        /* 
        CREAR WHILE PARA LIMITAR A NO MÁS DE 6 JUGADORES
        HACER UN OBJETO DE TIPO JUEGO PARA SETAR LA LISTA DE JUGADORES EN JUEGO
        CREAR UN REVOLVER PARA SETEAR EL REVOLVER EN JUEGO
        */
       
    }
}
