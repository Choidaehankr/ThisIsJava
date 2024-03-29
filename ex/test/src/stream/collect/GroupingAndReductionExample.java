package stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import stream.collect.Student.Sex;

public class GroupingAndReductionExample {

    public static void main(String[] args) {

        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Sex.MALE),
                new Student("김수애", 6, Sex.FEMALE),
                new Student("신용권", 10, Sex.MALE),
                new Student("박수미", 6, Sex.FEMALE)
        );

        Map<Student.Sex, Double> mapBySex = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getSex,
                                Collectors.averagingDouble(Student :: getScore)
                        )
                );
        System.out.println("남학생 평균 점수: " + mapBySex.get(Sex.MALE));
        System.out.println("여학생 평균 점수: " + mapBySex.get(Sex.FEMALE));

        Map<Student.Sex, String> mapByName = totalList.stream()
                .collect(Collectors.groupingBy(
                        Student::getSex,
                        Collectors.mapping(
                                Student::getName,
                                Collectors.joining(",")
                        )
                ));

        System.out.println("남학생 전체 이름: " + mapByName.get(Sex.MALE));
        System.out.println("여학생 전체 이름: " + mapByName.get(Sex.FEMALE));
        System.out.println(mapByName.values());
    }
}
