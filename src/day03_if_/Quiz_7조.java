package day03_if_;

import java.util.Scanner;

public class Quiz_7조 {

	public static void main(String[] args) {
		
//		Q1)달러 환전 프로그램을 작성하세요
//			1.환전하실 단위 선택지를 먼저 작성하세요(원하는 단위를 선택하지 않으면 다시 선택하게끔 해주세요)
//			2. 환율은 1달러 1326원입니다
//			3.소수점 없이 정수만 사용하세요
		
//			[출력화면]
//			환전하실 단위를 선택하세요(1-달러, 2-원화)
//			5
//			잘못 입력하셨습니다. 다시 입력해주세요.
//			환전하실 단위를 선택하세요(1-달러, 2-원화)
//			6
//			잘못 입력하셨습니다. 다시 입력해주세요.
//			환전하실 단위를 선택하세요(1-달러, 2-원화)
//			2
//			얼마를 환전 하시겠습니까? 
//			30000
//			30000원을 환전하시면 22달러입니다.
		
		Scanner input = new Scanner(System.in);
		
//		Q2) 나이를 입력하여 다음 결과 값을 출력하는 프로그램을 작성하세요.
//			10대(미성년자 입니다.) 몇 살뒤에는 어른이 됩니다.
//			20~90대 어른 입니다. 각 메시지표기/ 100살 이상 존재하지 않습니다.
		
//		Q3) 1. 각각의 문자열 2진수를 정수로 형변환하여 num1...4 변수에 대입하시오.[integer...]
//			2. 형변환한 2진수를 출력하시오.
//			2. 정수형 변수 result1과 result2를 만드시오
//			3. result1에 num1과 num2를 &(AND) 연산자로 계산하여 대입하시오.
//			4. result1에 num3과 num4를 |(or)  연산자로 계산하여 대입하시오.
//			5. if문을 사용하여 result1과 result2의 크기를 비교하여 큰 수, 작은 수로 출력하시오.
//					
//			String ezinsu1 = "00001111";
//			String ezinsu2 = "00000011";
//			String ezinsu3 = "00010011";
//			String ezinsu4 = "00011100";
//			
//			1번 힌트 : int num1 = Integer.p...(문자형 변수명, 2);   뒤에 2는 2진수로 변환을 뜻함
//			2번 힌트 : System.out.println("형변환한 2진수 : " + 변수);
//			3번 힌트 : int result = 변수 & 변수;
//			4번 힌트 : int result = 변수 | 변수;
//			5번 힌트 : X


	} 

}
//1번 문제 정답
//package if_;
//
//import java.util.Scanner;
//
//public class Quiz02 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int won, choice, dollar, exchange;
//
//		while(true) { // while - true 무한루프
//			System.out.println("환전하실 단위를 선택하세요(1-달러, 2-원화)");
//			choice = sc.nextInt();
//		if(choice == 1) {
//			System.out.println("얼마를 환전 하시겠습니까? ");
//			dollar = sc.nextInt();
//			exchange = dollar * 1326;
//			won =+ exchange;
//			System.out.println(dollar + "달러를 환전하시면 " + won + "원입니다");
//			break; // 무한루프를 빠져나온다
//		}else if(choice == 2) {
//			System.out.println("얼마를 환전 하시겠습니까? ");
//			won = sc.nextInt();
//			exchange = won / 1326 ;
//			dollar =+ exchange;
//			System.out.println(won + "원을 환전하시면 " + dollar + "달러입니다");
//			break; // 무한루프를 빠져나온다
//		}else {
//			System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
//			
//		}
//		}
//		
//	}
//
//}
//
//2번 문제 정답
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("나이를 입력하세요: ");
//        int age = scanner.nextInt();
//
//        // if-else 문을 사용하여 나이를 판단합니다.
//        if (age < 20) {
//            System.out.println("10대 미성년자 입니다. " + (20 - age) + "살 후에 어른이 됩니다.");
//        } else if (age < 30) {
//            System.out.println("20대 입니다.");
//        } else if (age < 40) {
//            System.out.println("30대 입니다.");
//        } else if (age < 50) {
//            System.out.println("40대 입니다.");
//        } else if (age < 60) {
//            System.out.println("50대 입니다.");
//        } else if (age < 70) {
//            System.out.println("60대 입니다.");
//        } else if (age < 80) {
//            System.out.println("70대 입니다.");
//        } else if (age < 90) {
//            System.out.println("80대 입니다.");
//        } else if (age < 100) {
//            System.out.println("90대 입니다.");
//        } else {
//            System.out.println("100살은 존재하지 않습니다.");
//        }
//    }
//}
//
//3번 문제 정답
//String ezinsu1 = "00001111";
//      String ezinsu2 = "00000011";
//      String ezinsu3 = "00010011";
//      String ezinsu4 = "00011100";
//        
//
//        int num1 = Integer.parseInt(ezinsu1, 2);
//        int num2 = Integer.parseInt(ezinsu2, 2);
//        int num3 = Integer.parseInt(ezinsu3, 2);
//        int num4 = Integer.parseInt(ezinsu4, 2);
//        
//        
//        System.out.println("형변환한 2진수: " + num1);
//        System.out.println("형변환한 2진수: " + num2);
//        System.out.println("형변환한 2진수: " + num3);
//        System.out.println("형변환한 2진수: " + num4);
//        
//        System.out.println();
//        System.out.println();
//        
//        int result1 = num1 & num2;
//        int result2 = num3 | num4;
//        
//        System.out.println(result1);
//        System.out.println(result2);
//        
//        System.out.println();
//        System.out.println();
//        
//        if (result1 > result2) {
//            System.out.println(result1 + "은 큰 수입니다.");
//            System.out.println(result2 + "은 작은 수입니다.");
//        } else if (result1 < result2) {
//            System.out.println(result2 + "은 큰 수입니다.");
//            System.out.println(result1 + "은 작은 수입니다.");
//        } else {
//            System.out.println("두 수가 같습니다.");
//        }
//        System.out.println();
//        System.out.println("축하합니다!!");
//	}
//
//}
