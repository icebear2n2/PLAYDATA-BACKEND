
public class Study2 {

	public static void main(String[] args) {
	
		
		
		
		
		// TODO Auto-generated method stub
		// for
//		for (int i=0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		// while(조건) {실행}
//		int i = 0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
//		i = 0;
//		do {
//			System.out.println(i);
//			i++;
//		} while(i<10);
//		
//		// 무한 루
//		boolean isBreak = true;
//		int i = 0;
//		while(isBreak) {
//			System.out.println("while");
//			i++;
//			if (i<5) isBreak = false;
//		}
		
//		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		// 987654321 while로
//		int i = arr.length;
//		
//		while(i > 0) {
//			i-=1;
//			int j=arr[i].length;
//			while(j > 0) {
//				j-=1;
//				System.out.println(arr[i][j]);
//						
//			}
//			
//		}
//		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr[i].length; j++) {
////				System.out.println(arr[i][j]);
//				System.out.print(arr[arr.length-i-1][arr.length-j-1]);
//			}
//		}
		
//		int i = arr.length-1;
//		while(i>=0){
//			int j =arr[i].length-1;
//			while(j>=0) {
//				System.out.print(arr[i][j]);
//				j--;
//			}
//			i--;
//		}
		
//		// 147 258 369
//		int i = 0;
//		while (i < arr.length) {
//	
//			int j = 0;
//			while (j < arr[i].length) {
//				System.out.println(arr[j][i]);
//				j +=1;		
//			}		
//			i += 1;
//		}
		// arr[0][0] arr[1][1] arr[2][2]
		// arr[0][1] arr[1][2]
		// arr[0][2]
		
		// 철수 이야기 정답
//		for (int i=0; i < arr.length; i++) {
//			for (int j=0; j < arr.length-i; j++) {
//				System.out.println(arr[j][j+i]);
//			}
//		}
		
		// 탐색할 때 만약 홀수면 1을 더하고
		// 홀수인 값의 합을 출력하고
		// 리스트를 보여줘라
		// 10
		// 224
		// 466
		// 8810
		
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i][j] % 2 == 1) {
//					sum += arr[i][j]; // 새로운 변수에 넣는 걸 재할당이라고 한다.
//					arr[i][j]++;
//				}
//			}
//		}
//		System.out.println(sum);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i][j] % 2 == 1) {
//					arr[i][j]++;
//				}
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		// 159 48 7
		int[][] arr = {
				{1, 2, 3}, 
				{4, 5, 6}, 
				{7, 8, 9}};

		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (j+i >= arr.length) {
					continue;
				} else {
					System.out.println(arr[j+i][j]);
				}
					
					
			}
		}
	
	}

}
