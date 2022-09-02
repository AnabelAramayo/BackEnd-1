import java.util.HashMap;

public class Serie implements ISerie {
    private String nombre;
    private String linkReproduccion;
   //private HashMap<String, String> series;

    public Serie(String nombre) {
        //llenado();
        this.nombre = nombre;
        this.linkReproduccion = "www." + nombre;
    }

    /*private void llenado() {
        series = new HashMap<>();
        series.put("Mad Men", "www.MadMen");
        series.put("GOT", "www.GOT");
        series.put("ALF", "WWW.ALF");
        series.put("La casa de papel", "www.LaCasaDePapel");
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLinkReproduccion() {
        return linkReproduccion;
    }

    public void setLinkReproduccion(String linkReproduccion) {
        this.linkReproduccion = linkReproduccion;
    }

    @Override
    public String getSerie() {
        return getLinkReproduccion();
    }
}
