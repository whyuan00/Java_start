
1. 문자열을 인덱스로 순회할경우 string.charAt(idx)로 순회 

```java

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
        String palindrom = sc.nextLine();
        
        if (palindrom.equals("0")){
            break;
        }
        boolean check = true;
        for (int i=0; i<palindrom.length(); i++){
            if (palindrom.charAt(i) != palindrom.charAt(palindrom.length()-i-1) ) {
                check = false;
            }
        }
        if (check) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        }

    }
}
