package MultiplesAndSum;

import java.util.Scanner;

public class TheNumberOfMultiplesAndSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ ���ڸ� �Է��� �ֽʽÿ�. : ");
		int num = scanner.nextInt();
		
		int sum = 0;
		int count = 0;
		
		for(int i=1; i<=1000; i++) {
			if(i%num == 0) {
				count++;
				sum += i;
			}
		}
		
		System.out.println("���� ("+num+") �� ����� ���� : "+count);
		System.out.println("���� ("+num+") �� ����� �� : "+sum);
	}

}
