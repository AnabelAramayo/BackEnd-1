package Clase_7.Clase_7_Ej3;

import java.util.HashMap;

public class CancionFactory {

    private static final HashMap<String,Cancion> canciones = new HashMap<>();

    public Cancion getCanciones(String nombre){
        String clave = "key: "+nombre;

        if(!canciones.containsKey(clave)){
            canciones.put(clave,new Cancion(nombre));
        }
        return canciones.get(clave);
    }

}
