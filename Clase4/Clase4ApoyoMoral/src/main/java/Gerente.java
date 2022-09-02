public class Gerente extends EmpleadoBanco{
    @Override
    public void procesarSolicitud(int monto) {
        if (monto >=60000 && monto <=200000){
            System.out.println("ATR, quedate tranqui que esto te lo gestiono yo, te gestiono el prestamo");
        } else {
            if(traemeAlSigEmpleadoDeLaFila() != null) {
                traemeAlSigEmpleadoDeLaFila().procesarSolicitud(monto);
            }
        }
    }
}
