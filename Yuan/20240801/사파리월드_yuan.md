 - int는 20억까지므로 넘어가면 long 자료형 써야함

 - Math 관련 패키지는 import java.lang.Math;

 - import java.util.*;
    import java.lang.*;


---

```java
import java.util.Scanner;
import java.lang.Math;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int diff = n-m;
        System.out.println(Math.abs(diff));

    }
}
```