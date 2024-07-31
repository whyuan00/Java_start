## 1. 2420 사파리월드

#### 코드

```java
import java.util.Scanner;

public class BOJ2420 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        a = sc.nextLong();
        b = sc.nextLong();
        long sub = Math.abs(a-b);
        System.out.println(sub);

    }
}
```

### A. 절대값 구하기

`Math.abs()`를 통해 절대값을 구할 수 있음.

### B. `long` vs `Long`

#### long

-   long은 기본 데이터 유형으로, 소문자 'l'을 사용하여 선언.
-   long은 정수형 숫자를 표현하는 데 사용되며, 특히 매우 큰 범위의 정수를 다룰 때 유용. 그러나 소수점 이하의 숫자를 다루는 데는 적합하지 않음.

#### Long

-   Long은 long의 래퍼 클래스로, 대문자 'L'을 사용하여 선언.
-   Long은 long과 마찬가지로 정수형 숫자를 표현하는 데 사용되지만, 추가적으로 'null' 값을 가질 수 있음.

## 2. 2744 대소문자 바꾸기

#### 코드

```java
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
```

문자를 순회하며 각 `char`가 대문자인지, 소문자인지 판단한다. 대문자인 경우 `toLowerCase`로, 소문자인경우 `toUpperCase`로 바꾸어 `answer` 에 더한다.

## 5597 과제 안 내신 분

#### 코드

```java
import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] students = new int[30];

        // 30명 중 출석부 번호가 들어온 곳 1로 표시
        for (int i = 0 ; i < 28 ; i++) {
            int num = sc.nextInt();
            students[num-1] = 1;
        }

        for (int i = 0 ; i < students.length ; i++) {
            if (students[i] != 1) {
                System.out.println(i+1);
            }
        }

    }
}
```

### A. 배열 생성하기

```java
int[] 배열이름 = new int[몇 칸];
```
