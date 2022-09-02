import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SerieProxyTest {

    @Test
    public void testeandoAndo() throws SerieNoHabilitadaException {
        SerieProxy serieproxy = new SerieProxy(6, new Serie("got"));
        String resultado = serieproxy.getSerie();
        String resultadoEsperado = "www.got";

        Assertions.assertEquals(resultadoEsperado, resultado);

    }

}
