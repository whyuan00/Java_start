
```java
import java.util.*;
import java.lang.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 30개 어레이 만들어서
        int[] arr = new int[31];
        int i = 0;
        while (i <28){
            int idx = sc.nextInt();
            arr[idx] = 1;  // 받은 번호의 idx 에 1 저장,
            i++;
        }
        // 0인 idx 출력
        int print_cnt = 0;
        for (int j=1; j<arr.length; j++){
            if ( arr[j] !=1 ){
                System.out.println(j);
                print_cnt++;
            }
            if (print_cnt ==2){
                break;
            }
        }

    }
}
```