// activity to understand the use of Finally
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(x + " / " + y + " = " + z);
        } catch (ArithmeticException ex) {
            System.out.println("--- Catch Block ---");
            System.out.println(ex.toString());
        } finally {
            System.out.println("--- Finally Block ---");
            System.out.println("Application Designed & Developed by: ");
            System.out.println("Team @ Muhammad Coders");
            sc.close();
        }
        System.out.println("----- DOME -----");
    }
}