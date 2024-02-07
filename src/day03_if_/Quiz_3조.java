package day03_if_;

import java.util.Scanner;

public class Quiz_3조 {

	public static void main(String[] args) {
//		Q1) 한국초등학교에서 학년별 대표가 국어, 영어, 수학시험을 본다. 1,2,3학년은 평균이 65점 이상이면 합격이고
//			4,5학년은 평균 75점 이상이면 합격, 6학년은 80점 이상이어야지 합격이다.
//			학년과 시험 점수를 입력하고 합격일 시 "합격입니다."를 출력하고,
//			불합격 일시 평균 점수가 몇 점 미달인지를 알려주는 "OO점 미달로 불합격입니다"를 출력하시오.
		
		Scanner input = new Scanner(System.in);
//		int grade, kor, eng, mat;
//		
//		System.out.print("학년 입력: ");
//		grade = input.nextInt();
//		System.out.print("국어 점수 입력: ");
//		kor = input.nextInt();
//		System.out.print("영어 점수 입력: ");
//		eng = input.nextInt();
//		System.out.print("수학 점수 입력: ");
//		mat = input.nextInt();
//		
//		int sum = ( kor + eng + mat );
//		double avg = ( kor + eng + mat ) / 3.0;
//		
//		System.out.println("총점: " + sum);
//		System.out.println("평군: " + avg);
//		if(grade == 1 || grade == 2 || grade ==3) {
//			if(avg >= 65) {
//				System.out.println("합격입니다.");
//			}else {
//				System.out.println(65 - avg +"점 미달로 불합격입니다.");
//			}
//		}if(grade == 4 || grade == 5) {
//			if(avg >= 75) {
//				System.out.println("합격입니다.");
//			}else {
//				System.out.println(75 - avg + "점 미달로 불합격입니다.");
//			}
//		}if(grade == 6) {
//			if(avg >= 80) {
//				System.out.println("합격입니다.");
//			}else {
//				System.out.println(80 - avg + "점 미달로 불합격입니다.");		
//			}
//		}
		
//		?Q2) 오늘은 5월 1일 수요일입니다.
//			사용자 입력으로 일수를 받고 n일 뒤 무슨 요일인지 출력하세요.
//			단,0보다 작거나 31이상의 숫자는 '1이상 30이하의 숫자를 입력해주세요' 문구 출력
//			(2024년 5월과 일수-요일이 같으니 달력으로 올바른지 확인 가능)
//		int day = 0;
//		System.out.print("며칠 뒤의 요일이 궁금한가요?(숫자만 입력): ");
//		day = input.nextInt();
//		
//		if(day < 0 || day >= 31) {
//			System.out.println("1이상 30이하의 숫자를 입력해주세요.");
//		}else {
//			if(day % 7 == 0) {
//				System.out.println(day + "일뒤는 "+ (day + 1) + "일로 수요일입니다.");
//			}else if(day % 7 == 1) {
//				System.out.println(day + "일뒤는 " + (day + 1) + "일로 목요일입니다.");
//			}else if(day % 7 == 2) {
//				System.out.println(day + "일뒤는 " + (day + 1) + "일로 금요일입니다.");
//			}else if(day % 7 == 3) {
//				System.out.println(day + "일뒤는 " + (day + 1) + "일로 토요일입니다.");
//			}else if(day % 7 == 4) {
//				System.out.println(day + "일뒤는 " + (day + 1) + "일로 일요일입니다.");
//			}else if(day % 7 == 5) {
//				System.out.println(day + "일뒤는 " + (day + 1) + "일로 월요일입니다.");
//			}else if(day % 7 == 6) {
//				System.out.println(day + "일뒤는 " + (day + 1) + "일로 화요일입니다.");
//			}
//		}
		
//		Q3) 수학점수가 90점 이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점",
//			60점 이상이면 "D학점", 나머지 "F학점"
		
		int mat;
		System.out.print("수학 점수 입력: ");
		mat = input.nextInt();
		
		if(mat >= 90) {
			System.out.println("A학점");
		}else if(mat >= 80) {
			System.out.println("B학점");
		}else if(mat >= 70) {
			System.out.println("C학점");
		}else if(mat >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
	}

}
