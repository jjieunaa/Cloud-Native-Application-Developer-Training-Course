
public class ArrayDemo {
	public static void main(String[] args) {
		// 1
/*		
 		int[] array = null;		// Declaration
		// array는 4바이트 참조형 변수
		array = new int[4];		// Creation
		// 배열은 객체이기 때문에 new 사용
		array[0] = 5;	// Assignment
		array[1] = 6;
		array[2] = 7;
*/
		// 2
/*		
		int[] array = null;		// Declaration
		array = new int[] {5,6,7,8};	// Creation & Assignment
*/			
		// 3
/*		
 		int[] array = {5,6,7,8}; 	// Initialization
		// 항상 선언과 값을 넣는 것은 같은 라인에!
*/

		
		// 2차원 배열: Rectangular Array, Ragged Array
		// 자바는 Rectangular Array보다 Ragged Array를 더 선호
		///////////////////Rectangular Array///////////////////
		// 1
/*
		int[][] array = null;	// Declaration
		array = new int[2][3];	// Creation
		array[0][0] = 5;	// Assignment
*/
		// 2
/*
		int[][] array = null;	// Declaration
		array = new int[][] {{5,6,7},{8,9,10}};	// Creation & Assignment
*/
		// 3
/*
		int[][] array = {{5,6,7},{7,8,9}};	// Initialization
*/

		///////////////////Ragged Array///////////////////
		// 1
/*
		int[][] array = null;	// Declaration
		array = new int[3][];	// Creation
		array[0] = new int[4];
		array[1] = new int[2];
		array[2] = new int[5];
		array[0][0] = 5;	// Assignment
*/
		// 2
/*		
		int[][] array = null;	// Declaration
		
		// array = new int[3][];
		// array[0] = new int[] {3,4,5,6};	// Creation & Assignment
		// array[1] = new int[] {7,8};
		// array[2] = new int[] {9,10,11,12,13};
		
		array = new int[][] {{3,4,5,6},
							{7,8},
							{9,10,11,12,13}};
*/
		// 3
		int[][] array = {{3,4,5,6},
						{7,8},
						{9,10,11,12,13}};	// Initialization
		
		System.out.println("0층의 방 개수: " + array[0].length);
		System.out.println("1층의 방 개수: " + array[1].length);
		System.out.println("2층의 방 개수: " + array[2].length);
		
		for(int i=0; i<array.length; i++) {
			System.out.print(i + "층: ");
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
