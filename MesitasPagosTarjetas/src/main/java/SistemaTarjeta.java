public abstract class SistemaTarjeta {
    private int numeroFrente;
    private int codigoSeguridad;
    private int fechaExpiracion;

    public SistemaTarjeta(int numeroFrente, int codigoSeguridad, int fechaExpiracion) {
        this.numeroFrente = numeroFrente;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaExpiracion = fechaExpiracion;
    }

    public void procesarPago() {
        comprobarFechaVencimiento();
        autorizarTarjeta();
    }

    //metodos abstractos
    public abstract void autorizarTarjeta();


    private void comprobarFechaVencimiento() {
        if (fechaExpiracion<2022) {
            System.out.println("Tu tarjeta esta vencida, no podemos seguir la compra");
        } else {
            System.out.println("Fecha de vencimiento de tarjeta OK");
        }
    }
}
