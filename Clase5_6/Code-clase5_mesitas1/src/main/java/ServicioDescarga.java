public class ServicioDescarga implements IServicio {


    @Override
    public String descargar(String cancion) {
        return "Canción " + cancion + " descargada!, no eres pobre";

    }
}
