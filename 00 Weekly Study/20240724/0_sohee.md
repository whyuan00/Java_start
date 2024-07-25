## StringBuffer

> 문자열을 추가하거나 변경할 때 주로 사용하는 자료형

### StringBuffer의 다양한 method

#### 1. append

```java
StringBuffer sb = new StringBuffer();
sb.append("hello");
sb.append(" ");
sb.append("jump to java");
String result = sb.toString();
System.out.println(result);
```

vs. `StringBuffer`가 아닌 `String`을 사용하여 자료형 변경

```java
String result = "";
result += "hello";
result += " ";
result += "jump to java";
System.out.println(result);
```

- 두 예제는 결과는 같지만 내부적으로 객체를 생성하고 메모리를 사용하는 과정이 다르다. `StringBuffer`의 경우 객체를 한 번만 생성하지만, `String`의 경우 `+`연산이 있을 때마다 새로운 객체가 만들어진다.
- `String` 자료형은 값이 한 번 생성되면 변경할 수가 없다. `toUpperCase`와 같은 메서드를 보면 문자열이 변경되는 것처럼 생각할 수도 있지만 해당 메서드를 수행할 때 또 다른 `String` 객체를 생성하여 리턴할 뿐이다. 반면에 **_ `StringBuffer` 자료형 _** 은 값을 변경할 수 있으므로 생성된 값을 언제든지 수정할 수 있다.

- `StringBuffer` 자료형은 `String` 자료형보다 무거운 편에 속한다. `new StringBuffer()`로 객체를 생성하면 `String`을 사용할 때보다 메모리 사용량도 많고 속도도 느리다. 따라서 **_ 문자열을 추가하거나 변경하는 작업이 많으면 StringBuffer를, 적으면 String을 사용하는 것이 유리 _** 하다.

### 2. insert

원하는 위치에 문자열을 삽입할 수 있음

```java
StringBuffer sb = new StringBuffer();
sb.append("jump to java");
sb.insert(0, "hello ");
System.out.println(sb.toString());
```

> hello jump to java

### 3. substring

substring(시작위치, 끝 위치) 의 문자열을 뽑아냄

```java
StringBuffer sb = new StringBuffer();
sb.append("Hello jump to java");
System.out.println(sb.substring(0, 4));
```

> Hell
