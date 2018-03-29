package GCD;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int mode = -1;
		
		System.out.println("[1] 숫자의 약수 구하기, [2] 2개의 숫자에서 공통으로 해당하는 약수 구하기, [3] 2개의 숫자의 최대공약수 구하기, [0] 끝내기 ");
		mode = scanner.nextInt();
		
		while (mode > 0 && mode < 4) {
			
			if(mode == 1) {
				System.out.print("!] 숫자 1개를 입력해주세요 : ");
				int num = scanner.nextInt();
				findCD(num);
				
			}else if(mode == 2) {
				System.out.print("!] 숫자 2개를 입력해주세요 : ");
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				findCDTwoNum(num1, num2);
			}else {
				System.out.print("!] 숫자 2개를 입력해주세요 : ");
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				findGCDTWoNum(num1, num2);
			}
		}
		
		if(mode >=4) {
			System.err.println("!] Range Input Error");
		}else {
			System.out.println("---------------------------");
		}
		
	}

}
