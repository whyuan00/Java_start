1. sc.nextLine()으로 받으면 string 타입으로 받아지기때문에, 
    char array 로 바꾸는 메서드 toCharArray()가 있음 
    (이렇게 안하고 string의 toCharAt(idx)으로 순회하는 것도 가능)
2. char 과 int 는 프린트에서 즉시 형식 변환 가능
   - print((char) 숫자) 하면 숫자를 char 로 바꿔서 출력
   - print((int) 캐릭터) 하면 문자를 int 로 바꿔서 출력해줌 


```java
import java.util.*;
import java.lang.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sting 받아서 chararray로 바꿔주기
        char[] char_arr = sc.nextLine().toCharArray();
//        System.out.println(Arrays.toString(char_arr));
        for (int i=0; i< char_arr.length; i++){
            // 아스키코드 num 으로 변환
            int num = char_arr[i];

            // 아스키코드 기준 97(a)로 조건 설명, 다시 char로 바꿔서 프린트
            if (num>=97){
                num-=32;
                System.out.print((char) num);
            }
            else{
                num+=32;
                System.out.print((char) num);
            }
        }
    }
}
```