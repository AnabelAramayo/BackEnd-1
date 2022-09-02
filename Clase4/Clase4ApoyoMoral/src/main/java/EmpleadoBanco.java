public abstract class EmpleadoBanco {
    private EmpleadoBanco next;
    // se crea este atributo EmpleadoBanco llamado NEXT para que sea reutilizado en los metodos
    // sin este objeto de tipo EmpleadoBanco deberíamos crear por ejemplo: private Director next;
    // esto si bien lo podríamos utilizar, solo nos va a servir para ir a la capa de Director, y cuando queramos
    // ir a la capa de gerente no vamos a poder, vamos a tener que crear un metodo nuevo, y así por cada capa
    // por lo tanto, para poder reutilizar el codigo, y siendo las 3 capas Empleados de Banco, utilizamos el objeto
    // EmpleadoBanco (en este caso llamado next) para hacer referencia general a las capas y así en el método
    // decirle que si no encuentra solución en una capa, siga con la siguiente.

    public abstract void procesarSolicitud(int monto);

    //Estoy haciendo el método para que sea aplicable en la 3 clases (ejecutivo, gerente y director)
    //para que pueda utilizarse en las 3 clases sin tener inconvenientes
    //se hace de esta manera, cosa que si hay muchas más clases no haya inconvenientes
    //además esto hace que se pueda reutilizar el codigo y no andar escribiendo repetitivamente

    //establecerSigEmpleado es el método que va a ser reutilizado en mi main para crear la cadena de responsabilidad
    //por eso el parametro tiene que ser de tipo EmpleadoBanco, por que las 3 clases al ser hijas de EmpleadoBanco, lo son,
    //son empleados de banco.

    // aca establezco cual sería el proximo empleado en la fila, el siguiente que deberia ver si puede resolver el problema
    // setigEmpleado
    public void establecerSigEmpleado(EmpleadoBanco empleado) {
        next = empleado;
    }


    //aca como ya lo tengo establecido, le digo okei, a ver cual es? y le pido que me lo muestre
    //getSigEmpleado
    public EmpleadoBanco traemeAlSigEmpleadoDeLaFila(){
        return next;
    }

}
