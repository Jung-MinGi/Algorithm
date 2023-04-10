## 자바 참조형이란
```
Car a = new Car();
```
여기서 a는 참조변수라는 것이다

***참조변수와 인스턴스와의 관계***
```
public class Animal {
	int id;

	public Animal(int id) {
		this.id = id;
	}

}
```
id라는 필드를 가진 Animal 클래스가 있다
클래스를 이용해 두개의 독립적인 인스턴스를 만든다
```
public class Main {
	public static void main(String[] args) {
Animal dog = new Animal(5);
Animal cat = new Animal(9);
	}
}
```

이렇게 하면 메모리안의 힙이라는 공간에 Animal(5), Animal(9)가 저장되어지고, 스택이라는 메모리엔 dog, cat이 저장된다

> 참조변수는 힙안에 있는 객체의 주소를 값으로 가진다.<br>
dog = aaa.Animal@7de26db8-->(Animal(5)의 경로)<br>
cat = aaa.Animal@1175e2db-->(Animal(9)의 경로)


### 참조변수의 동등성 비교



