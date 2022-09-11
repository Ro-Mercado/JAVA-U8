

package Entidades;

/**
 *
 * 
 */
public class Pelicula {
    private String tit;
    private int dur_min;
    private int e_min;
    private String director;

    

    public Pelicula() {
    }
    public Pelicula(String tit, int dur_min, int e_min, String director) {
        this.tit = tit;
        this.dur_min = dur_min;
        this.e_min = e_min;
        this.director = director;
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public int getDur_min() {
        return dur_min;
    }

    public void setDur_min(int dur_min) {
        this.dur_min = dur_min;
    }

    public int getE_min() {
        return e_min;
    }

    public void setE_min(int e_min) {
        this.e_min = e_min;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "tit=" + tit + ", dur_min=" + dur_min + ", e_min=" + e_min + ", director=" + director + '}';
    }
    

}
