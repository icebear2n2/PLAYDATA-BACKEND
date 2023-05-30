import java.util.ArrayList;
import java.util.List;

public class Lotto2 {
    public static void main(String[] args) {
        // 재귀 함수를 사용해서 set 사용하지 말고 로또 번호를 만들자!!
        for (int i = 0; i < 5; i++) {
            List<Long> list = new ArrayList<>();
            lotto(list);
            System.out.println(list);
        }
    }

    static void lotto(List list) {
        if (list.size() > 5) return;
        Long num = Math.round(Math.random() * 45 + 1);
        if (list.contains(num)) {
            lotto(list);
        } else {
            list.add(num);
            lotto(list);

        }

    }

}
