package day03_if_;

import java.util.Scanner;

public class Quiz_2조 {

	public static void main(String[] args) {
		
//		Q1) 5과목 합격 불합격
//			1과목, 2과목, 3과목, 4과목, 5과목 까지 있는 시험을 치른다.
//			한 과목이라도 60점 미만인 경우 "불합격입니다."를 출력하고
//			총점이 400점 이상이면 "합격입니다!"를 출력하시오.

		Scanner input = new Scanner(System.in);
//		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
//		int sum = n1 + n2 + n3 + n4 + n5;
//		System.out.print("1과목 점수: ");
//		n1 = input.nextInt();
//		System.out.print("2과목 점수: ");
//		n2 = input.nextInt();
//		System.out.print("3과목 점수: ");
//		n3 = input.nextInt();
//		System.out.print("4과목 점수: ");
//		n4 = input.nextInt();
//		System.out.print("5과목 점수: ");
//		n5 = input.nextInt();
//		
//		if(n1 < 60 || n2 < 60 || n3 < 60 || n4 < 60 || n5 < 60) {
//			System.out.println("불합격입니다.");
//		}else {
//			System.out.println("합격입니다!");
//		}
		
		
//		Q2) 점수와 학년을 입력했을때 합격 불합격 여부
//		    조건 
//		    -점수가 60점 이상면 합격 그렇지 않으면 불합격 출력
//          -단, 4학년을 입력했을때는 70점 이상이여야 합격이다
		
//		System.out.print("점수 입력: ");
//		int score = input.nextInt();
		
//		System.out.print("학년 입력: ");
//		int grade = input.nextInt();
//		
//		if(score >= 60) {
//			if(grade != 4) {
//				System.out.println("합격");
//			}else if(score >= 70){
//				System.out.println("합격");
//			}else {
//				System.out.println("불합격");
//			}
//		}else {
//			System.out.println("불합격");
//		}
		
		
//		 ?Q3) 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//		 	 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//			 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
//			 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
//			 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//			
//			 입력)
//			 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//			
//			 출력)
//			 첫째 줄에 윤년이면 1, 아니면 0을 출력한다
//			
//			
//			 예시)
//			 예제 입력) 2000       예제 출력) 1
//			 예제 입력) 1999       예제 출력) 0
//			 예제 입력) 1900       예제 출력) 0
//			 예제 입력) -500        예제 출력) 1~4000사이를 입력하세요 

//		System.out.print("입력: ");
//		int year = input.nextInt();
		
//		Q4) 현재 년도를 입력합니다.
//			나이를 입력합니다.
//			태어난 년대를 구합니다.
//
//			EX)
//			입력 : 현재 년도 2024년
//			입력 : 나이 28살
//			출력 : 1990년대에 태어났습니다.
		
	
		System.out.print("현재 년도 입력: ");
		int year = input.nextInt();
		
		System.out.print("나이 입력: ");
		int age = input.nextInt();
		
		int birth = (year - age);
		
		if ((birth / 10) * 10 == 2000) {
			System.out.println("2000년대에 태어났습니다.");
		}else if((birth / 10) * 10 == 1990) {
			System.out.println("1990년대에 태어났습니다.");
		}else if((birth / 10) * 10 == 1980) {
			System.out.println("1980년대에 태어났습니다.");
		}else {
			System.out.println("1970년대에 태어났습니다.");
		}
	}

}
