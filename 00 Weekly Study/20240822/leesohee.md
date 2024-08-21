# 1. 수 정렬하기2

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ2751_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int num : arr) {
            // 출력
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

```

## BufferedReader

-   입력 스트림에서 문자를 읽는 함수
-   문자나 배열, 라인들을 효율적으로 읽기 위해 문자들을 버퍼에 저장한 후 읽는 방식을 수행
-   버퍼의 사이즈는 사용자가 지정할 수 있으며, 지정하지 않으면 `defailt`사이즈가 적용된다.

<hr>

-   `Buffer` : 데이터를 전송할 때, 일시적으로 그 데이터를 보관하는 임시메모리 영역
    입출력 속도 향상을 위해 사용된다.
-   `Buffer flush` : 버퍼에 남아 있는 데이터를 출력시킨다.(버퍼를 비운다)
-   `BufferedReader` : 버퍼를 이용한 입력
-   `BufferedWriter` : 버퍼를 이용한 출력
<hr>

### readLine()

-   `Enter`만으로 경계를 인식

## BufferedWriter

-   `buffer`에 저장되어 있던 데이터가 한 번에 출력
-   버퍼를 정의해줬기 때문에 반드시 `flush()`와 `close()`를 호출해 종료해줘야 함
<hr>

### Scanner과 BufferedReader 차이

-   대표적인 차이는 `속도`다. 많은 양의 데이터를 받을 때에 `BufferedReader`가 확연하게 높은 성능을 보여줌.
-   `Scanner`의 버퍼 사이즈는 약 1kb로 입력과 동시에 전달이 되는 반면, `BufferedReader`의 버퍼 사이즈는 8kb로 큰 용량을 가져 입력받은 값들을 저장해두었다가 한 번에 전송하기 때문.
-   `Scanner`는 입력을 읽는 과정에서 내부의 많은 과정들을 거쳐 더욱 속도가 느림.

<br>

# 2. 그룹단어 체커

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++){
            String word = br.readLine();
            char[] arr = new char[word.length()];
            int idx = 0;

            boolean isGroupWord = true;

            // 단어 문자를 순회하면서
            for (int j = 0; j < word.length(); j++){
                char now = word.charAt(j);

                // 이미 있는지 확인하는 변수
                boolean found = false;

                // 문자가 이미 arr에 있는지 확인을 해
                for (int k = 0; k < idx; k++) {
                    if (arr[k] == now) {
                        found = true;
                        break;
                    }
                }

                // 1. 문자가 arr에 이미 있는 경우
                if (found) {
                    // 1-1. 문자가 연속된 문자가 아니라면 break
                    if (arr[idx - 1] != now) {
                        isGroupWord = false;
                        break;
                    }
                }
                // 2. 문자가 arr에 없는 경우
                else {
                    arr[idx++] = now;
                }
            }

            if (isGroupWord) {
                cnt++;
            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
```
