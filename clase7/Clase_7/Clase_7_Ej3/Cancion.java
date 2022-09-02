package Clase_7.Clase_7_Ej3;

public class Cancion {
    private String nombre;
    private String artista;
    private String genero;
    private static int instancias;

    public Cancion(String nombre) {
        this.nombre = nombre;
        instancias++;
        System.out.println(instancias);
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String ToString(){
        return getArtista()+getGenero();
    }
}
