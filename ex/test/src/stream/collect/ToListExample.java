package stream.collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import stream.collect.Student.Sex;

public class ToListExample {

    public static void main(String[] args) {

        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Sex.MALE),
                new Student("김수애", 6, Sex.FEMALE),
                new Student("신용권", 10, Sex.MALE),
                new Student("박수미", 6, Sex.FEMALE)
        );

        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex() == Sex.MALE)
                .collect(Collectors.toList());

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        Set<Student> femaleSet = totalList.stream()
                .filter(s -> s.getSex() == Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));
        femaleSet.stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
