package chap02;

public class Chap_2_1 {

	public static void main(String[] args) {
//		정수 82와 17의 합과 차를 구하라.
		System.out.println(82 + 17);
		System.out.println(82 - 17);
		
//		계산 식과 결과까지 표시하라.		
		System.out.println("82 + 17 = " + (82 + 17));  // (1)
		System.out.println("82 - 17 = " + (82 - 17));  // (2)

//		(2)에서 ()를 제거하라.
		System.out.println("82 - 17 = " + 82 - 17); // 오류 발생
	}

}
