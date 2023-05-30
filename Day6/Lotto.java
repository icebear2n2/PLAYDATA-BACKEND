import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {
        // 0 <= Math.random() 45 + 1 < 1 * 45 + 1
        // 1<= number < 46
        // 6개, 중복 없어야 함
        // set의 사이즈가 6이 될 때까지 number를 만들자
        // 그 다음 출력하자

        String[] arr = {"A", "B", "C", "D", "E"};
        System.out.println("=============[LOTTO]=============");
        for (int i = 0; i < 5; i++) {
            Set<Long> set = new HashSet<>();
            while (true) {
                if (set.size() == 6) {
                    break;
                } else {
                    set.add(Math.round(Math.random() * 45 + 1));
                }
            }
            System.out.println(" " + arr[i] + " " + "자동" + " " + set);
        }
        System.out.println("=================================");


    }
}
