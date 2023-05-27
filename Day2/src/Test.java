
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arrNum = {{1,2,3},{4,5,6},{7,8,9}};
		
		// 987654321
		for (int i=arrNum.length; i>0; i--) {
			for (int j=arrNum[i-1].length; j>0; j--) {
				System.out.println(arrNum[i-1][j-1]);
			}
		}
		
		
		
		//147 258 369
		for (int i=0; i<arrNum.length; i++) {
			for (int j=0; j<arrNum.length; j++) {
				System.out.print(arrNum[j][i]);
			}
		}

	}

}
