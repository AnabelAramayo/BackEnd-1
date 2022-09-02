public abstract class Menu {
    private double precioBase;


    //constructor
    public Menu(double precioBase) {

        this.precioBase = precioBase;
    }

    //Metodo esqueleto
    public void menu () {
        elegirIngredientes();
        cocinandoHamburguesa();
        calculoPrecioDeVenta();
        despedida();
    }

    //Method abtract
    public abstract double calculoPrecioDeVenta ();

    //metodos void
    public void elegirIngredientes(){
        System.out.println("Eligir ingredientes");
    }
    public void cocinandoHamburguesa(){
        System.out.println("Cocinar hamburguesa...");
    }
    public void despedida(){
        System.out.println("Decirle al cliente: Gracias por comprar en nuestro local!");
    }

    //getters y setters precioBase
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
