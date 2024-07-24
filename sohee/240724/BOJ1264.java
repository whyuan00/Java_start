import java.util.Scanner;

public class BOJ1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();  // Read input

            if (sentence.equals("#")) {
                break;
            }

            int cnt = 0;
            String vowels = "aeiouAEIOU";

            for (int i = 0; i < sentence.length(); i++) {
                char currentChar = sentence.charAt(i); // 문자열을 순회함
                if (vowels.contains(String.valueOf(currentChar))) {
                    cnt++;
                }
            }
            System.out.println(cnt); 
        }

        scanner.close();
    }
}
