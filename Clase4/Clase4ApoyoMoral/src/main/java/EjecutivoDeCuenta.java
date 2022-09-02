public class EjecutivoDeCuenta extends EmpleadoBanco{
    @Override
    public void procesarSolicitud(int monto) {
        if (monto <60000){
            System.out.println("Listo papu, de esto me encargo yo, te proceso el prestamo");
        } else {
            if(traemeAlSigEmpleadoDeLaFila() !=null){
                traemeAlSigEmpleadoDeLaFila().procesarSolicitud(monto);
            }
        }
    }
}
