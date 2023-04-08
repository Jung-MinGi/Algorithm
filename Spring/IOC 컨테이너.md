
## DI
  * 객체 간의 의존 관계를 생성자 인수나 세터 메서드 인수로 명시하고 객체를 생성할 때 생성자 OR 세터를 통해 의존 관계를 주입하는 방식을 따르는 디자인 패턴이다.
  * `IOC`가 애플리케이션에 존재하는 객체를 생성하고 의존 관계를 주입하는 일을 담당한다.
    * `스프링컨테이너(IOC)`가 생성하고 관리하는 `애플리케이션 객체`들을 `빈`이라고 부른다.
  * 따라서, 개발자가 객체를 책임지지않기 때문에 객체를 관리하기위한 디자인 패턴을 구현할 필요가 없어진다. 객체들에 대한 책임은 온전히 `스프링 컨테이너`에게 있어
  이를 `제어의 역전(IOC)`라고 부른다.
  * IOC가 XML메타데이터를 읽어 들여 빈을 만들고 의존 관계를 주입한다.
  > XML <----IOC ---->빈생성

* 스프링 컨테이너가 읽어들일 설정 메타데이터를 설정하는 방법
  * XML 
    * 애플리케이션 설정 메타데이터를 xml로 제공하려면 애플리케이션객체(그냥 자바 클래스임)와 객체간의 의존관계가 들어있는 applicationContext.xml에 등록해야한다.
    * xml태그에 대한 설명 
     ```
     <bean id="#" class="#"></bean>
     ```
    * bean엘리먼트는 IOC가 관리할 애플리케이션 객체를 설정한다. 
    * id는 빈의 이름이며, class 속성은 빈이 속한 클래스의 위치이다.
    * 개발자는 빈을 사용하려면 직접 생성하는게 아니라 컨테이너로부터 빈을 얻어와야 한다.
    * 세터 기반의 DI를 쓸 경우 `<property>` 엘리먼트로 설정하고, 생성자 기반 DI를 쓸 경우 `<constructor-arg>` 엘리먼트로 설정한다.
  * 애너테이션
  * 자바 클래스에 @Configuration을 붙이는 법
* 스프링 컨테이너 인스턴스(ApplicationContext) <-- 이게 IOC 임
 * 여러가지 컨테이너 인스턴스가 존재한다
 * 독립적으로 실행되는 애플리케이션에는 ClassPathXmlApplicationContext,FileSystemXmlApplicationContext가 쓰인다
   * ClassPathXmlApplicationContext는 클래스패스가 지정한 위치에서 xml을 읽는다.
   * FileSystemXmlApplicationContext는 파일시스템이 지정한 위치에서 xml을 읽는다.
 * 컨테이너에 위치한 빈을 사용하는 법
 ```
 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//생성자 인수로 xml파일의 경로를 적어준다
 context.getBean("xml에서 빈 설정시 사용한 id값을 넣으면 된다");//그럼 그 빈이 의존하는 다른 빈의 메서드를 호출 가능함
 ```
* getBean() 메서드는 매개안에 들어갈 id값을 가지고 있는 `해당 빈의 인스턴스를 요청`하는 것이다. 
