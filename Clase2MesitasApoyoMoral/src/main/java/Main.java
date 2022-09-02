public class Main {
    public static void main(String[] args) {
    MenuInfantil cajitaFeliz = new MenuInfantil(500, true);
    MenuClasico bigMac = new MenuClasico(500);
    MenuVegetariano veggieBurguer = new MenuVegetariano(200,50);

        System.out.println("MENU INFANTIL:");
        cajitaFeliz.menu();
        System.out.println("MENU CLASICO: ");
        bigMac.menu();
        System.out.println("MENU VEGETARIANO: ");
        veggieBurguer.menu();

    }
}
