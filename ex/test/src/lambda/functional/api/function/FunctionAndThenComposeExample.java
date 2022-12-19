package lambda.functional.api.function;

import java.util.function.Function;
import lambda.functional.api.Address;
import lambda.functional.api.Member;

public class FunctionAndThenComposeExample {

    public static void main(String[] args) {

        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function<Member, String> functionAB;
        String city;

        functionA = (m) -> m.getAddress();
        functionB = (m) -> m.getCity();

        functionAB = functionA.andThen(functionB);
        city = functionAB.apply(
                new Member("최대한", "choikorea", new Address("한국", "내수"))
        );
        System.out.println("city = " + city);

        functionAB = functionB.compose(functionA);
        city = functionAB.apply(
                new Member("장용준", "ohoh", new Address("한국", "북이"))
        );
        System.out.println("city = " + city);
    }
}
