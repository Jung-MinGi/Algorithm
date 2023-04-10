* class
  * class는 일종의 템플릿이다
  * 객체가 가질 데이터와 객체가 행할 수 있는 동작을 규정해놓는다

```
class Car{
  //상태
int speed;
//동작
void start(){} //특정 객체의 action를 규정
}
```
* Object
  * 객체는 서로 독립적이다
  * 객체에는 상태와 동작이 존재한다.
  * 객체의 상태는 클래스내의 멤버변수로 나타낸다.
  * 객체의 동작은 클래스내의 메서드로 나타낸다.

```
class CarDetail{
 public void main(String[] args){
  Car hyundai = new Car(); //서로 독립적인 객체
  Car bmw = new Car();//독립적 객체
   hyundai.speed=100;
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
  public void setSpeed(int speed){
    this.speed=speed;
}
  public int getSpeed(){
    return speed;
  }
  void start(){} //특정 객체의 action를 규정
}

```
 

***왜 데이터는 메서드를 거쳐서만 외부에 노출돼야 하나??***
> 만약 외부에서 특정 필드에 맞지 않은 값을 넣으려고 할때
메서드를 통해서 값을 주입 받게 되면 그안에서 잘못된 데이터를 차단할 수 있기 때문이다.

즉 메서드를 통해 특정 개체에 들어갈 수 있는 것과 없는 것을  메서드를 통해 검증하는 것이 캡슐화의 주요 기능이다.

