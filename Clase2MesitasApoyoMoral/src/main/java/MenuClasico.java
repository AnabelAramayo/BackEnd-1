public class MenuClasico extends Menu{
    public MenuClasico(double precioBase) {
        super(precioBase);
    }

    @Override
    public double calculoPrecioDeVenta() {
        System.out.println(this.getPrecioBase());
        return this.getPrecioBase();
    }
}
