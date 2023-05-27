
public class Test2 {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{4, 7, 9, 10}, 
				{2, 7, 3, 4}, 
				{9, 2, 8, 5}, 
				{8, 4, 2, 1}
		};
		
		// arr 탐색을 하는데 하나씩 더하고 만약 짝수면 그 수를 출력을 하고 홀수이면서 더한 값이 20이 넘음녀 끝내고 아니면 더하고  더한 값을 출력하라
		
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
//				System.out.println(arr[i][j]);
				if (arr[i][j] % 2 == 0) {
					System.out.println(arr[i][j]);
				}
				else if (arr[i][j] % 2 != 0) {
					sum += arr[i][j];
					if (sum > 20) {
						System.out.println(sum);
						sum = 0;
						break;
						
					}
				} else {
					System.out.println(arr[i][j]);
				}
			}
		}
//		
		for (int i=0; i < arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) {
					System.out.println(arr[i][j]);
					
				}
				else {
					sum += arr[i][j];
					if (sum > 20) {
						break;
					}
				}
			}
			System.out.println(sum);
			if (sum > 20) {
				break;
			}
			
		}
		// is_break snake case
		// isBreak camel case
//		boolean isBreak = sum > 20; // 전역 변수
		for (int i=0; i < arr.length; i++) {
			boolean isBreak = sum > 20; // 지역 변수   //Boolean은 true, false를 출력하기 때문에 변수에 is라고 먼저 쓴
			for (int j=0; j<arr[i].length; j++) {
				int now = arr[i][j];
				if (arr[i][j] % 2 == 0) {
					System.out.println(now);
					
				}
				else {
					sum += now;
    					isBreak = sum > 20;
					if (isBreak) {
						break;
					}
				}
			}
			System.out.println(sum);
			if (sum > 20) {
				break;
			}
			
		}
		

	}
}