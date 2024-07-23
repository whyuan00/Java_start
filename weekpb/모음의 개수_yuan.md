
1. ""는 String, '' 는 char 

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        String sentence = sc.nextLine().toLowerCase();
        if (sentence.equals("#")){
            break;
        }
        int cnt = 0;
        for (int i=0; i<sentence.length(); i++){
            char alpha = sentence.charAt(i);
            if ( alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ){
                cnt ++;
            }
        }
            System.out.println(cnt);


        }

    }
}
```
