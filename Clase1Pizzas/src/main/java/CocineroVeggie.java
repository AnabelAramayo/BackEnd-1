public class CocineroVeggie extends Cocinero{
    @Override
    public void prepararIngredientes() {
        System.out.println("Preparando ingredientes: verduras");
    }

    @Override
    public void agregarIngredientes() {
        System.out.println("Agregando verduras");
    }
}
