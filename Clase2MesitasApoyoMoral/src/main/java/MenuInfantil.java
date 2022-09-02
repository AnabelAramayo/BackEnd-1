public class MenuInfantil extends Menu {
    private boolean llevaJuguete;

    public MenuInfantil(double precioBase, boolean llevaJuguete) {
        super(precioBase);
        this.llevaJuguete=llevaJuguete;
    }

    protected boolean quiereJuguete(){
        if(this.llevaJuguete){
            return true;
        }else{
            return false;
        }
    }


    @Override
    public double calculoPrecioDeVenta() {
        System.out.println("Precio total: ");
        if(quiereJuguete()){
            System.out.println(this.getPrecioBase()+3);
            return this.getPrecioBase()+3;
        }else{
            System.out.println(this.getPrecioBase());
            return this.getPrecioBase();
        }
    }
}