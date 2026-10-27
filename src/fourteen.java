import java.util.Scanner;

public class fourteen {

    public static long transformDigits(long n) {
        String s = Long.toString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 == 0) {
                digit++;
            } else {
                digit--;
            }
            sb.append(digit);
        }
        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long result = transformDigits(n);
        System.out.println(result);

        scanner.close();
    }
}
