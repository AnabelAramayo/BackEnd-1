package Clase_2;

public class LiquidadorEmpleadoEfectivo extends Liquidador{

    private EmpleadoEfectivo empleadoEfectivo;

    public LiquidadorEmpleadoEfectivo(EmpleadoEfectivo empleadoEfectivo) {
        this.empleadoEfectivo = empleadoEfectivo;
    }

    @Override
    public double calcularSueldo() {
        double sueldo = empleadoEfectivo.getSueldo()+empleadoEfectivo.getPremios()-empleadoEfectivo.getDescuentos();
        imprimirRecibo();
        return sueldo;
    }
    //imprime fisico
    @Override
    public String imprimirRecibo() {
        String impresion = "recibo fisico";
        return impresion;
    }
}
