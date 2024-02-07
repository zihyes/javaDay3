package day03_if_;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) 두 수를 입력 받아 큰 수를 출력
		Scanner input = new Scanner(System.in);
		int n1 = 0, n2 = 0 , n3 = 0;
		System.out.print("두 수 입력(공백 구분): ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		if( n1 > n2 ) {
			System.out.println("n1이 n2보다 크다");
		}
		if( n1 < n2 ) {
			System.out.println("n2가 n1보다 크다");
		}
		if( n1 == n2) {
			System.out.println("n1과 n2는 같다");
		}
		
		// 2) 세 수를 입력 받아 큰수를 출력
		System.out.print("세 수 입력: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		if(n1 > n2 && n1 > n3) {
			System.out.println("n1이 가장 크다");
		}
		if(n2 > n1 && n2 > n3) {
			System.out.println("n2가 가장 크다");
		}
		if(n3 > n1 && n3 > n2) {
			System.out.println("n3가 가장 크다");
		}
		// 새로운 변수 지정 ex.max
		  int max = 0;
	      if(n1 > n2) {
	         max = n1;
	      }
	      if(n2 > n1) {
	         max = n2;
	      }
	      if(n3 > max) {
	         max = n3;
	      }
	      System.out.println("가장 큰 수 : "+max);
	}

}
