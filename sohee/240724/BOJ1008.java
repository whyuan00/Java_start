import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        System.out.println(A / B);

        scanner.close();
        // close()를 안 쓰면 .. Resource leak : 'scanner' is never closed
    }
}
