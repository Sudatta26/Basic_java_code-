import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        System.out.println("ENTER THE FRUIT :");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "apple" -> System.out.println("APPLE JUICE");
            case "Grapes" -> System.out.println("GRAPES JUICE");
            case "orange" -> System.out.println("ORANGE JUICE");
            default -> System.out.println("INVALID INPUT !!!!!!!");
        }
    }
}
