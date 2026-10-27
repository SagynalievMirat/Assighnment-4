import java.util.Scanner;

public class four {

    public static void printMatrix(int n, int m) {
        int current = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(current + (j == m - 1 ? "" : " "));
                current++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printMatrix(n, m);
        scanner.close();
    }
}
