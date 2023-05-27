
public class Study4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee 아메리카노 = new Coffee();
		아메리카노.name = "아메리카노";
		아메리카노.price = 1400;
		
		Coffee 아메리카노1 = new Coffee();
		아메리카노1.name = "라떼";
		아메리카노1.price = 3000;
		
		Coffee[] coffees = {아메리카노, 아메리카노1};
		for (int i=0; i<coffees.length; i++) {
			System.out.println(coffees[i].name + " " + coffees[i].price);
		}
		
	}

}


// 클래스의 이름은 대문자로 시작
// 객체
class Coffee {
	
	// 필드 field
	String name;
	int price;
}
