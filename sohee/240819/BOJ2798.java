package BOJ.S240819;

import java.util.Scanner;

public class BOJ2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 카드 개수
        int M = sc.nextInt();  // 목표 숫자

        // 카드 값들을 저장할 배열
        int[] cards = new int[N];

        // 카드 값 입력받기
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        int maxNum = 0;
        for (int a = 0; a < N; a++){
            for (int b = a+1;  b < N; b ++){
                for (int c = b+1; c <N; c++){
                    int now = cards[a] + cards[b] + cards[c];
                    if (now > maxNum && now <= M){
                        maxNum = now;
                    }
                }
            }
        }
        System.out.print(maxNum);
    }
}