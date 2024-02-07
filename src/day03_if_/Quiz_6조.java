package day03_if_;

import java.util.Scanner;

public class Quiz_6조 {

	public static void main(String[] args) {
		
//		?Q1) 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
//
//			1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//			2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//			3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
//			
//			예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//			3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
//			
//			입력: 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
//			출력: 첫째 줄에 게임의 상금을 출력 한다.
//			
//			예제 입력1:  3 3 6	 예제 출력1: 1300
//			예제 입력2:  2 2 2  예제 출력2: 12000  
//			예제 입력3:  6 2 5  예제 출력2:   600

		
		Scanner input = new Scanner(System.in);

//        //3번의 주사위 입력을 받음
//        System.out.println("주사위 값을 3번 입력하세요: ex) 1 2 3 ");
//        int dice1 = input.nextInt();
//        int dice2 = input.nextInt();
//        int dice3 = input.nextInt();
//
//        //주사위의 눈이 모두 같은 경우 ex) dice1=2 dice2=2 dice3=2
//        if ((dice1 == dice2) && (dice1 == dice3) && (dice2 == dice3)) {
//            System.out.println(10000 + dice1 * 1000);
//        }
//        //주사위 눈이 2개만 같은 경우 ex) dice1=2 dice2=2 dice3=4
//        else if ((dice1 == dice2) || (dice1 == dice3) || (dice2 == dice3)) {
//
//            //어떤 주사위가 같은 값을 가졌는지 확인
//            int sameValue;
//
//            if (dice1 == dice2) {
//                sameValue = dice1;
//            } else if (dice1 == dice3) {
//                sameValue = dice1;
//            } else {
//                sameValue = dice2; //dice2 = dice3 인 경우이기 때문에 dice2 or dice3 값을 넣으면 됨
//            }
//
//            System.out.println(1000 + sameValue * 100);
//        }
//        //주사위 눈이 모두 다른 경우
//        else {
//
//            //주사위 가장 큰 값
//            int maxValue;
//
//            if (dice1 > dice2) {
//
//                maxValue = dice1;
//                if (maxValue > dice3) {
//                    System.out.println(maxValue * 100);
//                }
//                else{
//                    maxValue = dice3; //dice3 > dice1이기 때문에 maxValue 변경
//                    System.out.println(maxValue * 100);
//                }
//            }
//            // dice1 < dice2인 경우
//            else{
//
//                maxValue = dice2;
//                if (maxValue > dice3) {
//                    System.out.println(maxValue * 100);
//                }
//                else{
//                    maxValue = dice3; //dice3 > dice1이기 때문에 maxValue 변경
//                    System.out.println(maxValue * 100);
//                }
//            }
//        }
		
//		?Q2) 메뉴판을 출력 후 금액을 입력 받은 뒤 메뉴를 선택하면 거스름돈과 주문한 메뉴가 출력된다.
//			------- 메뉴판 -------
//			1. 햄버거(9,000원)
//			2. 피자(11,000원)
//			3. 치킨(32,000원)
//			4. 금액 반환
//			-----------------------
//			※ 만약 금액을 입력했을 때 가장 저렴한 금액의 메뉴보다 적은 금액이 입력되었다면, "주문할 수 있는 메뉴 없음 xxxx원 반환" 을 출력
//			※ 투입 금액보다 비싼 음식을 선택하는 경우 "투입 금액이 부족합니다. xxxx원 반환" 을 출력
//			※ 메뉴판에 없는 메뉴 선택 시 "올바른 주문이 아닙니다. xxxx원 반환" 을 출력
//			※ 메뉴를 선택할때 4번을 선택 시 "투입 금액 xxxx원 반환" 을 출력
//			
//			※ 주문 시 ( 1. 포장, 2. 매장식사 ) 선택지를 출력하여 선택하게한 뒤 최종 메세지는 아래와 같이 출력한다
//			( 1, 2 외에 다른 숫자 선택 시 "선택 오류 xxxx원 반환" 을 출력 )
//			-----------------------
//			주문 메뉴 : xxxx
//			포장 or 매장식사
//			거스름돈 : xxxx원
//			-----------------------
		System.out.println("-------메뉴판-------");
		System.out.println("1. 햄버거(9,000원)");
		System.out.println("2. 피자(11,000원)");
		System.out.println("3. 치킨(32,000원)");
		System.out.println("4. 금액 반환");
		System.out.println("--------------------");
		
		int coin = 0;
		int menunum = 0;
		int menucost = 0;
		String menuname = null;
		int wherenum = 0;
		String where = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 투입하세요 : ");
		coin = sc.nextInt();
		
		if (coin >= 9000) {
			
			System.out.print("메뉴를 선택하세요 : ");
			menunum = sc.nextInt();
			
			if (menunum == 1) {
				menucost = 9000;
				menuname = "김치찌개";
			}else if (menunum == 2) {
				menucost = 11000;
				menuname = "피자";
			}else if (menunum == 3) {
				menucost = 32000;
				menuname = "치킨";
			}
			
			if (menunum < 1 && menunum > 4) {
				System.out.printf("올바른 주문이 아닙니다. %d원 반환\n", coin);
			}else if (menucost > coin){
				System.out.printf("투입 금액이 부족합니다. %d원 반환\n", coin);
			}else if (menunum >= 1 && menunum <= 3){
				System.out.print("식사 방식을 선택하세요. (1. 포장, 2.매장식사)");
				wherenum = sc.nextInt();
				
				if (wherenum != 1 && wherenum != 2) {
					System.out.printf("선택 오류 %d원 반환\n", coin);
				}else {
					if(wherenum == 1) {
						where = "포장";
					}else {
						where = "매장식사";
					}
					
					System.out.println("------------------");
					System.out.printf("주문 메뉴 : %s\n", menuname);
					System.out.println(where);
					System.out.printf("거스름돈 : %d원\n", (coin - menucost));
					System.out.println("------------------");
					
				}
				
			}else if (menunum == 4)	System.out.printf("투입 금액 %d원 반환", coin);
			
		}else {
			System.out.printf("주문할 수 있는 메뉴 없음 %d원 반환\n", coin);
		}
		
//		?Q3) 짱구는 약속 시간에 맨날 늦는다.
//			그래서 약속 시간 보다 25분 빨리 알람을 맞출 것이다.
//			* 약속 시간을 입력하면, 약속 시간 25분 전의 시간을 출력해주는 프로그램을 만드세요
//			
//			[조건]
//			1. 00시 00분의 형식으로 시간을 입력한다.
//			2. 시각(hour) 은 00시~23시 사이에만 존재하며,
//			    분(minute) 은 00분~59분 사이에만 존재한다.
//			 (이외의 시간이 입력되면 "시각[00시-23시] 분[0분-59분]이내의 범위로 다시 적어주세요"라고 출력한다)
//			3. 알람 출력 형태는 "XX시 XX분에 알람을 맞추겠습니다"이다.
//			 (단, 00시 00분~00시 24분 사이의 시간을 입력하면
//			   "전날 23시 XX분에 알람을 맞추겠습니다" 라고 출력한다)
		
		 System.out.print("약속 시간을 입력하세요(00시 00분): ");
	        int hour = sc.nextInt();
	        int minute = sc.nextInt();

	        //시간이 24이상이거나 음수 일 때
	        if(hour<0 || hour>23 || minute<0 || minute>=60) {
	        	System.out.println("시각[00시-23시] 분[0분-59분]이내의 범위로 다시 적어주세요");
	        }
	        
	        //minute이 25분보다 작은경우, hour에 변화가 생김
	        if( minute>= 0 && minute < 25 ){
	            
	        	//hour가 01시~23시 사이일 때 => hour-1 
	            if(hour>00 && hour<=23){
	                hour--;
	                minute = 60 - (25 -minute);
	                System.out.printf(hour+"시 "+minute+ "분에 알람을 맞추겠습니다.");
	            }
	            //hour가 00일 때 => 23시로 바꿔줘야 함
	            else if (hour==00){
	                hour = 23;
	                minute = 60 - (25 - minute);
	                System.out.printf("전날 "+ hour+"시 "+minute+ "분에 알람을 맞추겠습니다.");
	            }
	            
	        //minute이 25분~60분, hour는 그대로
	        }else if( minute >= 25 && minute <= 59 ){
	            minute = minute - 25;
	            System.out.printf(hour+"시 "+minute+ "분에 알람을 맞추겠습니다.");
	        }
		
    }
}
