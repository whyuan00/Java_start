# 스코프, 형변환

## 지역 변수와 스코프

> 지역변수는 특정 지역(자신이 선언된 코드블럭 내)에서만 사용할 수 있는 변수 

## 스코프 존재 이유

- 잠깐 사용되는 변수의 경우, 예를 들면 if 문 안에서만 사용되는 경우에는 if 문 안에 변수를 선언하는 것이 효율적이다.

## 자동 형변환

- 형변환
    - 작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다.

## 명시적 형변환

- 큰 범위에서 작은 범위 대입은 명시적 형변환이 필요하다.

```java
intValue = (int) doubleValue;
```

# 훈련

## scanner

- scanner 선언

```java
package scanner;

import java.utils.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요.");
        String str = scanner.nextLine();
    }
}
```

