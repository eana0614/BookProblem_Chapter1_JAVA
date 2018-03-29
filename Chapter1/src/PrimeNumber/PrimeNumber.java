package PrimeNumber;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("1~1000 ������ ���� �� �Ҽ� ���ϱ�");
		
		int lineCount = 0;
		int count = 0;
		
		for(int i=1; i<=1000; i++) {
			if(isPrimeNum(i)) {
				System.out.print(i+"\t");
				lineCount++;
				count++;
				if(lineCount > 10) {
					System.out.println();
					lineCount = 0;
				}
			}
		}
		
		System.out.println();
		System.out.println("1~1000������ �Ҽ� ���� : "+count);
		
	}

	private static boolean isPrimeNum(int i) {
		
		boolean result = true;
	
		for(int j=2; j<i; j++) {
			if(i%j == 0) {
				result = false;
			}
		}
		
		return result;
	}

}
