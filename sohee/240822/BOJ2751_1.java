package BOJ.S240822;

import java.util.Arrays;
import java.util.Scanner;

// 시간 초과
public class BOJ2751_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i ++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int num : arr) {
            System.out.println(num);
        }
        sc.close();
    }
}
