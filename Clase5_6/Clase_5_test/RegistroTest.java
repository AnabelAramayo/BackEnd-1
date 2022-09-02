package Clase_5;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {

    @Test
    public void vacunarPersona(){
        Persona persona = new Persona("Jeisson","Lopez","12345678","Jensen",new Date(2022-1900,5-1,19));
        Registro registro = new RegistroProxy() ;
        String resEsperada = "Jeisson con el dni 12345678 se vacuno ";
        String respuesta = registro.vacunar(persona);
        assertEquals(resEsperada,respuesta);
    }

}