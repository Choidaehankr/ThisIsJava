package generic.baisc;

public class NewBoxExample {

    public static void main(String[] args) {
        NewBox<String> box1 = new NewBox<String>();
        box1.set("hello");

        String str = box1.get();

        NewBox<Integer> box2 = new NewBox<Integer>();
        box2.set(6);

        int value = box2.get();

        System.out.println("str = " + str);
        System.out.println("value = " + value);
    }
}
