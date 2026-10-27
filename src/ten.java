import java.util.Scanner;

public class ten {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = gcd(a, b);
        System.out.println("GCD = " + result);

        scanner.close();
    }
}
