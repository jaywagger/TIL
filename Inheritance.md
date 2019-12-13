## 상속 (Inheritance) - 2019.12.12

-상속이란 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.

-재사용성이 좋고 중복을 방지한다. 

``` java
//기본 포멧
class Child extends Parent {
    //클래스명 다음에 extends 하고 부모클래스 설정
}
```

부모클래스에서 코드를 가지고와서 자식클래스에 코드 내용이 더 풍부하다.

부모클래스는 private으로 설정되어 있으면 접근못한다.

**상속 메소드 끌어오기**: super. 메소드명 끌어오기. 안되면 getter





**매소드랑 다른점은?**

매소드는 리턴값을 가지고 오고 상속은 부모클래스 전체를 가지고 온다.



#### 상속 사용할 때

1. 상속관계(is a) 관계 일때. 예시) 저축계좌는 is a 일반계좌이다. 

2. 포함(has a) 관계는 상속보단 매서드를 사용하자.

   Circle has points

``` java
class Circle {						class extends Point {
    Point c = new Point();				int r;
    int r							}
}
```





#### 오버라이딩 (Overriding)

상속받은 것을 수정: 메소드의 재정의. 오버라이딩.

오버라이딩은 메서드의 내용만을 새로 작성하는 것