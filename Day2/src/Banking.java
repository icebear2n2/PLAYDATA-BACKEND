
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 50300;
		int coffee = 2200;
//		System.out.println(money / coffee);
//		System.out.println(money % coffee);
		
		// 내가 점원인디  1900원 남았는디 천원 몇장 500원 몇개 100원 몇개인지 구하기
		int money2 = money % coffee;
		
		for (int i=money2; i>0;) {
			int count = 0;
			
			if (money2 >= 1000) {
		
				count += (money2 / 1000);
				money2 -= (count * 1000);
				System.out.println("1000원 개수: " + count);
				continue;
			}
			else if (money2 >= 500) {
				count = 0;
				count += (money2 / 500);
				money2 -= (count * 500);
				System.out.println("500원 개수: " + count);
				continue;
				
			} else if (money2 >= 100) {
				count = 0;
				count += (money2 / 100);
				money2 -= (count * 100);
				System.out.println("100원 개수: " + count);
				break;
			}
		}
		int money3[] = {1000, 500, 100};
		for (int i=0; i< money3.length; i++) {
			if (i == 0) {
				System.out.println(money2 / money3[i]);
			} else {
				System.out.println(money2 - ((money2 / money3[i-1]) * money3[i-1] / money3[i]));
			}
			
		}
		
		System.out.println(money2 / 1000);
		System.out.println(money2-((money2/ 1000)*1000) / 500);
		
		for (int i = 0; i < money3.length; i++) {
			if (money3[i] == 1000) {
				continue;
			}
			int now = money2 / money3[i];
			System.out.println(now);
			System.out.println(money2 / money3[i]);
			money2 %= money3[i];
		}
//		50000 -> 10000 -> 5000 -> 1000 -> -> 10 => % 5, 2

	}

}
