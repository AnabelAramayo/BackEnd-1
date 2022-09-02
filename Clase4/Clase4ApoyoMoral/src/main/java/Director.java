public class Director extends EmpleadoBanco{
    @Override
    public void procesarSolicitud(int monto) {
        if (monto > 200000){
            //aca se cortaría la cadena de responsabilidad, se gestiona la tarea.
            System.out.println("Listo bebe, yo como director me encargo de gestionarte el prestamo.");
        } else {
            //ahora si no lo puede hacer, se lo deriva a otro empleado
            //aca llama al siguiente empleado que puede llegar a gestionar la tarea, si hay alguien, osea si hay
            //un proximo empleado en cola, osea si !=null, si es distinto a null, entonces le dice okei, te paso
            //la responsabilidad, como traemeAlSigEmpleadoDeLaFila() retorna NEXT,y next era un objeto de tipo
            //empleado banco, le dice listo toma, procesa la soliciud. Y por parametro le pasa el monto del prestamo que quiere
            //sacar el cliente
            if(traemeAlSigEmpleadoDeLaFila() !=null) {
                traemeAlSigEmpleadoDeLaFila().procesarSolicitud(monto);
            }
        }
    }
}
