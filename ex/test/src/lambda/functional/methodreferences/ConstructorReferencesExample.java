package lambda.functional.methodreferences;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

    public static void main(String[] args) {
        Function<String, Member> function1 = Member :: new;
        Member member1 = function1.apply("angel1");

        BiFunction<String, String, Member> function2 = Member :: new;
        Member member2 = function2.apply("신천사", "angel1");
    }
}
