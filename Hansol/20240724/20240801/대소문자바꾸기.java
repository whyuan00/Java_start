import java.util.Scanner;

public class 대소문자바꾸기 {
    public static void main(String[] args) {
        // 문자열 포함 여러 입력을 받을때는 Scanner 클래스 사용
        Scanner sc = new Scanner(System.in);
        // next() : 문자 혹은 문자열을 공백 기준으로 한 단어, 혹은 한 문자씩 입력을 받는다.
        String str = sc.next();
        // 문자열이 한 개 이상 있어서 합쳐야 할 때
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
