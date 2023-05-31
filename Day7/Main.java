import MyThread.MyRunnable;
import MyThread.MyThread;
import dto.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // 스레드는 분기를 치는 것이다
    public static void main(String[] args) throws CustomException{
//        MyRunnable myRunnable = new MyRunnable(1);
//        MyRunnable myRunnable2 = new MyRunnable(2);
//        Thread thread = new Thread(myRunnable);
//        Thread thread2 = new Thread(myRunnable2);
//        thread.start();
//        thread2.start();

//        MyThread myThread = new MyThread(1000, 1);
//        MyThread myThread1 = new MyThread(2000, 2);
//        myThread.start();
//        myThread1.start();

        // 스레드는 자원을 공유하면 안 된다.
//       Person person = new Person();
//        for (int i = 0; i < 5; i++) {
//            MyThread myThread = new MyThread(1000, i, person);
//            System.out.println(myThread.getId());
//            myThread.start();

        // 1. list.add(marine) 상태값 생성중 10 생성완료
        // 1. list.add(marine) 상태값 생성중 10 생성중
        // 1. list.add(marine) 상태값 생성중 10 생성중
//            System.out.println("1. 마린 생성, 2. 인덱스를 입력 받아서 확인");

//    }
//
//        try {
//            System.out.println(1 / 0);
//            Person person = null;
//            System.out.println(person.getName());
//        } catch (Exception e) {
//            // Exception은 최상위 -> 한꺼번에 처리
//            System.out.println("err");
//        } finally {
//            System.out.println("finally");
//        }


//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
//        } catch (ArithmeticException e) {
//            System.out.println(" /0 err");
//        }


        try {
            System.out.println(1/0);
        } catch (Exception e) {
           throw  new CustomException("에러 발생");
        }

    }
}
