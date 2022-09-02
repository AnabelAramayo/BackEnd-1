package Clase_2;

public abstract class Liquidador {

    public String liquidarSueldo(Empleado empleado){
        double sueldo = calcularSueldo();

        return depositarSueldo(sueldo);
    }

    public String depositarSueldo(double sueldo) {
        return "La liquidación generada es un documento digital. Saldo a liquidar: "+sueldo;
    }

    public abstract double calcularSueldo();

    public abstract String imprimirRecibo();
}
