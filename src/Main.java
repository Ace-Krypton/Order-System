import java.util.Scanner;
public class Main {

    //Static Scanner() method. I used static because other methods can see my Scanner();
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static String readString;
    public static double choose,quantity = 1;
    public static double total = 0,pay;

    //This is for clearing screen with key press
    public static void clearScreenWithPress() {
        readString = input.nextLine();

        if (readString.isEmpty()) {
            System.out.print("\033\143");
        }
    }

    //This is clearing screen without pressing key
    public static void clearScreen() {
        System.out.print("\033\143");
    }

    //This is menu method, it is clear by its name that, this method shows the menu of Coffee Bar
    public static void menu() {
        System.out.println("\t\t\t\t+----------------------------------------------------+");
        System.out.println("\t\t\t\t                Coffee Bar + BakeShop              ");
        System.out.println("\t\t\t\t            1. Espresso           $2.50");
        System.out.println("\t\t\t\t            2. Americano          $2.75");
        System.out.println("\t\t\t\t            3. Cappuccino         $3.25");
        System.out.println("\t\t\t\t            4. Latte              $3.50");
        System.out.println("\t\t\t\t            0. CANCEL                  ");
        System.out.println("\t\t\t\t+----------------------------------------------------+\n");
        System.out.println("Press <Enter> for clearing screen");

        clearScreenWithPress();
    }

    //Order method
    public static void order() {
        System.out.println("""
                            Press '1' for Espresso
                            Press '2' for Americano
                            Press '3' for Cappuccino
                            Press '4' for Latte
                            Press '0' for CANCEL""");

        System.out.print("\n\n-> ");

        choose = input.nextDouble();

        //Conditions
        switch ((int) choose) {
            case 1 -> {
                //Buying process
                clearScreen();
                System.out.println("+++ You chose Espresso +++");
                System.out.print("How many Espresso you want to buy? -> ");
                quantity = input.nextDouble();
                total += (quantity * 2.5);
                
                //If user wants to buy again :
                System.out.println("Do you want to buy again?");
                System.out.print("Press 'Y' for 'Yes' and 'N' for 'No' -> ");
                again = input.next();
                
                //Condition
                if (again.equalsIgnoreCase("Y"))
                    order(); //This is recursive method, it means this method calls itself
                System.out.println("Total price is: " + total);
            }

        }
    }

    //This is the main method, so everything happens here
    public static void main(String[] args) {
        //Calling the menu
        menu();
        //Calling the order
        order();


    }
}
