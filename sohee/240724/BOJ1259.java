import java.util.Scanner;

public class BOJ1259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String origin = scanner.nextLine();

            if (origin.equals("0")) {
                break;
            }

            StringBuffer comp = new StringBuffer(origin).reverse();

            // if(origin == comp) 라고 할 뻔
            if (origin.equals(comp.toString())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        scanner.close();
    }
}
