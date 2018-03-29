package GCD;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int mode = -1;
		
		System.out.println("[1] ������ ��� ���ϱ�, [2] 2���� ���ڿ��� �������� �ش��ϴ� ��� ���ϱ�, [3] 2���� ������ �ִ����� ���ϱ�, [0] ������ ");
		mode = scanner.nextInt();
		
		while (mode > 0 && mode < 4) {
			
			if(mode == 1) {
				System.out.print("!] ���� 1���� �Է����ּ��� : ");
				int num = scanner.nextInt();
				findCD(num);
				
			}else if(mode == 2) {
				System.out.print("!] ���� 2���� �Է����ּ��� : ");
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				findCDTwoNum(num1, num2);
			}else {
				System.out.print("!] ���� 2���� �Է����ּ��� : ");
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
