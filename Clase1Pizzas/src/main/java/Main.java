public class Main {
    public static void main(String[] args) {
        Cocinero noVeggie = new CocineroNoVeggie();
        Cocinero veggie = new CocineroVeggie();

        System.out.println("Cocino no veggie:");
        noVeggie.hacerPizza();
        System.out.println("Cocinero veggie:");
        veggie.hacerPizza();
    }
}
