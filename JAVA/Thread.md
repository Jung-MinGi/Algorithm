# Thread(스레드)

```
public class ThreadTest {
	public static void main(String[] args) {
		for(int i = 1 ; i<51 ; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n첫번째 반복문 종료");
		for(int i = 50 ; i<101 ; i++) {
			System.out.print(i+" ");
		}
	}
}
```
```
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 
첫번째 반복문 종료
50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 
```
출력값을 보면 전형적인 프로그래밍이 진행되는 순서이다

스레드를 생성하는 두가지방법

1. extends Thread
2. implements Runnable

```
public class ThreadTest {
	public static void main(String[] args) {
		FirstThread firstThread = new FirstThread();
		firstThread.start(); // run메소드호출아님 @!!
		System.out.println("첫번째 반복문 종료");
		for(int i = 50 ; i<101 ; i++) {
			System.out.print(i+" ");
		}
	}
}
class FirstThread extends Thread{ //첫번째 반복문을 스레드로 만들었음
	public void run() {
		for(int i = 1 ; i<51 ; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n첫번째 반복문 종료");
	}
}
```

```
첫번째 반복문 종료
1 50 2 51 3 52 4 53 5 54 6 55 7 56 8 57 9 58 10 59 11 60 12 61 13 62 14 63 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 64 46 65 66 47 48 49 67 50 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 
```

출력값을 보면 두번째 반복문의 출력값이 중간중간 껴있다.

스레드때문에 코드가 병렬로 작동됐다. 두번째 반복문도 스레드로 만들어보자

```
public class ThreadTest {
	public static void main(String[] args) {
		
		FirstThread firstThread = new FirstThread();
		firstThread.start();
		System.out.println("첫번째 반복문 종료");
		////////////////////////////////////////////////////
		SecondThread secondThread = new SecondThread();
		Thread thread = new Thread(secondThread);
		thread.start();
		System.out.println("main메서드종료");
	}
}
class FirstThread extends Thread{
	public void run() {
		for(int i = 1 ; i<51 ; i++) {
			System.out.print(i+" ");
		}System.out.println("thread1종료");
	}
}

class SecondThread implements Runnable{

	@Override
	public void run() {
		for(int i = 50 ; i<101 ; i++) {
			System.out.print(i+" ");
		}
		System.out.println("thread2종료");
	}
}
```

```
첫번째 반복문 종료
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 main메서드종료
28 50 51 52 53 54 55 56 57 58 29 30 59 60 61 31 32 33 34 35 36 37 62 63 64 65 38 39 40 41 66 67 68 69 70 71 72 73 74 42 43 44 45 46 47 48 49 75 76 77 78 50 thread1종료
79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 thread2종료
```
출력값을 보면 main메서드종료가 콘솔에 먼저 찍힌다 그후에 스래드 1, 2가 종료된걸 볼 수 있다. 스레드는 cpu가 시간낭비없이 효율적인 작업을 할 수 있게 해준다.


## Thread의 상태

* NEW--스레드가처음 생성될 때의 상태로 start메소드를 사용하기 전 단계 생성되고 아래 3개의 상태를 반복해서 돈다
    * Runnable--코드의 실행이 가능한 준비상태 그러나 다른 스레드가 이미 cpu을 사용하고 있는 경우 
    * Running--스레드가 cpu를 점유해서 동작중인 상태
    * Blockes/Waiting--어떤 외부입력을 기다리는 중 또는 실행이 완료되지 않은 다른 스레드로붜 데이터를 받아야 하는 상황 
* Terminated/Dead--스레드가 종료