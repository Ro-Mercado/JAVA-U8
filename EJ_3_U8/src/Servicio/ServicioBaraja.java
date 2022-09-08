

package Servicio;


import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * 
 */
public class ServicioBaraja {
    Scanner leer= new Scanner (System.in).useDelimiter("\n");
    
    private String[] palos= {"Oro","Basto","Copa", "Espada"};
    private ArrayList<Carta> bar= new ArrayList<>();
    private Carta carta;
    private Baraja b= new Baraja();
    private Baraja cartasEntregadas= new Baraja();
    
    public void crearBaraja(){
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                carta= new Carta();
                carta.setPalo(palos[i]);
                if(j>=8){
                   carta.setNum(j+2);
                }
                else{
                    carta.setNum(j);
                }
                
                bar.add(carta);
                
            }
        }
       
        b.setBaraja(bar);
    }
    
    public void mostrar(){
        System.out.println("-------------------");
        if (b.getBaraja().isEmpty()) {
            System.out.println("\nNO QUEDAN MÁS CARTAS EN EL MAZO.");
        }
        else{
            System.out.println(">>>>>CARTAS DISPONIBLES DEL MAZO<<<<<");
             System.out.println(b);
        }
    }
     public void barajar(){
        Collections.shuffle(b.getBaraja());
    }
    
    public void siguienteCarta(){
        System.out.println("\n>>>>SIGUIENTE CARTA EN EL MAZO<<<<\n"+b.getBaraja().get(0));
           
    }
    
    public void cartasDisponibles(){
       System.out.println("\n>>>>>CANTIDAD DE CARTAS DISPONIBLES<<<<< "+b.getBaraja().size());
    }
    
    public void darCartas(){
        System.out.println("\n>>>>>PEDIDO DE CARTAS<<<<<\nIngrese la cantidad de cartas que precisa: ");
        int cant=leer.nextInt();
        if (cant>b.getBaraja().size()) {
            System.out.println("\nLo sentimos, la cantidad de cartas solicitadas es superior a la cantidad de cartas disponibles.");
            System.out.println("Cartas disponibles: "+b.getBaraja().size() );
        }
        else{
            System.out.println("---> Se entregan al jugador: ");
            for (int i = 0; i < cant; i++) {
                System.out.println(b.getBaraja().get(i));
            }
            for (int i = 0; i < cant ; i++) {
                cartasEntregadas.getBaraja().add(b.getBaraja().get(0));
                b.getBaraja().remove(0);
            }
        }
        
    }
    
    public void cartasMonton(){
        System.out.println("\n>>>>>CARTAS QUE SALIERON<<<<<");
        if (cartasEntregadas.getBaraja().isEmpty()) {// .isEmpty representa el .size()==0
            System.out.println("\nAún no se retiraron cartas del monton.");
        } else {
            System.out.println(cartasEntregadas);    
        }
    }
    
    public void menu(){
        int op=0;
        do {
        System.out.println("*******************************");
        System.out.println("*            MENÚ             *");
        System.out.println("******************************");
        System.out.println("1.Barajar el mazo           ");
        System.out.println("2.Ver la siguiente carta");
        System.out.println("3.Pedido de cartas        ");
        System.out.println("4.Ver cartas que ya salieron       ");
        System.out.println("5.Ver cartas del mazo disponibles   ");
        System.out.println("6.Salir");
        System.out.println("*******************************");
            System.out.print("\nSeleccióne una opcion: ");
            op=leer.nextInt();
        
            switch (op) {
                case 1:
                   barajar();
                    break;
                case 2:
                    siguienteCarta();
                    break;
               case 3:
                   darCartas();
                    break;
               case 4:
                    cartasMonton();
                    break;
                case 5:
                     cartasDisponibles();
                     mostrar();
                    break;
                case 6:
                     System.out.println("-----FIN-----");
                    break;
                
                default:
                    System.out.println("OPCION MAL INGRESADA");    
            }
            System.out.print("\n******Presione enter para continuar*****\n");
            
            String var=leer.next();
        } while (op!=6);
    }
    
   
}
