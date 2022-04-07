package singleton;

import java.security.Signature;

public class SingletonExample {

    public static void main(String[] args) {
//        Singleton obj1 = new Singleton();  // compile error
//        Singleton obj2 = new Singleton();

        Singleton ob3 = Singleton.getInstance("choidaehan", 1234);
        Singleton ob4 = Singleton.getInstance("kimminsu", 98676);

        if(ob4 == ob4) {
            System.out.println("같은 singleton 객체입니다.");
            System.out.println(ob3.name);  // kimminsu 출력
//            System.out.println(ob4.number);  // private 선언으로 인한 오류
        } else {
            System.out.println("다른 singleton 객체입니다.");
        }
        
        ob3.name = "leehyun";  // 접근
        System.out.println("ob3.name = " + ob3.name);
    }
}
