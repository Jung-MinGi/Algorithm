# Spring 
* 자바 엔터프라이즈 애플리케이션 개발을 단순하게 해주는 오픈 소스 애플리케이션 프레임워크다
* 스프링을 사용하면 개발자는 애플리케이션의 비즈니스 로직을 작성하는데 더 집중할 수 있다.

## 스프링 IOC 컨테이너란
* 자바 애플리케이션은 서로 `의존관계(dependency)`인 객체들로 이루어져있다. `DI(생성자나 세터메서드를 이용하여 의존성을 만드는 디자인패턴)`로 의존관계를 형성한다.
* 스프링 컨테이너가 생성하고 관리하는 객체들을 **빈**이라 부른다. 의존관계를 만들고 관리하는 책임은 IOC컨테이너에게 있어 DI를 `IOC(Inversion of Control)`라고도 부른다.
```
//박지성 클래스는 Person에 의존한다
class 박지성{
  private Person person;
  
  public 박지성(Person person){
    this.person = person;
  }

}
class Person{
}
```
* 스프링 기반 애플리케이션에서 객체간의 의존관계에 대한 정보는 설정 메타데이터에 지정한다. 그러면 IOC컨테이너(이하 스프링 컨테이너라고 한다)는 설정 메타데이터를 읽어 클래스를 인스턴스화 시키고 그들의 의존관계를 주입한다.--->이 모든과정은 `리플렉션API`를 사용한다
* 위 코드를 XML형식으로 작성해보면
```
<bean id="person" class="Person클래스의 풀경로"/>

<bean id="박지성" class="박지성클래스의 풀경로">
  <constructor-arg ref="person"/>//id가 person인 빈 인스턴스를 박지성클래스의 생성자 인수로 전달한다
</bean>
```
* 설정 메타데이터를 스프링 컨테이너에게 제공하는 방법은 세가지가 있다.
  * XML--XML로 설정정보를 제공하려면 applicationcontext.xml파일을 만들어야 한다.
  * 애너테이션
  * 자바코드
* 스프링 Applicationcontext 객체는 스프링 컨테이너 인스턴스를 말한다.
  * 스프링에는 Applicationcontext를 구현해 놓았다. 어떤 Applicationcontext를 선택하느냐는 설정 메타데이터의 작성법과 애플리케이션의 유형에 따라 다르다.
  * ClassPathXmlApplicationContext,FileSystemXmlApplicationContext는 설정메타데이터를 xml로 작성하고 독립실행 애플리케이션에 적합
  * XmlWebApplicationContext는 메타데이터를 XML형태로 작성한 웹애플리케이션에 적합하다.
```
Applicationcontext context = new Applicationcontext("applicationcontext.xml의 경로");
//스프링 컨테이너 인스턴스가 생기면서 xml파일안에 있는 빈들이 인스턴스화된다는 의미
//빈에대한 접근은 context.getBean메서드로 접근가능
```
* 빈 팩토리는 스프링의 기본적인 빈 생성과 관리 기능을 제공하며, 애플리케이션 컨텍스트(스프링 컨테이너)는 빈 팩토리의 모든 기능을 포함하면서 추가적인 기능을 제공한다.
* 빈 스코프
    * 빈을 공유하기 위한 인스턴스를 하나만 만드는경우(싱글턴스코프)--default임
    * 빈이 요청될때마다 새로운 인스턴스를 만드는 경우(프로토타입 스코프)
***
## 애너테이션으로 빈 생성하기
* @Component-->클래스위에 작성 
* 애플리케이션에서는 컨트롤러,서비스,DAO에 따라 다른 애너테이션을 사용한다. 각각 @Controller, @Service, @Repository를 사용한다.
* 애너테이션을 붙여주고 스프링의 클래스경로 스캐닝을 활성화하면
스프링 컨테이너가 해당 패키지를 돌면서 빈클래스를 자동으로 컨테이너에 등록한다 
> 클래스경로 스캐닝 활성화 시키는 법 <br>
```<context:component-scan base-package=""/>```
*  xml에 미리 의존관계를 설정하지 못하기 때문에 의존관계를 주입하는 방법도 애너테이션을 이용한다
* @Autowired
    * 가장 대표적인 의존관계 애너테이션 
* (required = false)라고 두면 자동연결시 예외발생 방지
## 자바코드로 빈 생성하기
* @Configuration후 안에 메서드에 @Bean을 붙여주면<br>
```<bean id="" class="클래스의 풀경로"/>```와 같은 의미다
* @ComponentScan == ```<component-scan>```


## 출처
* 애시시 사린, 제이 샤르마, [배워서 바로 쓰는 스프링 프레임워크], 오현석 옮김, 한빛미디어
