- bufferedRedaer

  - buffer 단위로 전송할 것
  - 입력을 모아두었다가 경계값(엔터) 받을때 버퍼를 한번에 보내줌

- inputstreamReader

  - char 단위로 입력값 받을 것

- IOException 처리

  - 비정상적 입력 취소로 인한 예외처리를 하기 위해 컴파일러에 예외 상황 발생시 안내 역할 함

- sort는 배열 정렬하는 메소드로 원본 정렬

```java
import java.io.*;
import java.util.*;

public class 수정렬하기2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
```

nowAlpha 가 알파벳 소문자일때 아식스 코드로 바꿔서 배열에 방문처리

```java
 - alphaArr = int [150]; //초기화
 - lphaArr[(int)nowAlpha] = 1;
```
