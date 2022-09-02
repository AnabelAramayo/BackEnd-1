public class TarjetaCredito extends SistemaTarjeta{
    private double limite;
    private double saldoUtilizado;
    private double montoAPagar;

    public TarjetaCredito(int numeroFrente, int codigoSeguridad, int fechaExpiracion, double limite, double saldoUtilizado, double montoAPagar) {
        super(numeroFrente, codigoSeguridad, fechaExpiracion);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
        this.montoAPagar = montoAPagar;
    }

    @Override
    public void autorizarTarjeta() {
        if (montoAPagar<=limite) {
            saldoUtilizado= saldoUtilizado-montoAPagar;
            System.out.println("Se autoriza tu tarjeta, realizando compra... compra realizada. Tu nuevo saldo es de: "+ saldoUtilizado);
        }else{
            System.out.println("No se autoriza tu tarjeta, no se puede seguir con tu compra");
        }
    }
}
