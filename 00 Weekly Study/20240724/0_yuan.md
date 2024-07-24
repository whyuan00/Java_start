# string 의 메서드들 

 - 문자열 순회 방법: string.charAt(idx)

```java
  for (int i=0; i<palindrom.length(); i++){
            if (palindrom.charAt(i) != palindrom.charAt(palindrom.length()-i-1) ) {
                check = false;
            }
        }

```

 - 스트링 메서드) 대소문자 변환 : toLowerCase() , toUpperCase()

 ```java
    String sentence = sc.nextLine().toLowerCase(); "ABD" abd
```

 - 비교 연산자 : ==와 equals
 - 
    == 는 주소값을 비교, a.equals(b) 는 값 자체 비교 메서드 

    -> JVM 은 ""로 만들어진 String과 new로 만들어진 String 객체를 다른 곳에 저장함
    따라서 특히 문자열의 경우 == 로 계산하면 잘못된 값이 나올 우려 있음 

    [String타입 특징 이해하기!](https://inpa.tistory.com/entry/JAVA-%E2%98%95-String-%ED%83%80%EC%9E%85-%ED%95%9C-%EB%88%88%EC%97%90-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0-String-Pool-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%B9%84%EA%B5%90)

stringl a = "3"

a.valueof(int)

 - 기본 자료형 문자열로 바꾸기 : String.valueOf( __ )

