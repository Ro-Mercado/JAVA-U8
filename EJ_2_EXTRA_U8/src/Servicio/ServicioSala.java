

package Servicio;

import Entidades.Espectador;
import Entidades.Pelicula;
import Entidades.Cine;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 
 */
public class ServicioSala {
    
Scanner leer= new Scanner (System.in).useDelimiter("\n");

private String[][] sala= new String[8][6];
private String[] letras={"A","B","C","D","E","F"};
private int c,i,j;


public void cargaSalaVacia(){
     for (int a = 0; a < 8; a++) {
         c=8-a;
        for (int b = 0; b < 6; b++) {
            sala[a][b]=Integer.toString(c)+letras[b]+" |";
          
            
        }
    }
}

public Pelicula crearPelicula(){
    System.out.println("\n>>>>>CARGA PELÍCULA<<<<<");
    System.out.print("Ingrese el título de la película: ");
    String n=leer.next();
    System.out.print("Ingrese la duración de la película (en minutos): ");
    int time=leer.nextInt();
    System.out.print("Ingrese la edad mínima para ver la película: ");
    int edad= leer.nextInt();
    System.out.print("Ingrese el nombre del director: ");
    String dir= leer.next();
    return new Pelicula(n, time, edad, dir);
    
}

public Espectador crearEspectador(){
    System.out.println("\n>>>>>CARGA ESPECTADOR<<<<<");
    System.out.print("Ingrese el nombre del espectador: ");
    String n=leer.next();
    System.out.print("Ingrese la edad de "+n+": ");
    int edad= leer.nextInt();
    System.out.print("Ingrese el dinero de "+n+": ");
    float money=leer.nextFloat();
    return new Espectador(n , edad, money);
}

public Cine cargaCine(){
    System.out.println("\n>>>>>CARGA CINE<<<<<");
    Pelicula p=crearPelicula();
    ArrayList <Espectador> esp= new ArrayList<>();
    String op="si";
    //System.out.println("-----------------------------------------------");
    /*CARGA ESPECTADOR POR ESPECTADOR
    while(op.equalsIgnoreCase("si")){
        esp.add(crearEspectador());
        System.out.print("\n¿Desea añadir otro espectador?");
        op=leer.next();
        
    }*/
    //CARGA RÁPIDA ESPECTADORES (Cambiar la cantidad de veces del for)
    for (int k = 0; k < 40; k++) {
        esp.add(new Espectador("Pepito", 22 , 100.5f));
    }
    for (int k = 0; k < 10; k++) {
        esp.add(new Espectador("Pepito", 22 , 500.5f));
    }
    System.out.println("-----------------------------------------------");
    System.out.print("Ingrese el precio de la entrada: ");
    float precio=leer.nextFloat();
    Cine ci= new Cine(p, precio);
    ci.setSala(esp);
    return ci;
}

public void cargaSala(){
   
   Cine cin= cargaCine();
   
    //ASIGNAR ASIENTOS RANDOM A ESPECTADORES
    
       for (Espectador aux : cin.getSala()) {
        if (lugar()) {
            if ((aux.getDinero()>=cin.getPrecio()) && (aux.getEdad()>=cin.getPeli_rep().getE_min())) {
              sala[i][j]= sala[i][j].substring(0,2)+"X"+sala[i][j].substring(3,4);
            }
            else{
                System.out.println("La persona no tiene dinero o la edad mínima suficiente");
            }
        }
        
        else {
        System.out.println("\nNO HAY MÁS LUGAR DISPONIBLE");
        }
         
        
       } 
     
}
//HAY LUGAR?
 public boolean lugar(){
    boolean lugar=false;
    for (int a = 0; a < 8; a++) {
         for (int b = 0; b < 6; b++) {
             if (sala[a][b].substring(2, 3).equals(" ")) {
                 lugar=lugar || true;
             }else{
                  lugar= lugar || false;
             }
         }
    }
    
    i=(int)(Math.random()*7);
    j=(int)(Math.random()*5);
    while(sala[i][j].substring(2, 3).equals("X")){
        i=(int)(Math.random()*8);
        j=(int)(Math.random()*6);
    }
    
    
    return lugar;
 }

public void mostrar(){
  /*CARGA RANDOM PRUEBA
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 6; j++) {
            sala[i][j]="i";
        }
    }*/
    //para mostrar
    System.out.println(" ");
    for (int a = 0; a < 8; a++) {
        for (int b = 0; b < 6; b++) {
            System.out.print(sala[a][b]);
        }
        System.out.println(" ");
    }
}
}
