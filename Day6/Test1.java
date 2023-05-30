import java.util.Stack;

public class Test1 {
    // stack
    //후입 선출 LIFO
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        for (int i = 0; i < 3; i++) {
//            System.out.println(stack.pop());
            System.out.println(stack.peek());
            // pop 제거 하나 꺼냄 ->
            // pop
            // peek 하나 꺼냄 보기만, 맨 위에 뭐가 있나 보기만 함
        }
        print(0);
    }

    static void print(int i) {
        if (i > 10) return;
        print(i + 1);
        System.out.println(i);
    }
}
