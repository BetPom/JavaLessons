import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        Integer years;
        System.out.print("Podaj swoje imię: ");
        name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.print("Ile masz lat? ");
        years = scanner.nextInt();
        System.out.printf("Masz %s lat", years);
        if (years >= 18) {
            System.out.println("\nMożesz kupić piwo");
        }
        else {
            System.out.println("\nNie możesz kupić piwa");
        }


    }
}
