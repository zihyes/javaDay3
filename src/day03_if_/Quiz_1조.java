package day03_if_;

import java.util.Scanner;

public class Quiz_1조 {

	public static void main(String[] args) {
//		Q1) 입력받은 수가 양수인지 음수인지 판단하는 프로그램을 작성하세요.
//
//			출력예)
//			정수를 입력하세요 : 7
//			7은 양수입니다.
//
//			정수를 입력하세요 : -7
//			-7은 음수입니다.
		
		Scanner input = new Scanner(System.in);
//		System.out.print("정수를 입력하세요: ");
//		int num = input.nextInt();
//		
//		if(num > 0) {
//			System.out.println(num + "은 양수입니다.");
//		}else if(num < 0) {
//			System.out.println(num + "은 음수입니다.");
//		}else {
//			System.out.println(num + "은 0입니다.");
//		}
		
//		Q2) 두 수를 입력 받아 아래 기능을 수행하는 계산기를 만드시오.
//		1.덧셈
//		2.뺄셈
//		3.곱셈
//		4.나눗셈
//		5.나머지
		
//		System.out.println("계산기입니다.");
//		System.out.println("1.덧셈");
//		System.out.println("2.뺄셈");
//		System.out.println("3.곱셈");
//		System.out.println("4.나눗셈");
//		System.out.println("5.나머지");
//		System.out.print("원하시는 기능의 숫자를 입력해주세요: ");
//		
//		int num = input.nextInt();
//		int num1 = 0, num2 = 0, result = 0;
//		if(num == 1) {
//			System.out.println("덧셈을 진행할 두개의 값을 입력해주세요.");
//			System.out.print("첫번째 값: ");
//			num1 = input.nextInt();
//			System.out.print("두번째 값: ");
//			num2 = input.nextInt();
//			result = num1 + num2;
//			System.out.println("결과값: " + result);
//		}else if(num == 2) {
//			System.out.println("뺄셈을 진행할 두개의 값을 입력해주세요.");
//			System.out.print("첫번째 값: ");
//			num1 = input.nextInt();
//			System.out.print("두번째 값: ");
//			num2 = input.nextInt();
//			result = num1 - num2;
//			System.out.println("결과값: " + result);
//		}else if(num == 3) {
//			System.out.println("곱셈을 진행할 두개의 값을 입력해주세요.");
//			System.out.print("첫번째 값: ");
//			num1 = input.nextInt();
//			System.out.print("두번째 값: ");
//			num2 = input.nextInt();
//			result = num1 * num2;
//			System.out.println("결과값: " + result);
//		}else if(num == 4) {
//			System.out.println("몫을 구하는 연산입니다.");
//			System.out.print("첫번째 값: ");
//			num1 = input.nextInt();
//			System.out.print("두번째 값: ");
//			num2 = input.nextInt();
//			result = num1 / num2;
//			System.out.println("결과값: " + result);
//		}else if(num == 5) {
//			System.out.println("나머지를 구하는 연산입니다");
//			System.out.print("첫번째 값: ");
//			num1 = input.nextInt();
//			System.out.print("두번째 값: ");
//			num2 = input.nextInt();
//			result = num1 % num2;
//			System.out.println("결과값: " + result);
//		}else {
//			System.out.println("해당하는 기능이 없습니다");
//		}
		
//		Q3) 문자열을 입력받아 , 입력받은 문자열 안에 a가 포함되어있는지 여부를 출력하는 문제를 만드시오.(str.contains(String) ) 
		System.out.print("문자열 입력: ");
		String str = input.next();
		
		if(str.contains("a")) {
			System.out.println("O");
		}
		else {
			System.out.println("x");
		}
	
	}

}
