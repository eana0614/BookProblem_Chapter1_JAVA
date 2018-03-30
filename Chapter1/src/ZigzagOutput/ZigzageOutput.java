package ZigzagOutput;

public class ZigzageOutput {
	
	static int MAX = 50;
	static int ElementNum = 10;

	public static void main(String[] args) {
		
		int lineNum = MAX/ElementNum;
		
		for(int i=1; i<=lineNum; i++) {
			
			if(i%2 != 0) {
				printOddLine(i*ElementNum);
			}else {
				printEvenLine(i*ElementNum);
			}
			System.out.println();
		}
	}

	private static void printEvenLine(int i) {
		
		for(int j=i; j>i-ElementNum; j--) {
			System.out.print(j+"\t");
		}
	}

	private static void printOddLine(int i) {
		
		for(int j=i-ElementNum+1; j<=i; j++) {
			System.out.print(j+"\t");
		}

	}

}
