* class
  * class는 일종의 템플릿이다
  * 객체가 가질 데이터와 객체가 행할 수 있는 동작을 규정해놓는다

* 클래스 작성시 메서드 네이밍은 나의 Api를 사용하게 될 이용자가 이해하기 쉽게 직관적으로 작성해야한다

```
class Car{
  //상태
int speed;
//행동
void start(){} //특정 객체의 action를 규정
}
```
* Object
  * 클래스(템플릿)를 바탕으로 생성되어진다.
  * 객체에는 상태와 행동이 존재한다.
  * 객체의 상태란 해당 시점에서 객체가 가지는 멤버 변수에 대한 값을 의미한다.-->상태는 계속 변할 수 있다.
  * 객체의 행동은 클래스내의 메서드로 나타낸다.

```
class CarDetail{
 public void main(String[] args){
  Car 현대 = new Car(); //서로 독립적인 객체
  Car bmw = new Car();//독립적 객체
   현대.speed=100;
   bmw.speed=90; 
  }
}
```
</br>
</br>

## 캡슐화(Encapsulation)

위 클래스는 문제점이 있는데, 외부의 클래스가 Car클래스에 존재하는 인스턴스 변수에 직접적으로 접근이 가능하다는 것이 문제다
즉 캡슐화라는 것을 파괴하는데, 캡슐화는 특정클래스 안의 인스턴스 변수는 해당 클래스만이 접근해야한다는 개념이다 다른 클래스가 접근할려면 메서드를 통해야 한다

아래는 접근제어자를 이용해 변수에 대해 외부에서 접근하지 못하게 비공개시키고 메서드를 통해서만 변수에 접근이 가능하게 한 코드이다

```
class Car{
  //상태
  private int speed; // private으로 변수를 비공개시킴
  //동작
  public void setSpeed(int speed){//<--외부 접근
    this.speed=speed;
}
  public int getSpeed(){//<--외부 접근
    return speed;
  }
  void start(){} //특정 객체의 action를 규정
}

```

***왜 데이터는 메서드를 거쳐서만 외부에 노출돼야 하나??***
> 만약 외부에서 특정 필드에 맞지 않은 값을 넣으려고 할때
메서드를 통해서 값을 주입 받게 되면 그안에서 잘못된 데이터를 차단할 수 있기 때문이다.

즉 특정 클래스의 멤버변수에 들어갈 수 있는 것과 없는 것을  메서드를 통해 검증하는 것이 캡슐화의 주요 기능이다.

***캡슐화의 두번째 기능***

아래에서 현대와bmw의 상태값(speed)을 50씩 올리고 싶은경우
```
class CarDetail{
 public void main(String[] args){
  Car 현대 = new Car(); //서로 독립적인 객체
  Car bmw = new Car();//독립적 객체
   현대.speed=100;
   bmw.speed=90;
//속도를 올리는 로직
   int a = 현대.getSpeed()+50;
   현대.setSpeed(a);

   int a = bmw.getSpeed()+50;
   bmw.setSpeed(a);
  }
}
```
객체가 많아지면 매우 비효율적인 작업이다.
이러한 비즈니스로직 또한 객체 안에 캡슐화할 수 있다.
```
class Car{
  //상태
  private int speed; // private으로 변수를 비공개시킴
  //동작
  public void setSpeed(int speed){
    this.speed=speed;
}
  public int getSpeed(){
    return speed;
  }
  void start(){} //특정 객체의 action를 규정
}
//속도올리는 로직
  void increaseSpeed(int a){
    this.speed+=a;
  }
//속도 감소 로직
void decreaseSpeed(int a){
  setSpeed(this.speed+a);
  }
```
클래스안에 메서드 하나 작성해두면 객체가 아무리 많아져도 부담이 없다. 또한 안에 validation로직 을 추가해 속도가 음수가 되는 것을 방지할 수 있다

***
## 클래스 더 알아보기

### 추상클래스란
단독으로 인스턴스를 만들 수 없으며 다른 클래스가 상속해 사용되어진다.
일반클래스 생성과 달리 추상클래스 생성법은 아래와 같다
```
public abstract class AbstractAnimal{
  abstract public void run();
}
```
클래스에서 메서드를 선언할 뿐 나머지는 하위클래스의 역할이다.
```
class Dog extends AbstractAnimal{
  public void run(){
    System.out.println("run");
  };
}
```
추상클래스를 상속하는 쪽에서 추상메서드의 형태를 만들어줘야 한다