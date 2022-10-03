import java.math.BigInteger;
import java.util.Scanner;

public class Lesson1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        BigInteger years;
        System.out.print("Podaj swoje imię: ");
        name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.print("Ile masz lat? ");
        years = scanner.nextBigInteger();
        System.out.printf("Masz %s lat", years);
        years = scanner.nextBigInteger();
        System.out.printf("Masz %s lat", years);

    }
}
