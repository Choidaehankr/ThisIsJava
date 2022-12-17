package generic.baisc;

public class Util {

    public static <T> NewBox<T> boxing(T t) {
        NewBox<T> box = new NewBox<>();
        box.set(t);
        return box;
    }
}
