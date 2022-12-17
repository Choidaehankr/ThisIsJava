package generic.type;

public class Util {

    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        /**
         * 첫 번째 매개값이 작으면 -1, 같으면 0, 크면 1을 return
         */
        return Double.compare(v1, v2);
    }
}
