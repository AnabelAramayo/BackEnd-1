public class CocineroNoVeggie extends Cocinero{
    @Override
    public void prepararIngredientes() {
        System.out.println("Preparando ingredientes: jamon");
    }

    @Override
    public void agregarIngredientes() {
        System.out.println("Agregando jamon");
    }
}
