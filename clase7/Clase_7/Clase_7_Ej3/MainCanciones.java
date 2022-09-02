package Clase_7.Clase_7_Ej3;

public class MainCanciones {
    public static void main(String[] args) {
        CancionFactory canciones = new CancionFactory();
        Cancion cancion1 = canciones.getCanciones("baby");
        cancion1.setArtista("Justin Bieber feat Snopp Dog");
        cancion1.setGenero("Pop");
        cancion1.ToString();
        Cancion cancion2 = canciones.getCanciones("Don");
        cancion2.setArtista("Miranda");
        cancion2.setGenero("Rock Nacional");
        cancion2.toString();
        Cancion cancion3 = canciones.getCanciones("Triple T");
        cancion3.setArtista("Tini");
        cancion3.setGenero("Pop");
        cancion3.toString();
        Cancion cancion4 = canciones.getCanciones("baby");
        cancion4.setArtista("Justin Bieber");
        cancion4.setGenero("Pop");
        cancion4.toString();
    }
}
