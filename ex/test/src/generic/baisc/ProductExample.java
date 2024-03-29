package generic.baisc;

public class ProductExample {

    public static void main(String[] args) {

        Product<Tv, String> product1 = new Product<Tv, String>();
        product1.setKind(new Tv());
        product1.setModel("스마트 Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        System.out.println("tv = " + tv);
        System.out.println("tvModel = " + tvModel);

        Product<Car, String> product2 = new Product<Car, String>();
        product2.setKind(new Car());
        product2.setModel("GV80");

        Car car = product2.getKind();
        String carModel = product2.getModel();

        System.out.println("car = " + car);
        System.out.println("carModel = " + carModel);

    }
}

class Tv {

}

class Car {

}
