package chap02;

import java.util.Scanner;

public class Chap_2_9 {

	public static void main(String[] args) {

// 		삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램을 작성.
//		실행결과 - 삼각형의 넓이를 구합니다. / 밑변 : 6.5 / 높이 : 3.5 / 넓이는 11.375입니다.
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		System.out.println("밑변 : " + x);
		System.out.println("높이 : " + y);
		System.out.println("넓이는 : " + (x * y) / 2 + "입니다.");
		


	}

}
