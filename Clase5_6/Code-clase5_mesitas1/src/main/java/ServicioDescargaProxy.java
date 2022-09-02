public class ServicioDescargaProxy implements IServicio{

    private Usuario usuario;
    private ServicioDescarga serviciodescarga;

    public ServicioDescargaProxy(Usuario usuario, ServicioDescarga serviciodescarga) {
        this.usuario = usuario;
        this.serviciodescarga = serviciodescarga;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ServicioDescarga getServiciodescarga() {
        return serviciodescarga;
    }

    public void setServiciodescarga(ServicioDescarga serviciodescarga) {
        this.serviciodescarga = serviciodescarga;
    }

    @Override
    public String descargar(String cancion) {
        if(usuario.getTipoUsuario().equalsIgnoreCase("Premium")){
            return serviciodescarga.descargar(cancion);

        } else{
            return "alto pobre. No podés descargar, buscate un Wifi";
        }

    }
}
