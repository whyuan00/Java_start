package BOJ.S240819;
import java.util.Scanner;

public class BOJ2754 {
    // 학점 계산
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        double score = 0.0;

        switch (grade.charAt(0)) {
            case 'A': score = 4.0; break;
            case 'B': score = 3.0; break;
            case 'C': score = 2.0; break;
            case 'D': score = 1.0; break;
            case 'F': score = 0.0; break;
        }

        // 길이로 제한을 두지 않으면 런타임 에러 (StringIndexOutOfBounds)가 나는데
        // 예시에는 없지만 A, B, C 이렇게 단일 문자만 입력하는 경우도 있어서인듯요
        if (grade.length() > 1) {
            switch (grade.charAt(1)) {
                case '+': score += 0.3; break;
                case '-': score -= 0.3; break;
            }
        }

        System.out.println(score);
    }
}