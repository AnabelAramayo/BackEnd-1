package Clase_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IGrillaDePeliculasTest {

    @Test
    public void peliculasArgentinas() throws PeliculaNoHabilitadaException {
        GrillaDePeliculasProxy proxy = new GrillaDePeliculasProxy(new GrillaDePeliculas());
        proxy.setLaIP(new IP(48,23,123,123));
        String resultado = "";
        try{
           resultado=  proxy.getPelicula("No way home").getLink();
        }
        catch (PeliculaNoHabilitadaException e){
            System.out.println(e);
        };

        assertEquals("link1",resultado);

    }

    @Test
    public void peliculasColombianas(){
        GrillaDePeliculasProxy proxy = new GrillaDePeliculasProxy(new GrillaDePeliculas());
        proxy.setLaIP(new IP(123,23,123,123));
        String resultado = "";
        try{
            resultado=  proxy.getPelicula("El Paseo 5").getLink();
        }
        catch (PeliculaNoHabilitadaException e){
            System.out.println(e);
        };

        assertEquals("link3",resultado);

    }
    @Test
    public void peliculasBrasileras(){
        GrillaDePeliculasProxy proxy = new GrillaDePeliculasProxy(new GrillaDePeliculas());
        proxy.setLaIP(new IP(99,23,123,123));
        String resultado = "";
        try{
            resultado=  proxy.getPelicula("Love and Thunder").getLink();
        }
        catch (PeliculaNoHabilitadaException e){
            System.out.println(e);
        };

        assertEquals("link2",resultado);

    }

}