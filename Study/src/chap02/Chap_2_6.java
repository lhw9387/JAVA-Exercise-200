package chap02;

import java.util.Scanner;

public class Chap_2_6 {

	public static void main(String[] args) {

//	키보드에서 입력한 정숫값에 10을 더한 값과 10을 뺀 값을 출력
//	실행 결과 정숫 값 : 7 / 10을 더한 값은 17입니다. / 10을 뺀 값은 -3입니다.

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		System.out.println("10을 더한 값은" + (x + 10) + "입니다.");
		System.out.println("10을 뺀 값은" + (x - 10) + "입니다.");

	}

}
