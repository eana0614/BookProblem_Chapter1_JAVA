package MultiplesAndSum;

import java.util.Scanner;

public class TheNumberOfMultiplesAndSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 숫자를 입력해 주십시오. : ");
		int num = scanner.nextInt();
		
		int sum = 0;
		int count = 0;
		
		for(int i=1; i<=1000; i++) {
			if(i%num == 0) {
				count++;
				sum += i;
			}
		}
		
		System.out.println("숫자 ("+num+") 의 배수의 갯수 : "+count);
		System.out.println("숫자 ("+num+") 의 배수의 합 : "+sum);
	}

}
