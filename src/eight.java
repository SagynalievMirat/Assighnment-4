import java.util.Scanner;

public class eight {

    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String binary = decimalToBinary(n);
        System.out.println("Binary = " + binary);

        scanner.close();
    }
}
