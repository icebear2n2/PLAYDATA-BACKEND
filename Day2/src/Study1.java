
public class Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String, byte, short, int, long, float, double, boolean
		// 약
		int a = 6;
		
		for (int i=1; i<a+1; i++) {
			for (int j=1; j<a+1; j++) {
				if (i*j == a) {
					System.out.println(i);
				}
			}
		}
		
		for (int i =a; i > 0; i--) {
			if (a % i == 0);
			System.out.println(i);
		}
		// 연결됌
		if (a % 2 == 0) {
			System.out.println("2의 배수 ");
		} else if (a % 3 == 0) {
			System.out.println("3의 배수");
		} else if (a % 6 == 0) {
			System.out.println("6의 배수");
		}
		
		// 연결 풀림
		// && : and 둘다 만족
		//  || : or 둘중 하나 만족
		if (a % 2 == 0 && a % 3 == 0) {
			System.out.println("2의 배수 ");
		} if (a % 3 == 0 || a % 6 == 0) {
			System.out.println("3의 배수");
		} if (a % 6 == 0) {
			System.out.println("6의 배수");
		}
		
	}

}
