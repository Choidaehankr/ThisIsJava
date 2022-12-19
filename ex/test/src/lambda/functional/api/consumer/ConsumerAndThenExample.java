package lambda.functional.api.consumer;

import java.util.function.Consumer;
import lambda.functional.api.Member;

public class ConsumerAndThenExample {

    public static void main(String[] args) {
        Consumer<Member> consumerA = (m) -> {
            System.out.println("consumerA = " + m.getName());
        };

        Consumer<Member> consumerB = (m) -> {
            System.out.println("consumerB = " + m.getId());
        };

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("최대한", "choi", null));
    }
}
