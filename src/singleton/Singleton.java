package singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();
    public String name;
    protected int number;

    private Singleton() {
    }

    static Singleton getInstance(String name, int number) {
        singleton.name = name;
        singleton.number = number;
        return singleton;
    }
}
