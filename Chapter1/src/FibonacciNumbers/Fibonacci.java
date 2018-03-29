package FibonacciNumbers;

import java.util.Scanner;

// F(n) = F(n-1) + F(n-2)

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출력할 피보나치 수열의  끝 번호를 입력해주세요 : ");
		int end = scanner.nextInt();
		
		int value1 = 1;
		int value2 = 0;
		
		for(int i= 0; i<end; i++) {
			
			int valueN = value1 + value2;
			
			if(i % 5 == 0) {
				System.out.println();
			}
			
			System.out.print("("+(i+1)+") "+valueN+"\t");
			
			value2 = value1;
			value1 = valueN;
		}

	}

}
