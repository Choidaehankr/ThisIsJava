package generic.baisc;

public class BoxingMethodExample {

    public static void main(String[] args) {
        NewBox<Integer> box1 = Util.<Integer>boxing(100);
        int intValue = box1.get();
        System.out.println("intValue = " + intValue);

        NewBox<String> box2 = Util.boxing("최대한");
        String strValue = box2.get();
        System.out.println("strValue = " + strValue);
    }
}
