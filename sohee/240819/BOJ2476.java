package BOJ.S240819;

//        같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//        같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//        모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
//        예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그 중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//
//        N(2 ≤ N ≤ 1,000)명이 주사위 게임에 참여하였을 때, 가장 많은 상금을 받은 사람의 상금을 출력하는 프로그램을 작성하시오.
import java.util.Scanner;
public class BOJ2476 {
    // 주사위 게임

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // N x 3 크기의 2차원 배열 만들기
        int[][] numbers = new int[N][3];

        for (int i = 0; i < N; i++) {
            numbers[i][0] = sc.nextInt();
            numbers[i][1] = sc.nextInt();
            numbers[i][2] = sc.nextInt();
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            // 세 개 눈이 모두 같으면 10,000원+(같은 눈)×1,000원
            if(numbers[i][0] == numbers[i][1] && numbers[i][1] == numbers[i][2]){
                arr[i] = 10000 + numbers[i][0] * 1000;
            }

            // 두 개 눈이 같으면 1,000원+(같은 눈)×100원
            else if(numbers[i][0] == numbers[i][1] || numbers[i][0] == numbers[i][2] || numbers[i][1] == numbers[i][2]){
                int same = 0;
                if (numbers[i][0] == numbers[i][1] || numbers[i][0] == numbers[i][2]) {
                    same = numbers[i][0];
                } else {
                    same = numbers[i][1];
                }
                arr[i] = 1000 + same * 100;
            }

            // 모두 다른 경우 가장 큰 눈 × 100원
            else {
                int max = Math.max(numbers[i][0], Math.max(numbers[i][1], numbers[i][2]));
                arr[i] = max * 100;
            }
        }

        // 최대 상금 찾기
        int maxPrize = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > maxPrize) {
                maxPrize = arr[i];
            }
        }

        System.out.println(maxPrize);

        sc.close();  // Scanner 닫기
    }
}
