
public class Example {
	// static: 정적, 
	
	//메소드
	public static void main(String[] args) {
		Test test = new Test();
		test.a = 1;
		System.out.println(test.b + " " + test.a);
		System.out.println(Test.class + " " + Test.b);
		for (int i=0; i<3; i++) {
			Test test1 = new Test();
			Test.plus(i);
		}
		System.out.println(test.b + " " + Test.b);
	}

}

// 자원 낭비가 안 된다는 점이 이점이다.
// 메모리가 효율적으로 관리된다.

class Test{
	int a;
	//static 필드 변수 선언
	static int b=0;	
	
	// 생성자 (no argument constructor
	public Test() {
		b++;
	}
	// 메소드
	public static void plus(int i) {
		b += i;
		
	}
}

// static은 자원을 공유한다
// static은 메모리를 아낄려고
