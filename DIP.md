`김영한님 스프링 핵심 원리 기본편 내용 중 일부분 요약내용입니다`
## DIP 의존성 역전 원칙
> 의존관계를 맺을 때 변환하기 쉬운것이 아니라 변화가 적은 상위클래스 또는 추상적인것과 의존관계를 맺으라는 원칙


![dip위배](https://github.com/Jung-MinGi/TIL/blob/main/images/dip%EC%9B%90%EC%B9%99%EC%9C%84%EB%B0%B0.drawio.png?raw=true)
```
public class OrderServiceImpl implements OrderService {

    private DiscountPolicy discountPolicy = new FixDiscountPolicy();
    private DiscountPolicy discountPolicy = new RateDiscountPolicy();
}
```
서비스클래스가 인터페이스에만 의존하는게 아니라 구현 클래스에도 의존중인 상태

인터페이스만 의존 시켜야함 

private DiscountPolicy discountpolicy;

근데 이런식으로 작성하면 discountpolicy에 누가 생성된 객체를 넣어주느냐의 문제가 있다 
***


