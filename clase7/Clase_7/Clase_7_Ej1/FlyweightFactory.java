package Clase_7.Clase_7_Ej1;

import java.util.HashMap;

public class FlyweightFactory {

    private static final HashMap<String,Circulo> circulosMap = new HashMap<>();

    public static Circulo obtenerCirculo(String color){
        Circulo circulo = circulosMap.get(color);
        if(circulo == null){
            circulo = new Circulo(color);
            circulosMap.put(color,circulo);
            System.out.println("Creo un circulo de color "+color);
        }
        return circulo;
    }


}
