public class Main {

    //This is menu method, it is clear by its name that, this method shows the menu of Coffee Bar
    public static void menu() {
        System.out.println("\t\t\t\t+----------------------------------------------------+");
        System.out.println("\t\t\t\t                Coffee Bar + BakeShop              ");
        System.out.println("\t\t\t\t            1. Espresso           $2.50");
        System.out.println("\t\t\t\t            2. Americano          $2.75");
        System.out.println("\t\t\t\t            3. Cappuccino         $3.25");
        System.out.println("\t\t\t\t            4. Latte              $3.50");
        System.out.println("\t\t\t\t+----------------------------------------------------+");
    }

    public static void order() {

    }

    //This is the main method, so everything happens here
    public static void main(String[] args) {
        //Calling the menu
        menu();
    }
}
