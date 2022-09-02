import javax.swing.*;
import java.util.HashMap;

public class ArbolFactory {

    private int contador;

    private static final HashMap<String,Arbol> arboles = new HashMap<>();

    public Arbol plantarArbol(String color){
        if(!arboles.containsKey(color)){
            arboles.put(color, new Arbol(color));
            this.contador++;
            System.out.println("Se creó el árbol color " + color);
            System.out.println("Se plantó un árbol color " + color);
            System.out.println("Número total de árboles plantados: " + getContador());
            return arboles.get(color);
        }
        this.contador++;
        System.out.println("Se plantó un árbol color " + color);
        System.out.println("Número total de árboles plantados: " + getContador());
        return arboles.get(color);
    }

    public int getContador() {
        return contador;
    }
}