public class Cuadrado {
    private int lado;
    private int area;
    private String nombre;


    public Cuadrado(int lado, String nombre) {
        this.lado = lado;
        this.nombre = nombre;
        this.area = lado*lado;
    }

    public void frase () {
        if (area){

        }
        System.out.println("El area de " + nombre + " es " + area);
    }
}
