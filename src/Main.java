import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 9: ");
        int length = scanner.nextInt();
        Pattern createPattern = new Pattern();
        createPattern.returnPattern(length);
    }
}
