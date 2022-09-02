package Clase_2;

public class EmpleadoContratado extends Empleado{

    private int cantHoras;
    private double valorHoras;

    public EmpleadoContratado(String nombre, String apellido, String numCuenta, int cantHoras, double valorHoras) {
        super(nombre, apellido, numCuenta);
        this.cantHoras = cantHoras;
        this.valorHoras = valorHoras;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }
}
