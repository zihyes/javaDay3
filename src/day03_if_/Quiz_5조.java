package day03_if_;

import java.util.Scanner;

public class Quiz_5조 {
	public static void main(String[] args) {		
		
//		?Q1) 나이와 금액을 입력받고 영화표를 구매할 수 있는지 
//			알 수 있는 프로그램을 만드시오.
//			영화는 13,000원이며 10세 ~ 15세 어린이표가 있고
//			15000원이며 모두 시청 가능 19세 성인표가 있다.
		
		Scanner input = new Scanner(System.in);
//		int age, price;
//		System.out.print("나이 입력:");
//		age = input.nextInt();
//		
//		System.out.print("금액 입력:");
//		price = input.nextInt();
//		
//		if(age >= 10 && age <= 15) {
//			if(price >= 13000) {
//				System.out.println("어린이표 구매");
//			}else {
//				System.out.println("표를 구매할 수 없습니다.");
//			}
//		}if(age >= 19) {
//			if(price >= 15000) {
//				System.out.println("성인표 구매");
//			}else {
//				System.out.println("표를 구매할 수 없습니다.");
//			}
//	
//		}	
		
//		?Q2) 600kg을 담을 수 있는 컨테이너에 물건을 모두 실으려고 한다. 
//			A가 세 물건을 실을 때, 세 물건의 무게를 입력 받고
//			세 물건의 무게 총합과 남은 무게, "가장 무거운 무게는 ~kg입니다"를 출력하시오
//			600kg 초과될 경우 "무게가 600kg를 초과하였습니다. ~kg을 제외하시오" 메세지를 출력하시오
//			
//			출력 예시) 
//			무게를 입력하시오 : 
//			54 78 65
//			
//			세 물건의 무게 총합은 197kg 입니다.
//			남은 무게는 403kg 입니다.
//			가장 무거운 무게는 78입니다.
		
		int w1 = 0, w2 = 0, w3 = 0;
		
		System.out.print("무게 입력: ");
		w1 = input.nextInt();
		w2 = input.nextInt();
		w3 = input.nextInt();
		
		int sum = ( w1 + w2 + w3);
		int remain = (600 - sum);
		
		System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
		System.out.println("남은무게는 " + remain + "kg 입니다.");
		
		if( sum > 600 ) {
			System.out.println("무게가 600kg를 초과하였습니다. " + (sum - 600) + "kg을 제외하시오");
		}else {
			if( w1 > w2 && w1 > w3 ) {
				System.out.println("가장 무거운 무게는 " + w1 + "kg 입니다.");
			}else if(w2 > w3 && w2 > w1 ) {
				System.out.println("가장 무거운 무게는 " + w2 + "kg 입니다.");
			}else if(w3 > w1 && w3 > w2 ) {
				System.out.println("가장 무거운 무게는 " + w3 + "kg 입니다.");
		}
		
		}
		
//		 Q3)국어, 영어, 수학 점수를 입력 받아 평균을 구한 후,
//			평군이 60점 이상이면서 과목 점수가 모두 60점 이상이면 [합격]
//			평균이 60점 이상이지만 과목 점수가 한과목 이상 60점 미만이면 [과락으로 불합격]
//			평균이 60점 미만이면 [평균 미달 불합격]
		
//		int kor, eng, mat;
//		double avg;
//		System.out.print("국어 영어 수학 점수 입력: ");
//		kor = input.nextInt();
//		eng = input.nextInt();
//		mat = input.nextInt();
//		
//		avg = (kor + eng + mat) / 3.0;
//		
//		if(avg >= 60) {
//			if(kor >= 60 && eng >= 60 && mat >= 60) {
//				System.out.println("합격");
//			}else {
//				if(kor < 60) {
//					System.out.print("국어 ");
//				}
//				if(eng < 60) {
//					System.out.print("영어 ");
//				}
//				if(mat < 60) {
//					System.out.print("수학 ");
//				}
//				System.out.println("과락으로 불합격");
//			}
//			}else {
//				System.out.println("평균 미달 불합격");
//			}
//		
	}

}
//2번 소래씨 풀이
//Scanner input = new Scanner(System.in);
//int w1 = 0, w2 = 0, w3 = 0;
//int sum = 0, remain = 0;
//		
//System.out.println("무게를 입력하시오 : ");
//w1 = input.nextInt();
//w2 = input.nextInt();
//w3 = input.nextInt();
//		
//sum = w1 + w2 + w3 ;
//remain = 600 - sum;
//		
//		
//if (sum > 600) {
//	remain = sum - 600;
//	System.out.println("무게가 600kg를 초과하였습니다.");
//	System.out.println(remain + "kg을 제외하시오");
//}
//else if (w1 > w2 && w1 > w3) {
//	System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
//	System.out.println("남은 무게는 " + remain + "kg 입니다.");
//	System.out.println("가장 무거운 물건은 " + w1 + "kg 입니다");
//}
//else if (w2 > w1 && w2 > w3) {
//	System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
//	System.out.println("남은 무게는 " + remain + "kg 입니다.");
//	System.out.println("가장 무거운 물건은 " + w2 + "kg 입니다");
//}
//else {
//	System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
//	System.out.println("남은 무게는 " + remain + "kg 입니다.");
//	System.out.println("가장 무거운 물건은 " + w3 + "kg 입니다");
//}