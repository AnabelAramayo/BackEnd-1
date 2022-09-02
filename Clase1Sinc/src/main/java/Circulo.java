public class Circulo {
    private int radio;
    private double area;
    private String nombre;

    public Circulo(int radio, String nombre) {
        this.radio = radio;
        this.nombre = nombre;
        this.area = 3.14*(radio*radio);
    }

    public void frase () {
        System.out.println("El area de " + nombre + " es " + area);
    }


}
