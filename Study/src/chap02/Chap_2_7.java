package chap02;

import java.util.Scanner;

public class Chap_2_7 {

	public static void main(String[] args) {

// 		키보드에서 입력한 정숫값에서 마지막 자릿수를 제외한 값과 마지막 자릿수 값만 표시하는 프로그램을 작성
//		실행 결과 - 정숫값 : 1275 / 마지막 자릿수를 제외한 값은 127입니다. / 마지막 자릿수는 5입니다.
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("마지막 자릿수를 제외한 값은" + (x / 10) + "입니다.");
		System.out.println("마지막 자릿수는" + (x % 10) + "입니다.");
		
	}
}
