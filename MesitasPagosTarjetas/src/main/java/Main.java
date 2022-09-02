import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        TarjetaCredito mastercard = new TarjetaCredito(12346578,1234,2025,3000,2000,500);
        TarjetaDebito visaDebito = new TarjetaDebito(12345678,1234,2025,2000,500);

        System.out.println("MASTERCARD:");
        mastercard.procesarPago();

        System.out.println("VISADEBITO:");
        visaDebito.procesarPago();
    }
}
