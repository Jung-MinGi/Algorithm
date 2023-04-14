## 사용자 정의 어노테이션 만들어보기

### 어노테이션이란
* 사전적의미는 '주석'을 의미한다
* 자바의 어노테이션은 소스코드에 추가해서 사용할 수 있는 메타데이터의 일종이다
* @를 붙여서사용한다
* 컴파일,런타임 모두 사용가능하다

## 어노테이션 정의하는법

어노테이션 파일을 하나 생성

* @Retention을 하나 붙여준다

    * 자바 컴파일러가 내가 만든 어노테이션을 다루는방법을 명시할수 있다
        * Rentention.Policy.SOURCE-클래스파일까지 못감
        * Rentention.Policy.CLASS-클래스파일까지만 감
        * Rentention.Policy.RUNTIME-JVM이 계속 참조가능

* @Target 
    * 어노테이션이 적용될 위치 명시

 ```
@Target({ ElementType.METHOD }) 
@Retention(RetentionPolicy.RUNTIME) 
public @interface MyAnnotation {
}
```