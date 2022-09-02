import org.junit.jupiter.api.Disabled;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FiguraTest {

    @Test
    public void calcularAreaCuadrado() {
        Figura cuadrado = new Figura("cuadrado",10.);
        assertEquals(100., cuadrado.calcularArea(), "Esta mal");
    }

    @Test
    public void calcularAreaCuadradoTwo() {
        Figura cuadrado = new Figura("cuadrado",10.);
        assertEquals(100.0002, cuadrado.calcularArea(), "Esta mal");
    }

    @Test
    public void calcularAreaCirculo() {
        Figura circulo = new Figura("circulo", 5.2);
        assertEquals((5.2*5.2)*Math.PI, circulo.calcularArea(), "No da el valor correcto");
    }
}