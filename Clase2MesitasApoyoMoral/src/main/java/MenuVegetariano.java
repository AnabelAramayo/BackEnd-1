public class MenuVegetariano extends Menu{
    //private int precioSalsas;
    private double adicionalEspecias;

    //constructor
    public MenuVegetariano(double precioBase, double adicionalEspecias) {
        super(precioBase);
        //this.precioSalsas = precioSalsas;
        this.adicionalEspecias = adicionalEspecias;
    }


    @Override
    public double calculoPrecioDeVenta() {
        System.out.println("El precio total es de: ");
        System.out.println(getPrecioBase()+(getPrecioBase()*0.1)+this.adicionalEspecias);
        return getPrecioBase()+(getPrecioBase()*0.01)+this.adicionalEspecias;
    }
}
