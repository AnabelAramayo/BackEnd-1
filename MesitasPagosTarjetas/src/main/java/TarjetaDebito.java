public class TarjetaDebito extends SistemaTarjeta{
    private double saldoDisponible;
    private double montoAPagar;

    public TarjetaDebito(int numeroFrente, int codigoSeguridad, int fechaExpiracion, double saldoDiponible, double montoAPagar) {
        super(numeroFrente, codigoSeguridad, fechaExpiracion);
        this.saldoDisponible = saldoDiponible;
        this.montoAPagar = montoAPagar;
    }

    @Override
    public void autorizarTarjeta() {
        if(saldoDisponible >= montoAPagar){
            saldoDisponible=saldoDisponible-montoAPagar;
            System.out.println("Se autoriza la tarjeta. Se esta autorizando tu compra.... Compra realizada. Tu nuevo saldo es de: "+saldoDisponible);
        } else {
            System.out.println("Tarjeta no autorizada, no se puede seguir con la compra");
        }
    }}

