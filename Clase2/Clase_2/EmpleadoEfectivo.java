package Clase_2;

public class EmpleadoEfectivo extends Empleado{

    private double sueldo;
    private double descuentos;
    private double premios;

    public EmpleadoEfectivo(String nombre, String apellido, String numCuenta, double sueldo, double descuentos, double premios) {
        super(nombre, apellido, numCuenta);
        this.sueldo = sueldo;
        this.descuentos = descuentos;
        this.premios = premios;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getPremios() {
        return premios;
    }

    public void setPremios(double premios) {
        this.premios = premios;
    }
}
