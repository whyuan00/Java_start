
1. java는 Main 클래스로 제출한다
2. float 는 7자리 수까지 정밀도, 
    double은 15자리 수까지 정밀도
    (조건에 따라 오차를 10^-9 이하로 만들려면 double 써야함)

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print(a/b);

    }
}

```
