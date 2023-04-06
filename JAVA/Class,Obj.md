* class
  * class는 일종의 템플릿이다
  * 객체가 가질 데이터와 객체가 행할 수 있는 동작을 규정해놓는다

```
class Planet{
private String name; //행성의 이름
private String distanceFromSun; //태양으로부터 떨어진 거리

void revolve(){} //특정 객체의 action를 규정
}
```
* Object
  * 클래스(템플릿)의 인스턴스

```
Planet earth = new Planet(); //지구와 화성은 각 필드(멤버변수)에 있어 서로 다른 값을 지닐 수 있다
Planet Mars = new Planet();
```
