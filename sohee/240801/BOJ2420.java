package BOJ.S240801;

import java.util.Scanner;

public class BOJ2420 {
    // (-2,000,000,000 ≤ N, M ≤ 2,000,000,000) 범위이기 때문에 `long`써야 함.
    // int 쓰니까 틀렸어 ㅠ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        a = sc.nextLong();
        b = sc.nextLong();
        long sub = Math.abs(a-b);
        System.out.println(sub);

    }
}
