public class Main {
    public static void main(String[] args) {
        //creo mis empleados bancarios

        EmpleadoBanco ejecutivoJuan1 = new EjecutivoDeCuenta();
        EmpleadoBanco gerenteDani2 = new Gerente();
        EmpleadoBanco directorStark3 = new Director();

        //acá digo quien le sigue a quien, cual es el orden de mi cadena, de mis capas
        gerenteDani2.establecerSigEmpleado(directorStark3);
        ejecutivoJuan1.establecerSigEmpleado(gerenteDani2);

        //entonces empiezo con mi primer empleado, mi ejecutivo Juan, mi primer eslavon
        //Juan, necesito un pestamo de 78000, vos me lo podes gestionar?
        ejecutivoJuan1.procesarSolicitud(78000);
    }
}
