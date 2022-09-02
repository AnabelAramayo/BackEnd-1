package Clase1Asinc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {
    @Test
    public void personaIsOlder() {
        Persona rick = new Persona("Rick", "Carter", "rick@twd.com", 45);
        Persona daryl = new Persona("Daryl", "Mendoza", "daryl@twd.com", 18);
        Persona wanda = new Persona("Wanda", "Maximoff", "wandavision@marvel.com", 15);

        boolean isOlder = rick.isOlder();
        boolean isOlder1 = daryl.isOlder();
        boolean isOlder2 = wanda.isOlder();

        assertEquals(true, isOlder);
        assertEquals(true, isOlder1);
        assertEquals(false, isOlder2); //este nos da mal
    }
}