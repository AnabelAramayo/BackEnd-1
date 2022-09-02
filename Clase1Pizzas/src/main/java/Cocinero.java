public abstract class Cocinero {
    public void hacerPizza() {
        prepararMasa();
        preCocinarMasa();
        prepararIngredientes();
        agregarIngredientes();
        cocinarPizza();
        empaquetarPizza();
    }

    public abstract void prepararIngredientes();
    public abstract void agregarIngredientes();

    private void prepararMasa () {
        System.out.println("Estamos preparando la masa");
    }

    private void preCocinarMasa () {
        System.out.println("estamo precocinando la masa");
    }

    private void cocinarPizza() {
        System.out.println("estamos cocinando la pizza");
    }

    private void empaquetarPizza () {
        System.out.println("estamo empaquetando tu pizza");
    }
}


