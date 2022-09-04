

package ej_1_u8;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;


public class EJ_1_U8 {

    /**
     * @param args the command line arguments
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
    clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
    atributos: nombre, apellido, edad, documento y Perro.
    Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
    pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
    la clase Persona, la información del Perro y de la Persona.
     */
    public static void main(String[] args) {
       
       Perro p1 = new Perro("pancho","salchicha",5,65);
       Persona p=new Persona();
       crearPersona(p);
       System.out.println(p);
       /*public void crearPersona(){
        System.out.print("Ingrese su nombre: ");
        nom=leer.next();
        System.out.print("Ingrese su apellido: ");
        ap=leer.next();
        System.out.print("Ingrese su edad: ");
        edad=leer.nextInt();
        System.out.print("Ingrese su DNI: ");
        dni=leer.nextInt();
        
        System.out.println("Tiene perro? (si/no)");
        String op=leer.next();
        while(op.equalsIgnoreCase("si")){
            Perro p1=new Perro();
            p.add(p1.crearPerro());
            System.out.println("Desea añadir otro perro?");
            op=leer.next();
        }
        
    }
       
       public Perro crearPerro(){
        System.out.println("Ingrese el nombre de su perro");
        nom=leer.next();
        System.out.println("Ingrese la raza del perro");
        raza=leer.next();
        System.out.println("Ingrese la edad del perro");
        edad=leer.nextInt();
        System.out.println("Ingrese el tamaño del perro en centímetros");
        tam=leer.nextFloat();
        return new Perro(nom,raza,edad,tam);
    }
    
       */
    }

    //SUBPROCESOS O FUNCIONES
    public static void crearPersona(Persona p){
        Scanner leer= new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        p.setNom(leer.next());
        System.out.print("Ingrese su apellido: ");
        p.setAp(leer.next());
        System.out.print("Ingrese su edad: ");
        p.setEdad(leer.nextInt());
        System.out.print("Ingrese su DNI: ");
        p.setDni(leer.nextInt());
        
        System.out.println("Tiene perro? (si/no)");
        String op=leer.next();
        while(op.equalsIgnoreCase("si")){
            p.setP(crearPerro());
            System.out.println("Desea añadir otro perro?");
            op=leer.next();
        }

    }
    
     public static Perro crearPerro(){
        Scanner leer= new Scanner(System.in);
        Perro p1=new Perro();
        System.out.println("Ingrese el nombre de su perro");
        p1.setNom(leer.next());
        System.out.println("Ingrese la raza del perro");
        p1.setRaza(leer.next());
        System.out.println("Ingrese la edad del perro");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro en centímetros");
        p1.setTam(leer.nextFloat());
       return p1;
    }
    
    
}
