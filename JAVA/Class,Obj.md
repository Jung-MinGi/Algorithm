* class
  * class는 일종의 템플릿이다
  * 객체가 가질 데이터와 객체가 행할 수 있는 동작을 규정해놓는다

```
class Planet{
 String name; //행성의 이름
 Long distanceFromSun; //태양으로부터 떨어진 거리

void revolve(){} //특정 객체의 action를 규정
}
```
* Object
  * 클래스(템플릿)의 인스턴스

```
class PlanetDetail{
 public void main(String[] args){
  Planet earth = new Planet(); //지구와 화성은 각 필드(멤버변수)에 있어 서로 다른 값을 지닐 수 있다
    earth.name="지구";
    earth.distanceFromSun=12412245;
  Planet Mars = new Planet();
    earth.name="화성";
    earth.distanceFromSun=543131;
  }
}
```


## 캡슐화(Encapsulation)

위 클래스는 문제점이 있는데, 외부의 클래스가 planet클래스에 존재하는 인스턴스 변수에 직접적으로 접근이 가능하다는 것이 문제다
즉 캡슐화라는 것을 파괴하는데, 캡슐화는 특정클래스 안의 인스턴스 변수는 해당 클래스만이 접근해야한다는 개념이다 다른 클래스가 접근할려면
메서드를 통해야 한다
```
private String name; //행성의 이름
private Long distanceFromSun; //태양으로부터 떨어진 거리
```
접근제어자를 이용해 변수에 대해 외부에서 접근하지 못하게 비공개로 돌려놔야 한다 %% getter,setter의 존재 이유


