

package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 
 */
public class ServicioAdopcion {
    Scanner leer= new Scanner (System.in).useDelimiter("\n");
    ArrayList<Persona> p= new ArrayList<>();
    ArrayList<Perro> perro= new ArrayList<>();
    ArrayList<Perro> perro_adp= new ArrayList<>();
    public Persona crearPersona(){
        Persona p=new Persona();
        System.out.println("\n>>>>>CARGA DE PERSONA<<<<<");   
        System.out.print("Ingrese el nombre: ");
        p.setNom(leer.next());
        System.out.print("Ingrese el apellido: ");
        p.setAp(leer.next());
        System.out.print("Ingrese su DNI: ");
        p.setDni(leer.nextInt());
        System.out.print("Ingrese su edad: ");
        p.setEdad(leer.nextInt());
       return p;
    }
    public void agregarPersona(){
        p.add(crearPersona());
    }
    
    public Perro crearPerro(){
        Perro pe= new Perro();
        System.out.println("\n>>>>>CARGA DE PERRO<<<<<"); 
        System.out.print("Ingrese el nombre del perro: ");
        pe.setNom(leer.next());
        System.out.print("Ingrese la raza del perro: ");
        pe.setRaza(leer.next());
        System.out.print("Ingrese la edad del perro: ");
        pe.setEdad(leer.nextInt());
        System.out.print("Ingrese el tamaño del perro (pequeño, mediano o grande): ");
        pe.setTam(leer.next());
        return pe;
    }
    public void agregarPerro(){
        perro.add(crearPerro());
    }
    
    public void variosPerros(){
        String op="si";
        System.out.println("\n>>>>>>>INGRESO DE PERROS EN ADOPCIÓN<<<<<<<");
        while(op.equalsIgnoreCase("si")){
            agregarPerro();
            System.out.print("\n¿Desea añadir otro perro? ");
            op=leer.next();
        }
    }
    
    public void variasPersonas(){
        String op="si", o, adop;
        int i=0;
        
        System.out.println("\n>>>>>>>INGRESO DE PERSONAS <<<<<<<");
        while(op.equalsIgnoreCase("si")){
            agregarPersona();
            System.out.println("\n¿"+p.get(i).getNom()+", le gustaría adoptar un perro? (Ingrese si o no)");
            o=leer.next();
            while(o.equalsIgnoreCase("si")){
                System.out.println("\nPerros en adopción: ");
                for (Perro aux : perro) {
                    System.out.println(">>Nombre del perro: "+aux.getNom()+", Edad: "+aux.getEdad()+", Raza: "+aux.getRaza()+", Tamaño: "+aux.getTam());
                }
                System.out.print("\nIngrese el nombre del perro que le gustaría adoptar: ");
                adop=leer.next();
                
              
                for (int j = 0; j <perro.size(); j++) {
                    if ((perro.get(j).getNom().equalsIgnoreCase(adop)) ) {
                        
                        if(perro_adp.contains(perro.get(j))){
                            System.out.println("\n>>>El perro ya ha sido adoptado.");
                            
                        }
                        else{
                            System.out.println("Adoptando perro......");
                            o="no" ;
                            p.get(i).setP(perro.get(j));
                            perro_adp.add(perro.get(j));
                        }
                    }
                }
               
            }
            i++;
            System.out.print("\n¿Desea añadir otra persona? ");
            op=leer.next();
        }
        
    }
    public void mostrar(){
        System.out.println("\n>>>>>>> PERSONAS <<<<<<<");
        System.out.println(p);
    }
    
}
