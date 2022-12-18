package lambda.functional.local;

public class UsingLocalVariable {

    void method(int arg) {
        int localVal = 40;

//        arg = 31;
//        localVal = 41;

        MyFunctionalInterface fi = () -> {
            System.out.println("arg = " + arg);
            System.out.println("localVal = " + localVal + "\n");
        };
        fi.method();
    }
}
