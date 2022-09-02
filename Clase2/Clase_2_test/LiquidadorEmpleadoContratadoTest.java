package Clase_2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LiquidadorEmpleadoContratadoTest{

    @Test
    public void liquidarSueldoEmpleadoContratado() {
        EmpleadoContratado contratado = new EmpleadoContratado("Martin", "Martini", "123", 10, 1000);
        LiquidadorEmpleadoContratado liquidador = new LiquidadorEmpleadoContratado(contratado);
        assertEquals("La liquidación generada es un documento digital. Saldo a liquidar: 10000.0"
                , liquidador.liquidarSueldo(contratado));

    }
}