package chap02;

import java.util.Scanner;

public class Chap_2_8 {

	public static void main(String[] args) {

// 		2개의 실숫값을 입력받아 그 합과 평균을 구하는 프로그램을 작성
//		실행 결과 - x값 : 9.75 / y값 : 2.5 / 합계는 ooo 입니다. / 평균은 ooo 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		System.out.println("x값 : " + x);
		System.out.println("y값 : " + y);
		System.out.println("합계는" + (x + y) + "입니다.");
		
		System.out.println("평균은" + (x + y)/2 + "입니다.");

	}

}
