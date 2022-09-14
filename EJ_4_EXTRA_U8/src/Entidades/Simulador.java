package Entidades;

import java.util.ArrayList;
import java.util.Collections;

/**
 * • La clase Simulador debe tener un método que genere un listado de alumnos
 * manera aleatoria y lo retorne. Las combinaciones de nombre y apellido deben
 * ser generadas de manera aleatoria. Nota: usar listas de tipo String para
 * generar los nombres y los apellidos. • Ahora hacer un generador de
 * combinaciones de DNI posibles, deben estar dentro de un rango real de números
 * de documentos. Y agregar a los alumnos su DNI. Este método debe retornar la
 * lista de dnis. Crearemos un método votación en la clase Simulador que, recibe
 * el listado de alumnos y para cada alumno genera tres votos de manera
 * aleatoria. En este método debemos guardar a el alumno que vota, a los alumnos
 * a los que votó y sumarle uno a la cantidad de votos a cada alumno que reciba
 * un voto, que es un atributo de la clase Alumno. Tener en cuenta que un alumno
 * no puede votarse a sí mismo o votar más de una vez al mismo alumno. Utilizar
 * un hashset para resolver esto.
 *
 */
public class Simulador {

    private ArrayList<String> nomap = new ArrayList<>();
    private ArrayList<Integer> dnis = new ArrayList<>();
    private Integer doc;

    public Simulador() {
    }

    public Simulador(Integer doc) {
        this.doc = doc;
    }

    public ArrayList<String> getNomap() {
        return nomap;
    }

    public void setNomap(ArrayList<String> nomap) {
        this.nomap = nomap;
    }

    public ArrayList<Integer> getDnis() {
        return dnis;
    }

    public void setDnis(ArrayList<Integer> dnis) {
        this.dnis = dnis;
    }

    public Integer getDoc() {
        return doc;
    }

    public void setDoc(Integer doc) {
        this.doc = doc;
    }

    @Override
    public String toString() {
        return "Simulador{" + "nomap=" + nomap + ", dnis=" + dnis + ", doc=" + doc + '}';
    }
    
    

    public ArrayList<String> listaAleatoria() {
        ArrayList<String> nom = new ArrayList();
        nom.add("Juan");
        nom.add("Marta");
        nom.add("Ariel");
        nom.add("Catalina");
        nom.add("Isabel");
        nom.add("Carlos");

        ArrayList<String> ap = new ArrayList<>();
        ap.add("Gómez");
        ap.add("López");
        ap.add("Pérez");
        ap.add("Diaz");
        ap.add("Fernandez");
        ap.add("Gonzalez");
        Collections.shuffle(nom);
        Collections.shuffle(ap);
        for (int i = 0; i < 6/*nom.size()/ ap.size() Se supone que ambas listas deberian tener igual tamaño*/; i++) {
            nomap.add(nom.get(i)+" "+ap.get(i));
        }
        return nomap;
    }


}
