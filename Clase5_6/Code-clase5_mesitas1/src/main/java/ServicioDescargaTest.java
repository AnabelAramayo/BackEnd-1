import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServicioDescargaTest {

    @Test
    public void descargarCancionPremium(){
        Usuario usuario1 = new Usuario(123, "Free");
        ServicioDescargaProxy serviciodescarga1 = new ServicioDescargaProxy(usuario1, new ServicioDescarga());

        String resultado = serviciodescarga1.descargar("La pibita");
        String resultadoEsperado = "alto pobre. No podés descargar, buscate un Wifi";

        Assertions.assertEquals(resultadoEsperado, resultado);

    }
}
