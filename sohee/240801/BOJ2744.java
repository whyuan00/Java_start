package BOJ.S240801;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char now;
        int i = 0;

        String answer = "";

        while (i < str.length()){
            now = str.charAt(i);

            if (Character.isUpperCase(now)){
                answer += Character.toLowerCase(now);
            }else {
                answer += Character.toUpperCase(now);
            }

            i ++;
        }
        System.out.println(answer);
    }
}
