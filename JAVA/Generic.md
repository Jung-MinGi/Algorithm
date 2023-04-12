## 제네릭이란
자바에서 타입 안정성(type safety)을 보장하기 위해 도입된 기능이다 

만약 내가 어떤 클래스를 만들어 배포하고 싶다 나는 이 클래스가 여러타입을 지원하는 클래스이면 좋겠다 그럼 모든 타입에 맞게 하나씩 다만들어놔야 할까?? 이런 경우 제네릭을 사용한다



아래는 제네릭을 사용하지 않은 클래스 하나를 정의했다.
```
public class 장바구니 {
	ArrayList<String> list = new ArrayList<>();
	
	public void add(String name) {
		list.add(name);
	}
	
	public void remove(String name) {
		list.remove(name);
	}
}
////////////////////////////

public class Main {
	public static void main(String[] args) {
		장바구니 cart = new 장바구니();
		cart.add("String");
	}

}
```
이 상태에서 cart에 Integer값을 넣고 싶다 그럼 장바구니 클래스를 새로 하나 정의해서 거기에 값을 넣어야 한다..

지금 내가 만든 클래스는 하나의 데이터 타입에 종속되어 작동한다

데이터 타입마다 클래스를 매번 만들어줘야하는 매우 비효율적인 코드다

## ***제네릭***을 사용하면 이문제가 해결된다!!

제네릭을 사용해 클래스 만들어보자
```
public class 장바구니<T> {
	ArrayList<T> list = new ArrayList<>();
	
	public void add(T name) {
		list.add(name);
	}
	
	public void remove(T name) {
		list.remove(name);
	}
}
////////////////////////////
public class Main {
	public static void main(String[] args) {
		장바구니<String> cart1 = new 장바구니<>();
		cart1.add("String");
		
		장바구니<Integer> cart2 = new 장바구니<Integer>();
		cart2.add(Integer.valueOf(123));
	}
}
```
제네릭을 사용하여 클래스를 작성하면 여러 종류의 타입에 대해 재사용 가능한 코드를 작성할 수 있게 된다. 확장성이 매우 좋아진다
***

## 제한된 Generic과 와일드 카드

만약 모든 타입을 받고싶은게 아니라 특정 타입들만 제한해서 받는 클래스를 만들고 싶다면??

* extends : 상한경계를 지정
* super : 하한경계를 지정
* ? : 와일드카드

위 세가지로 타입을 제한할 수 있다.

```
<? extends Number>
<T extends Number>
 //Number 자기자신과 이를 상속한 하위타입들로 범위가 제한된다


<? super Number>
<T super Number>
//Number 자기자신과 Number의 상위타입들로 범위가 제한된다


<?>//이거는 <? extends Object> 와 같다 그냥 모든 타입 가능 
```