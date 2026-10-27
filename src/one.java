import java.util.Scanner;

public class one {

    public static void printStrip(int n, char symbol) {
        for (int i = 0; i < n; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        printStrip(n, '#');

        scanner.close();
    }
}