package Clase_7.Clase_7_Ej2;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String,Computer> computadoras = new HashMap<>();

    public static Computer getComputer(int id){

        String clave = "key: "+id ;
        System.out.println(clave);

        if(!computadoras.containsKey(clave)){
            computadoras.put(clave,new Computer(id));
            System.out.println("PC creada");
            return computadoras.get(clave);
        }

        return computadoras.get(clave);
    }
}
