public class Bosque {
    public static void main(String[] args) {
        ArbolFactory fabrica = new ArbolFactory();

//        Instancias:
//        Arbol arbol1 = fabrica.plantarArbol("rojo");
//        arbol1.setAlto(500);
//        arbol1.setHorizontal(300);
//        arbol1.setTipoArbol("Frutales");
//
//        Arbol arbol2 = fabrica.plantarArbol("rojo");
//
//        Arbol arbol3 = fabrica.plantarArbol("celeste");
//        arbol3.setAlto(100);
//        arbol3.setHorizontal(200);
//        arbol3.setTipoArbol("Frutales");
//
//        Arbol arbol4 = fabrica.plantarArbol("verde");
//        arbol4.setAlto(200);
//        arbol4.setHorizontal(400);
//        arbol4.setTipoArbol("Ornamentales");

        for (int i = 0; i < 500000; i++) {
            fabrica.plantarArbol("rojo");
            fabrica.plantarArbol("verde");
            i++;
        };

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}