import java.util.*;

public class Test {
    public static void main(String[] args) {
// Set Queue Stack final
        String str = "";
//        final float pie = 3.14f;
//        final Integer i = 0;
//        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        // 순서 x, 중복 x
        // 에러 종류 error warning
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set.size());
        for (Integer i : set) {
//            System.out.printf("%d 입니다. %d\n", i, i);
            System.out.printf("%4.2f 입니다. %d %s\n", (float) i * 8000, i, "sdasd");
        }
    }
}

// final
//final class Person {
//    private final Integer num;
//    private final String name;
//
//    public Person(Integer num, String name) {
//        this.num = num;
//        this.name = name;
//    }
//}

class Member {
    private String id;
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            System.out.println("중복된 아이디거나 비밀번호입니다");
            return false;
        }
        ;
        Member member = (Member) o;
        return Objects.equals(id, member.id) && Objects.equals(password, member.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password);
    }
}