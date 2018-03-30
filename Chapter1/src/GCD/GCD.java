package GCD;

import java.util.Scanner;

public class GCD {
	
	static int count = 0;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int mode = -1;
		
		System.out.println("[1] ������ ��� ���ϱ�, [2] 2���� ���ڿ��� �������� �ش��ϴ� ��� ���ϱ�, [3] 2���� ������ �ִ����� ���ϱ�, [4] ����Լ��� �ִ����� ���ϱ�, [0] ������ ");
		mode = scanner.nextInt();
		
		while (mode > 0 && mode < 5) {
			
			if(mode == 1) {
				System.out.print("!] ���� 1���� �Է����ּ��� : ");
				int num = scanner.nextInt();
				findCD(num);
				
			}else if(mode == 2) {
				System.out.print("!] ���� 2���� �Է����ּ��� : ");
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				findCDTwoNum(num1, num2);
			}else if(mode == 3){
				System.out.print("!] ���� 2���� �Է����ּ��� : ");
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				findGCDTWoNum(num1, num2);
			}else {
				System.out.print("!] ����Լ��� �ִ� ������� ���մϴ�. ���� 2���� �Է����ּ���. : ");
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				int result = findGDCUseRecursive(num1, num2);
				System.out.println(count+"ȸ �ݺ� : "+result);
			}
			
			System.out.println();
			System.out.println("[1] ������ ��� ���ϱ�, [2] 2���� ���ڿ��� �������� �ش��ϴ� ��� ���ϱ�, [3] 2���� ������ �ִ����� ���ϱ�, [4] ����Լ��� �ִ����� ���ϱ�, [0] ������ ");
			mode = scanner.nextInt();
		}
		
		if(mode > 4) {
			System.err.println("!] Range Input Error");
		}else {
			System.out.println("---------------------------");
		}
		
	}

	private static int findGDCUseRecursive(int num1, int num2) {
		
		count++;
		
		if(num2 != 0) {
			return findGDCUseRecursive(num2, num2%num1);
		}else {
			return num1;
		}
		
	}

	private static void findGCDTWoNum(int num1, int num2) {
		int num = num1 > num2 ? num1 : num2;
		
		int result = -1;
		
		for(int i=1; i<=num; i++) {
			if(num1%i == 0 && num2%i == 0 && result < i) {
				result = i;
			}
		}
		
		System.out.println("�ִ����� : "+result);
	}

	private static void findCDTwoNum(int num1, int num2) {
		
		int num = num1 > num2 ? num1 : num2;
		
		for(int i=1; i<= num; i++) {
			 if(num1%i == 0 && num2%i== 0) {
				 System.out.print(i+" ");
			 }
		}
		System.out.println();
	}

	private static void findCD(int num) {
		
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

}
