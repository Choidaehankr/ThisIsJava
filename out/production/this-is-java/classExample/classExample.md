### StudentExample

new 연산자는 힙 영역에 객체를 생성시킨 후, 객체의 주소를 리턴.
이 주소를 참조 타입인 클래스 변수 (s1, s2)에 저장해두면, 변수를 통해 객체 사용 가능. 

### 클래스의 2가지 용도

라이브러리 / 실행

Student는 라이브러리,StudentExample은 실행 클래스

라이브러리에 main() 메소드를 작성해서 라이브러리인 동시에 실행클래스로 만들 수 있음.


## 클래스의 구성 멤버

필드 / 생성자/ 메소드

### 필드: 객체의 데이터가 저장되는 곳

int fieldName;

선언형태가 변수와 비슷하지만, 변수는 생성자와 메소드 내에서만 사용되고 생성자와 메소드가 실행 종료되면 자동으로 소멸. 하지만 필드는 객체가 소멸되지 않는 한 객체와 함께 존재한다.

### 생성자: 객체 생성 시 초기화 역할 담당

Classname() { }

필드를 초기화하거나, 메소드를 호출해서 객체를 사용할 준비를 함. 메소드와 비슷하게 생겼지만 클래스 이름으로 되어있고 리턴 타입이 없다.

### 메소드: 객체의 동작에 해당하는 실행 블록

void methodName() { }

필드를 읽고 수정하는 역할도 하지만, 다른 객체를 생성해서 다양한 기능을 수행하기도 함. 객체 간의 데이터 전달의 수단으로 사용됨.


