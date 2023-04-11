## 상속
Person클래스 하나 만들어보자
```
public class Person {
	private String name;
	private String email;
	private String phoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
```
student클래스 하나 더 만들어보자
```
public class Student {
	private String name;
	private String email;
	private String phoneNumber;
	private String college;
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
```
위 두개의 클래스를 보면 중복되는 부분이 많다<br> 그래서 값이 하나 수정 되어도 두개의 클래스를 모두 수정해야하는데, 이때 ***상속***이 이 문제를 해결해준다.
### 상속이란
> 부모클래스에 있는 코드들을 자식클래스에서 다시 사용할 수 있지만 인터페이스와 달리 원하는것만 가져올 수 있다 


아래는 상속을 이용한  student클래스이다
```
public class Student extends Person {
    private String college;

    public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
}//코드가 한결 가벼워졌다
```
```
public class Test{

    public static void main(String[] args){
        Student student = new Student();
        student.getPhoneNumber();
        student.getEmail();
        student.setName();
    }
}//student객체를 만들었지만 상속클래스의 메서드 사용이 가능하다
```
즉 상속은 서브클래스(student)가 슈퍼클래스(person)를 확장하며 서브클래스는 슈퍼클래스의 모든 기능을 가지게 된다!!


## Object(최상위 클래스)에 대해 알아보자

![예시](https://user-images.githubusercontent.com/118701129/230918821-05014013-23c1-420f-a047-97684002d99a.jpg)

위 사진은 내가 만든 Person클래스를 객체로 만들고 사용가능한 메서드 목록이다.
보면 내가  Person클래스에 아예 없는 메소드들이 많이 보인다

***이것들은 어디서 온걸까??***

Object라는 최상위 클래스에 있는 메서드들이다
## Object Class란
자바에서의 모든 API 및 사용자 클래스의 최상위 타입

배열을 포함한 모든 객체는 ObjectClass안에 존재하는 메서드를 구현한다

어떤 클래스가 다른 클래스를 extends하지 않는다면 자바에서 자동으로 Object클래스를 상속한다. 