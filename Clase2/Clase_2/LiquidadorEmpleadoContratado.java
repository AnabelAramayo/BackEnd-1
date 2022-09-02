package Clase_2;

public class LiquidadorEmpleadoContratado extends Liquidador{

    private EmpleadoContratado empleadoContratado;

    public LiquidadorEmpleadoContratado(EmpleadoContratado empleadoContratado) {
        this.empleadoContratado = empleadoContratado;
    }

    @Override
    public double calcularSueldo() {
        double sueldo = empleadoContratado.getCantHoras()*empleadoContratado.getValorHoras();
        imprimirRecibo();
        return sueldo;
    }
//Imprimir digital
    @Override
    public String imprimirRecibo() {
        String imprimir = "digital";
        return imprimir;
    }
}
