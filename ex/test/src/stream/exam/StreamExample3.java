package stream.exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {

    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김자바", "디자니어"),
                new Member("신용권", "개발자")
        );

//        List<Member> developers = list.stream().filter(a -> a.job == "개발자").collect(Collectors.toList());
        List<Member> developers = list.stream()
                        .filter(m -> m.job.equals("개발자")).collect(Collectors.toList());
        developers.stream().forEach(m -> System.out.println(m.getName()));
    }

    static class Member {
        private String name;
        private String job;

        public Member(String name, String job) {
            this.name = name;
            this.job = job;
        }

        public String getName() {
            return name;
        }

        public String getJob() {
            return job;
        }
    }
}
